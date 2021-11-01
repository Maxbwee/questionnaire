package com.ohjelmistoprojekti.kysely.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	private String answer;
	
	private String openAnswer;
	
	private int value = 0;
	
	@ManyToOne
	private Question question;
	
	public Answer() {}
	
	public Answer(String answer) {
		super();
		this.answer = answer;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
 	}
}
