package com.purplewisteria.profilespecificconfigurations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("development")

public class DevDBConnection implements  DatabaseService {

    @Override
    public List<String> getDBConnection() {
    	List <String> dbConnectionDetails = new ArrayList<String>();
    	
    	dbConnectionDetails.add("spring.h2.console.enabled=true");
    	dbConnectionDetails.add("spring.h2.console.path=/h2-console");
    	dbConnectionDetails.add("spring.datasource.url=jdbc:h2:mem:testdb");
    	dbConnectionDetails.add("spring.datasource.driverClassName=org.h2.Driver");
    	dbConnectionDetails.add("spring.datasource.username=sa");
    	dbConnectionDetails.add("spring.datasource.password=");
    	dbConnectionDetails.add("spring.jpa.database-platform=org.hibernate.dialect.H2Dialect");
    	
       return dbConnectionDetails;
    }
}