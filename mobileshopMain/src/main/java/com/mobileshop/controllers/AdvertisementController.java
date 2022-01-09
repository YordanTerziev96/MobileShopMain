package com.mobileshop.controllers;

import com.mobileshop.services.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertisementController {

	@Autowired
	private AdvertisementService as;

	@RequestMapping(value = "/addbrands", method = RequestMethod.POST, params = {"brands"})
	@ResponseBody
	public ResponseEntity<?> addBrands(String brands){

		return new ResponseEntity<>(as.insertBrands(brands), HttpStatus.OK);
	}

	@RequestMapping(value = "/addmodels", method = RequestMethod.POST, params = {"brand", "models"})
	@ResponseBody
	public ResponseEntity<?> addModelsToBrand(String brand, String models){

		return new ResponseEntity<>(as.addModelsToBrand(brand, models), HttpStatus.OK);
	}

	@RequestMapping(value = "/brands", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getAllBrands(){

		return new ResponseEntity<>(as.getAllBrands(), HttpStatus.OK);
	}
}
