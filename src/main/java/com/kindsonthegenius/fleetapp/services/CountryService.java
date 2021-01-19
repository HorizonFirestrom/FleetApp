package com.kindsonthegenius.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	
	//Return list of countries
	public List<Country> getCountries()
	{
		
		return countryRepository.findAll();
	}
	
	//save new country
	public void save(Country country) {
		
		countryRepository.save(country);
	}

}
