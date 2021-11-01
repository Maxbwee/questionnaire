package com.ohjelmistoprojekti.kysely.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Question {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private String question;
	
	private Boolean multipleAnswers = false;
	private Boolean radioQuestion = true;
	
	@ManyToOne
	private Inquiry inquiry;
	
	@JsonIgnore
	@OneToMany(mappedBy="question")
	private List<Answer> answers = new ArrayList<>();
	
	public Question() {}
	
	public Question(String question) {
		super();
		this.question = question;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + "]";
	}
}
