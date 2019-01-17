package io.pivotal.data.pcc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {

	@GetMapping("/ping")
	public @ResponseBody String ping() {
		return "PONG";
	}

	@GetMapping("/")
	public String gotoHomePage(HttpSession httpSession) {
		System.out.printf("Goto Home Page - Session ID [%s]%n", httpSession.getId());
		return "test";
	}

	@GetMapping("/insertKey0")
	public @ResponseBody String insertKeyZero(HttpSession session) {

		session.setAttribute("KEY-0", "VALUE-0");
		return "Inserted [KEY-0]";
	}

	@GetMapping("/getKey0")
	public @ResponseBody String getKeysValues(HttpSession session) {

		String sessionKeyValue = (String) session.getAttribute("KEY-0");
		return "Value returned -" + sessionKeyValue;
	}

}
