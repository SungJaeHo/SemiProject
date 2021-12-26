package com.semi.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestContorller {

    @RequestMapping(value = { "/test.do" })

    String Test()

    {
           return "index.jsp" ;

    }

}