package com.purplewisteria.profilespecificconfigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.purplewisteria.profilespecificconfigurations.service.DatabaseService;

@SpringBootApplication
public class ProfileSpecificConfigurationsApplication {

	
	
	public static void main(String[] args) {
		
		SpringApplication.run(ProfileSpecificConfigurationsApplication.class, args);
		
		
	
	}

}
