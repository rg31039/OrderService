package com.account.AccountRegistration.serviceImplTest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.account.AccountRegistration.dto.RequestUserRegistration;
import com.account.AccountRegistration.entity.AccountRegistrationEntity;
import com.account.AccountRegistration.repository.AccountRegistrationRepository;
import com.account.AccountRegistration.serviceImpl.AccountRegistrationServiceImpl;

public class AccountRegistrationServiceImplTest {
	
	@Mock
	AccountRegistrationRepository accountRegistrationRepository;

	
	@InjectMocks
	AccountRegistrationServiceImpl accountRegistrationServiceImpl;
	
	
	   @Before
	    public void setUp() throws Exception {
	        MockitoAnnotations.initMocks(this);
	    }
	
	@Test
	public void userRegistrationTest() {
		
		RequestUserRegistration requestUserRegistration=new RequestUserRegistration();
		requestUserRegistration.setPassword("123");
		requestUserRegistration.setUserId("12");
		requestUserRegistration.setUserName("rohit");
		requestUserRegistration.setEmailId("abc@gmail.com");
		
		AccountRegistrationEntity accountRegistrationEntity=new AccountRegistrationEntity();
		accountRegistrationEntity.setPassword(requestUserRegistration.getPassword());
		accountRegistrationEntity.setUserId(requestUserRegistration.getUserId());
		accountRegistrationEntity.setUserName(requestUserRegistration.getUserName());
		accountRegistrationEntity.setEmail(requestUserRegistration.getEmailId());
		
		
		Mockito.when(accountRegistrationRepository.save(accountRegistrationEntity))
		.thenReturn(accountRegistrationEntity);
		Mockito.when(accountRegistrationServiceImpl.userRegistration(requestUserRegistration))
		.thenReturn("value inserted");
		
		
		
	}

}
