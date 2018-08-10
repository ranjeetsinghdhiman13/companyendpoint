package com.ranjeet.company.companyendpoint.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "ltcdb_china")
public class Company {

	@Id
	private Integer companyId;

}
