package com.cognizant.Controller;


import org.springframework.http.ResponseEntity;
import com.cognizant.exception.FeignProxyException;

import feign.FeognException;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;


public class log {

	public static void info(String property){
		
	}
	public static void error(String property){
		
	}
	public static void debug(String property, String token){
	
	}
	public static void debug(String property){
		
	}
	public static void error(String property, FeignProxyException fe){
		
	}
	public static void error(String property, FeignProxyException e){
		
	}
	public static void debug(String property, ResponseEntity<?> responseEntity){
		
	}
	public static void debug(String property, Docket docket){
		
	}
	public static void debug(String property, ApiInfo apiInfo){
		
	}
}
