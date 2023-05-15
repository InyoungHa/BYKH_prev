package com.bykh.groupware;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "content/main";
	}
	
	//근태관리 출퇴근기록 페이지(메인)
	@GetMapping("/attendanceManage")
	public String attendanceManage() {
		
		return "content/attendanceManage";
	}
	
	//근태관리 휴가관리 페이지
	@GetMapping("/vacationManage")
	public String vacationManage() {
		
		return "content/vacationManage";
	}
	
	
	//근태관리 연장근무관리 페이지
		@GetMapping("/overTimeManage")
		public String overTimeManage() {
			
			return "content/overTimeManage";
		}
}
