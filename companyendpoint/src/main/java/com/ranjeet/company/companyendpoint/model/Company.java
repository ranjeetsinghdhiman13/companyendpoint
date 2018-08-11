package com.ranjeet.company.companyendpoint.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(appliesTo = "ltccompany")
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "companyid")
  @JsonProperty("CompanyId")
  private Integer companyId;

  @Column(name = "companyname")
  @JsonProperty("CompanyName")
  private String companyName;

  @Column(name = "description")
  @JsonProperty("Description")
  private String description;

  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


}
