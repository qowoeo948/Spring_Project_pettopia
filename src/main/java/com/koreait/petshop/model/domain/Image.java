package com.koreait.petshop.model.domain;

import lombok.Data;

@Data
public class Image {
	private int image_id;
	private int product_id;
	private String filename;
	
}
