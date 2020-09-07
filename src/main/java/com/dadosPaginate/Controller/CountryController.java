package com.dadosPaginate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dadosPaginate.model.countriesModel;
import com.dadosPaginate.service.ICountryService;

@RestController
public class CountryController {
	
    @Autowired 
	private ICountryService countryService;
    
    @GetMapping("/paises/{pageNo}/{pageSize}")
    public List<countriesModel> getPaginatedCountries(@PathVariable int pageNo, @PathVariable int pageSize) {
    	
       return countryService.findPaginated(pageNo, pageSize);
    	
    }
}
