package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HTMLController {
	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public String helloWorld()
	{
	// The html file name is helloWorldPage.html.
	return "first";
	}
	@RequestMapping(value="/second", method=RequestMethod.GET)
	public String second()
	{
	return "second";
	}
}