package com.ericsson.oops;

public class TestProduct {

	public static void main(String[] args) {
		Product product = new Product(123, "samsung", 20000, "electronics");
		product.setProductId(133);

		System.out.println(product);//object address
		System.out.println(product.toString());//object address
		System.out.println(product.hashCode());
		
		System.out.println(product.getProductName()+" "+product.getProductPrice());
	}

}
