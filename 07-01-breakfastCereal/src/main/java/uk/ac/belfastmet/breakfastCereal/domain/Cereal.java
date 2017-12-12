package uk.ac.belfastmet.breakfastCereal.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity





public class Cereal {

	
	
	@Id
	@GeneratedValue
	
	
	private Integer cerealId;
	private String manufacturer;
	private String name;
	private Integer energy;
	private Integer calories;
	private String protein;
	private String carbohydrate;
	private String sugars;
	private String fat;
	private String saturates;
	private String fibre;
	private String sodium;
	private String salt;
	private String iron;



}
