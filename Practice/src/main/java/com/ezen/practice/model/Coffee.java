package com.ezen.practice.model;

import org.springframework.stereotype.Component;

@Component
public class Coffee {
	
	private String name;
	private Integer price;
	private Boolean hot;
	
	public Coffee() {
		name = "default name";
		price = 0;
		hot = true;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Boolean getHot() {
		return hot;
	}
	public void setHot(Boolean hot) {
		this.hot = hot;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s/%s", name, price, hot);
	}
	
}
