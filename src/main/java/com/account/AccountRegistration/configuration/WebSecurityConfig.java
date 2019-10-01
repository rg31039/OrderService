/*
 * package com.account.AccountRegistration.configuration;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * import com.account.AccountRegistration.service.AccountRegistrationService;
 * 
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class WebSecurityConfig extends
 * WebSecurityConfigurerAdapter{
 * 
 * @Autowired AccountRegistrationService accountRegistrationService;
 * 
 * 
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * .authorizeRequests() .antMatchers("/account/**").permitAll()
 * .anyRequest().authenticated(); } }
 * 
 * 
 */