package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB_2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<Person> pList = new ArrayList<Person>();
		
		while(true) {
			//일단 txt파일에 있는걸 읽어오자
			String str = br.readLine();
			
			if (str == null) {
				break;
			}
			String[] txtstr = str.split(",");
			Person p = new Person(txtstr[0], txtstr[1], txtstr[2]);
			pList.add(p);
			
		}
		//내용 추가로직
		Writer fw = new FileWriter("C:\\javaStudy\\PhoneDB_2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("핸드폰 : ");
		String hp = sc.nextLine();
		System.out.print("회사 : ");
		String company = sc.nextLine();
		
		Person p02 = new Person(name, hp, company);
		pList.add(p02);
		
		for(int i = 0; i < pList.size(); i++) {
			bw.write(pList.get(i).getName() + "," + pList.get(i).getHp() + "," +
						pList.get(i).getCompany());
			bw.newLine();
			pList.get(i).showInfo();
		}
		
		
		br.close();
		bw.close();
		sc.close();

	}

}
