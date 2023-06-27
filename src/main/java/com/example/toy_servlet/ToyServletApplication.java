package com.example.toy_servlet;

import javax.servlet.http.HttpServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
@ServletComponentScan
@SpringBootApplication
public class ToyServletApplication extends HttpServlet{

	public static void main(String[] args) {
		SpringApplication.run(ToyServletApplication.class, args);
	}

}
