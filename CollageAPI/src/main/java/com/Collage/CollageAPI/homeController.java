package com.Collage.CollageAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping(value="/")
	public static String welcome() {
		return "index";
	}

}
