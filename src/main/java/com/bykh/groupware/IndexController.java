package com.bykh.groupware;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "content/main";
	}
	
	//근태관리 출퇴근기록 페이지
	@GetMapping("/attendanceManage")
	public String attendanceManage() {
		
		return "attendanceManage";
	}
	
	//근태관리 휴가관리 페이지
	@GetMapping("/vacationManage")
	public String vacationManage() {
		
		return "vacationManage";
	}
}
