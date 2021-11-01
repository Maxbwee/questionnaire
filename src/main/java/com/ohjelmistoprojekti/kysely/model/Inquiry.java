package com.ohjelmistoprojekti.kysely.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Inquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	@JsonIgnore
	@OneToMany(mappedBy="inquiry")
	private List<Question> questions = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="inquiry")
	private List<Maker> makers = new ArrayList<>();
	
	public Inquiry() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Inquiry [id=" + id + "]";
	}
	
}
