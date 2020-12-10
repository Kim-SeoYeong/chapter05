package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MS949App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 1 0 1 0 이런식으로 파일을 읽어옴
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		// 번역기 역할
		// txt를 읽어서 MS949방식으로 번역한다
		InputStreamReader ist = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(ist);

		while (true) {
			String str = br.readLine(); // 한줄씩 읽어온다. 줄바꿈 기호는 제외
			
			if (str == null) {
				break;
			}
			
			System.out.println(str);
		}
		
		br.close();
		
	}

}
