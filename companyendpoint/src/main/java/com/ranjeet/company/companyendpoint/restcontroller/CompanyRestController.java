package com.ranjeet.company.companyendpoint.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ranjeet.company.companyendpoint.model.Company;
import com.ranjeet.company.companyendpoint.repository.CompanyRepository;

@RestController
@RequestMapping(value = {"/company"})
public class CompanyRestController {

  Logger logger = Logger.getLogger(CompanyRestController.class.getName());

  @Autowired
  CompanyRepository companyRepository;

  @GetMapping("/getall")
  public ResponseEntity<List<Company>> getAll() {
    Company saveCompany = new Company(1, "FromCode", "FromCode");
    logger.log(Level.INFO, "Saving company from code");
    companyRepository.save(saveCompany);

    logger.log(Level.INFO, "Getting all companies");
    List<Company> companyList = new ArrayList<Company>();
    companyList.addAll(companyRepository.getAllCompanies());

    logger.log(Level.INFO, companyRepository.findAll().toString());
    return new ResponseEntity<List<Company>>(companyList, HttpStatus.OK);
  }

}
