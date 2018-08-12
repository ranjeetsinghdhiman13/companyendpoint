package com.ranjeet.company.companyendpoint.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ranjeet.company.companyendpoint.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

  @Query(value = "SELECT c from Company c")
  List<Company> getAllCompanies();

}
