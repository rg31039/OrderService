package com.account.AccountRegistration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.account.AccountRegistration.entity.AccountRegistrationEntity;

@Repository
public interface AccountRegistrationRepository extends JpaRepository<AccountRegistrationEntity,String> {
	
	@Modifying
	@Query("DELETE FROM AccountRegistrationEntity e WHERE e.userId= :userId")
	void deleteUser(String userId);
	

	
	
	
}
