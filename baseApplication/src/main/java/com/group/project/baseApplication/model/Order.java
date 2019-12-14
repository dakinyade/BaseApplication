package com.group.project.baseApplication.model;

import lombok.Data;

@Data
public class Order {

	private String name;
	private String cardType;
	private int price;
	private int discount;


}