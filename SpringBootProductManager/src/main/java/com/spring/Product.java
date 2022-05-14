package com.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Entity
public class Product {

	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@Size(min=2, max=10)
	@NotEmpty(message="Name must not be null")
	private String name;*/

	@Id
	//@Size(min=1,max=10)
	//@NotEmpty(message="Id must be not empty")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	public int id;
	
	@Size(min=2, max=10)
	@NotEmpty(message="Name must not be null")
	public String name;
	
	@Range(min=1000,max=100000)
	@NotNull(message="Price must be Not Null")
	public float price;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}