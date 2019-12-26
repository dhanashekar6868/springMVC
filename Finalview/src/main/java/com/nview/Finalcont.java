package com.nview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Finalcont 
{
	@RequestMapping("/hello")
	public String dp1()
	{
		return "one";
	}
	@RequestMapping("/target")
	public String dp2()
	{
		return "final";
	}

}
