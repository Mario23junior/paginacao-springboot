package com.dadosPaginate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dadosPaginate.model.countriesModel;
import com.dadosPaginate.repository.CountryRepository;

@Service
public class CountryService implements ICountryService{
	
    @Autowired
    private CountryRepository repository;
    
    @Override
    public List<countriesModel> findPaginated(int pageNo, int pageSize) {
    	 
    	Pageable paging = PageRequest.of(pageNo, pageSize);
    	Page<countriesModel> pageResult = repository.findAll(paging);
    	
    	return pageResult.toList();
    }
}
