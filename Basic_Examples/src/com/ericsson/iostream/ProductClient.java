package com.ericsson.iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductClient {
	public static void main(String[] args) throws IOException, ClassNotFoundException {//checked exception
//		Product product = new Product(121, "samsung", 85000, "electronics");
//		FileOutputStream fout = new FileOutputStream("products_info.txt");
//		ObjectOutputStream out = new ObjectOutputStream(fout);
//		out.writeObject(product);
//		
		
		
		
		FileInputStream fout = new FileInputStream("products_info.txt");
		ObjectInputStream out = new ObjectInputStream(fout);
		Product product=(Product) out.readObject();
		System.out.println(product);
	}
}
