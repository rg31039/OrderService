package com.account.AccountRegistration.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.account.AccountRegistration.dto.DeleteUser;
import com.account.AccountRegistration.dto.RequestUserRegistration;
import com.account.AccountRegistration.entity.AccountRegistrationEntity;
import com.account.AccountRegistration.repository.AccountRegistrationRepository;
import com.account.AccountRegistration.service.AccountRegistrationService;

@Service
public class AccountRegistrationServiceImpl implements AccountRegistrationService {
	
	@Autowired
	AccountRegistrationRepository accountRegistrationRepository;
	
	
	
	public static final Log logger =LogFactory.getLog(AccountRegistrationServiceImpl.class); 
		
	
	public String userRegistration(RequestUserRegistration requestUserRegistration) {
		
		logger.info("Service starts");
		AccountRegistrationEntity accountRegistrationEntity= new AccountRegistrationEntity();
		accountRegistrationEntity.setPassword(requestUserRegistration.getPassword());
		accountRegistrationEntity.setUserId(requestUserRegistration.getUserId());  
		accountRegistrationEntity.setUserName(requestUserRegistration.getUserName());
		accountRegistrationEntity.setEmail(requestUserRegistration.getEmailId());
		accountRegistrationRepository.save(accountRegistrationEntity);
		logger.info("Service Ends");
		return "record sucessfully entered";
		
		
	}
	
	@Override
	public List<AccountRegistrationEntity> getUser() {
		
		return accountRegistrationRepository.findAll();
	}

	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public String userDeletation(DeleteUser deleteUser) {
		 accountRegistrationRepository.deleteUser(deleteUser.getUserId());
	return "User Deleted";
	}

	@Override
	public Optional<AccountRegistrationEntity> getUserOnId(DeleteUser deleteUser) {
		
		return accountRegistrationRepository.findById(deleteUser.getUserId()) ;
	}

	



	

}
