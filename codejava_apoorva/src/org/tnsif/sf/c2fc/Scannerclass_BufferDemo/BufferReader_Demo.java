package org.tnsif.sf.c2fc.Scannerclass_BufferDemo;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferReader_Demo {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Apoorva kj\\Downloads\\dom.txt\\"));
		String data ="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
      br.close();
	}

}
