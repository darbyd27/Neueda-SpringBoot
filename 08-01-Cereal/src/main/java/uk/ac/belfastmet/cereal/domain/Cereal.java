package uk.ac.belfastmet.cereal.domain;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;

 @Entity
 public class Cereal
 {
 	@Id
 	@GeneratedValue
 	private Integer cerealId;

	@NotEmpty
 	private String manufacturer;
	@NotEmpty
 	private String name;
 	private Integer energy;
 	private Integer calories;
 	private Double protein;
 	private Double carbohydrate;
 	private Double sugars;
 	private Double fat;
 	private Double saturates;
 	private Double fibre;
 	private String sodium;
 	private String salt;
 	private Double iron;

 	public Cereal() {
 		super();
 	}

 	public Integer getCerealId() {
 		return cerealId;
 	}

 	public void setCerealId(Integer cerealId) {
 		this.cerealId = cerealId;
 	}
 	
 	public String getManufacturer() {
 		return manufacturer;
 	}

 	public void setManufacturer(String manufacturer) {
 		this.manufacturer = manufacturer;
 	}

 	public String getName() {
 		return name;
 	}

 	public void setName(String name) {
 		this.name = name;
 	}

 	public Integer getEnergy() {
 		return energy;
 	}

 	public void setEnergy(Integer energy) {
 		this.energy = energy;
 	}

 	public Integer getCalories() {
 		return calories;
 	}

 	public void setCalories(Integer calories) {
 		this.calories = calories;
 	}

 	public Double getProtein() {
 		return protein;
 	}

 	public void setProtein(Double protein) {
 		this.protein = protein;
 	}

 	public Double getCarbohydrate() {
 		return carbohydrate;
 	}

 	public void setCarbohydrate(Double carbohydrate) {
 		this.carbohydrate = carbohydrate;
 	}

 	public Double getSugars() {
 		return sugars;
 	}

 	public void setSugars(Double sugars) {
 		this.sugars = sugars;
 	}

 	public Double getFat() {
 		return fat;
 	}

 	public void setFat(Double fat) {
 		this.fat = fat;
 	}

 	public Double getSaturates() {
 		return saturates;
 	}

 	public void setSaturates(Double saturates) {
 		this.saturates = saturates;
 	}

 	public Double getFibre() {
 		return fibre;
 	}

 	public void setFibre(Double fibre) {
 		this.fibre = fibre;
 	}

 	public String getSodium() {
 		return sodium;
 	}

 	public void setSodium(String sodium) {
 		this.sodium = sodium;
 	}

 	public String getSalt() {
 		return salt;
 	}

 	public void setSalt(String salt) {
 		this.salt = salt;
 	}

 	public Double getIron() {
 		return iron;
 	}

 	public void setIron(Double iron) {
 		this.iron = iron;
 	}

}
