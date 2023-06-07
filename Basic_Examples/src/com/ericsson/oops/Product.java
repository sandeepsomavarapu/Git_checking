package com.ericsson.oops;

public class Product {

	private int productId;
	private String productName;
	private int productPrice;
	private String prodcutCategory;

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", prodcutCategory=" + prodcutCategory + "]";
	}

	// setters and getters
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int productPrice, String prodcutCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.prodcutCategory = prodcutCategory;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {

		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProdcutCategory() {
		return prodcutCategory;
	}

	public void setProdcutCategory(String prodcutCategory) {
		this.prodcutCategory = prodcutCategory;
	}

}
