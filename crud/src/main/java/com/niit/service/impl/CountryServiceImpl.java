package com.niit.service.impl;

import com.niit.dao.CountryDAO;
import com.niit.model.Country;
import com.niit.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAO countryDAO;

    @Transactional(readOnly = true)
    public List<Country> listOfCountries() {
            return countryDAO.listOfCountry();
        }
}
