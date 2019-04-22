package com.springbootmssqldemo.springbootmssqldemo.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmssqldemo.springbootmssqldemo.service.UserService;
import com.springbootmssqldemo.springbootmssqldemo.service.UserServiceImpl;
import com.springbootmssqldemo.springbootmssqldemo.web.dto.UsersDto;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String SayHello () {
		return "helo";
	} 

	@GetMapping(value ="/UserList")
	public List<UsersDto> getUsersList() {
		System.out.println("Inside [Class : UserController ] [Method : getUsersList ]");
		return userService.findAll(); 
	} 
 	
}


