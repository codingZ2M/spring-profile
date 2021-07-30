package com.purplewisteria.profilespecificconfigurations.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.profilespecificconfigurations.service.DatabaseService;

@RestController // Routes the requests the user types
@RequestMapping(value = "/dbService")
public class DBController {

	@Autowired
    DatabaseService databaseService;
		  
		  
	@RequestMapping( method=RequestMethod.GET)
	public ResponseEntity<List <String>>service(Model model){
		        
		       // model.addAttribute("carLoan", databaseService.getDBConnection() );
			 List <String> dbConnection = databaseService.getDBConnection();
			  return new ResponseEntity<List<String>>(dbConnection, HttpStatus.FOUND);  //HTTP status return code for a successful find statement
		    }

}
