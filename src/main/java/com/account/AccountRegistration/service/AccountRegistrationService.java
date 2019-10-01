package com.account.AccountRegistration.service;

import java.util.List;
import java.util.Optional;

import com.account.AccountRegistration.dto.DeleteUser;
import com.account.AccountRegistration.dto.RequestUserRegistration;
import com.account.AccountRegistration.dto.UserDetails;
import com.account.AccountRegistration.entity.AccountRegistrationEntity;

public interface AccountRegistrationService {
	
	public String userRegistration(RequestUserRegistration requestUserRegistration);

	//public UserDetails userDetails();

	public String userDeletation(DeleteUser deleteUser);

	public List<AccountRegistrationEntity> getUser();

	public Optional<AccountRegistrationEntity> getUserOnId(DeleteUser deleteUser);

	//public Object getUserNameAndId();

}
