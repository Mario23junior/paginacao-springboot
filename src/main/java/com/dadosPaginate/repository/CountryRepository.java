package com.dadosPaginate.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dadosPaginate.model.countriesModel;

public interface CountryRepository extends PagingAndSortingRepository<countriesModel, Long>{
	
	
}
