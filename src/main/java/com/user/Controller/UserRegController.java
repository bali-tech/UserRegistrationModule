package com.user.Controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.Model.UserReg;
import com.user.Service.UserRegService;


@RestController
@RequestMapping("/userRegistration")
public class UserRegController {
	@Autowired
	UserRegService UserRegService;
	
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addRegistration(@Validated @RequestBody UserReg user) {
		UserReg userResponse = UserRegService.addUser(user);
		return new ResponseEntity<String>("User has been successfully registered into the system. Id is " +userResponse.getUserId(),HttpStatus.OK);
	}
	
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserReg>> fetchAllUser(){
		List<UserReg> userObj = UserRegService.getAllUsers();
		return new ResponseEntity<List<UserReg>>(userObj,HttpStatus.OK);
	}
}
