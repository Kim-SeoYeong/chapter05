package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		ArrayList<Person> pList = new ArrayList<Person>();
		
		while(true) {
			String str = br.readLine();
			
			if( str == null ) {
				break;
			}
			
			String[] readstr = str.split(",");

			Person p = new Person(readstr[0], readstr[1], readstr[2]);
			pList.add(p);

		}

		for(int i = 0; i < pList.size(); i++) {
			pList.get(i).showInfo();
		}

		br.close();
	}

}
