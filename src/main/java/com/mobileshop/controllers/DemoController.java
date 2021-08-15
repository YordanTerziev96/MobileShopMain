package com.mobileshop.controllers;


import com.mobileshop.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

	@Autowired
	public DemoService ds;

	@GetMapping("/")
	public String index() {
		return "Hop trop";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, params = {"username", "password"})
	@ResponseBody
	public ResponseEntity<?> insertData(String username, String password){

		return new ResponseEntity<>(ds.insertData(username, password), HttpStatus.OK);
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, params = {"username", "password"})
	@ResponseBody
	public ResponseEntity<?> getData(String username, String password){

		return new ResponseEntity<>(ds.getData(username, password), HttpStatus.OK);
	}
}
