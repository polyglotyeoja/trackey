package com.monopolardesigns.trackey.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private String vin;
	private String color;
	private String make;
	private String model;

	public Car(String vin, String color, String make, String model, String stockNo, boolean softDelete, String year) {
		this.vin = vin;
		this.color = color;
		this.make = make;
		this.model = model;
		this.stockNo = stockNo;
		this.softDelete = softDelete;
		this.year = year;
	}

	private String stockNo;
	private boolean softDelete;
	private String year;
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStockNo() {
		return stockNo;
	}
	public void setStockNo(String stockNo) {
		this.stockNo = stockNo;
	}
	public boolean isSoftDelete() {
		return softDelete;
	}
	public void setSoftDelete(boolean softDelete) {
		this.softDelete = softDelete;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	

}
