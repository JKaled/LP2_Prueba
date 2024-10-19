package com.cibertec.app.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="regions")
public class Region {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int region_id;
@Column(name="region_name", length= 40, nullable =true)
private String region_name;

 public Region() {
	 
 }

public Region(int region_id, String region_name) {
	super();
	this.region_id = region_id;
	this.region_name = region_name;
}

public int getRegion_id() {
	return region_id;
}

public void setRegion_id(int region_id) {
	this.region_id = region_id;
}

public String getRegion_name() {
	return region_name;
}

public void setRegion_name(String region_name) {
	this.region_name = region_name;
	}
}

