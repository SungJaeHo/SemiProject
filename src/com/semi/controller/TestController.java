package com.semi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping(value = { "/test2.do" })

    String Test()

    {
           return "index" ;

    }
}
