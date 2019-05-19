package com.paf.prj.PAF_1;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//import org.springframework.data.jpa.domain.support.AuditingEntityListners;

@Entity
@Table(name="Categories")
@EntityListeners(AuditingEntityListener.class)

public class Categories {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@NotBlank
	private String Name;
	
	@NotBlank
	private Long id;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCodeNo() {
		return CodeNo;
	}

	public void setCodeNo(String codeNo) {
		CodeNo = codeNo;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@LastModifiedDate
	private Date createdAt;
	
	@NotBlank
	private String CodeNo;
	
	@NotBlank
	private float price;

	public Object getDesignation() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDesignatiiom(Object designation) {
		// TODO Auto-generated method stub
		
	}

	public Object getExpertise() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setExpertise(Object expertise) {
		// TODO Auto-generated method stub
		
	} 

}
