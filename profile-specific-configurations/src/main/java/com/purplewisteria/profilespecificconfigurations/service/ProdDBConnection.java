package com.purplewisteria.profilespecificconfigurations.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("production")

public class ProdDBConnection implements DatabaseService {

    @Override
    public List<String> getDBConnection() {
     
 	List <String> dbConnectionDetails = new ArrayList<String>();
    	
    	dbConnectionDetails.add("spring.datasource.url=jdbc:postgresql://localhost:5432/pma-springboot");
    	dbConnectionDetails.add("spring.datasource.username=postgres");
    	dbConnectionDetails.add("spring.datasource.password=root");
    	dbConnectionDetails.add("spring.jpa.hibernate.ddl-auto=update");
    	
       return dbConnectionDetails;
    }
}