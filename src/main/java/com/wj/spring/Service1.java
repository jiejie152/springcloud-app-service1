package com.wj.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Service1 {

	@ResponseBody
	@RequestMapping(value="/")
	public String home() {   
        return "Hello Git2!";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Service1.class,args);
	}

}
