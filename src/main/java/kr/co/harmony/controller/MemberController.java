package kr.co.harmony.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.harmony.service.MemberService;

@Controller
public class MemberController {
	 
	@Inject
	MemberService Service;
	
	@RequestMapping(value = "login")
	public String login() {
		return "member/login";
	}
}
