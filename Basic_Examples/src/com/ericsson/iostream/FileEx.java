package com.ericsson.iostream;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File file=new File("ericsson_info.txt");
		//System.out.println(file.createNewFile());
		
		//System.out.println(file.mkdir());
		System.out.println(file.isFile());
		//System.out.println(file.isDirectory());
	}

}
