package com.account.AccountRegistration.controller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.AccountRegistration.dto.DeleteUser;
import com.account.AccountRegistration.dto.RequestUserRegistration;
import com.account.AccountRegistration.dto.UserDetails;
import com.account.AccountRegistration.entity.AccountRegistrationEntity;
import com.account.AccountRegistration.service.AccountRegistrationService;


@RestController
@RequestMapping("/account")
public class AccountRegistrationController {
	
	@Autowired
	AccountRegistrationService accountRegistrationService;
	
	private static final Log logger = LogFactory.getLog(AccountRegistrationController.class);
	/**
	 * registering all the USer
	 * @param requestUserRegistration
	 * @return
	 */
	@PostMapping(value = "/saveUser")
	public String getUserRegistration(@RequestBody RequestUserRegistration requestUserRegistration) {
		
		logger.info("saveUser starts");
		
		accountRegistrationService.userRegistration(requestUserRegistration);
		
		logger.info("saveUser ends");
		return "record sucessfully entered";
		
		
	}
	
	/**
	 * Fetching all the User 
	 * @return list of all the User
	 */
	
	@GetMapping(value = "/getAllUser")
	public List<AccountRegistrationEntity> getAllUser(){
		logger.info("getAllUser starts");
		
		logger.info("getAllUser ends");
		return accountRegistrationService.getUser();
	} 
	
	/*
	 * @GetMapping(value = "/getUserName") public Object getUserName(){
	 * logger.info("getAllUser starts");
	 * 
	 * logger.info("getAllUser ends"); return
	 * accountRegistrationService.getUserNameAndId(); }
	 */
	/**
	 * Deleting user on Id Bases
	 * @param deleteUser
	 * @return String
	 */
	
	@DeleteMapping(value = "/deleteUser")
	public String getDelete(@RequestBody DeleteUser deleteUser ) {
		
	 accountRegistrationService.userDeletation(deleteUser);
		return "Recorded Deleted";
		
	}
	/**
	 * Fetching the user On Id bases
	 * @param deleteUser
	 * @return
	 */
	@GetMapping(value = "/getUserOnId")
	public Optional<AccountRegistrationEntity> getUser(@RequestBody DeleteUser deleteUser ){
		logger.info("getUserOnId starts");
		
		logger.info("getUserOnId ends");
		return accountRegistrationService.getUserOnId(deleteUser);
	}
	
	
	

}
