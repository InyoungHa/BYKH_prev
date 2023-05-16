package com.bykh.groupware.sign;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign")
public class SignController {
	//결재 메인 페이지 이동
	@GetMapping("/signMain")
	public String signMain() {
		return "content/sign/signMain";
	}
}
