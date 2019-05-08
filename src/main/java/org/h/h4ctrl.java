package org.h;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class h4ctrl {

	@RequestMapping(method=RequestMethod.GET)
	public String geth2() {
		System.out.println("0000000000000000000000000000000");
		return "h2";
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String geth3() {
		System.out.println("11111111111111111111111111111");
		return "h2";
	}
}
