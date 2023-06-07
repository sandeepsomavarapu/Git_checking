package com.ericsson.iostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterEx {
	public static void main(String args[]) throws IOException {

		FileWriter fw = new FileWriter("ericsson_info1.txt");
		PrintWriter out = new PrintWriter(fw);// sop

		out.println(1000);
		out.println(false);
		out.println('s');
		out.println("ibm");
		out.flush();
		out.close();
		fw.close();
	}
}