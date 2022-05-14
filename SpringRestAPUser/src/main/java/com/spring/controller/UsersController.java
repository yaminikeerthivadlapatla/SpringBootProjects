package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.main.Users;
import com.spring.service.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService usersService;

	@RequestMapping("/getUsers")
	public ResponseEntity<Object> getAllUsers() {
		return usersService.getAllUsers();
	}
}