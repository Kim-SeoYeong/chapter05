package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//txt 파일에 있는 내용을 읽어오는 로직
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		//Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();	//줄단위로 읽을 때(한줄씩 읽어옴, 줄바꿈 기호는 제외)
			if(str == null) {
				break;
			}
			
			System.out.println(str);
		}
		
		br.close();
		
	}

}
