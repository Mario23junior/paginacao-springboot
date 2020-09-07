package com.dadosPaginate.service;

import java.util.List;

import com.dadosPaginate.model.countriesModel;

public interface ICountryService {
    
	List<countriesModel> findPaginated(int pageNo, int pageSize);
}
