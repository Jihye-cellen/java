package juso;

import java.io.*;
import java.util.*;

public class JusoDAO {//DAO: data access object
	public void delete(int no) {
		try {
			BufferedReader reader = new BufferedReader (new FileReader(file));
			String line = "";
			String lines = "";
			while((line=reader.readLine())!=null) {
				String[] items = line.split(",");
				if(no!=Integer.parseInt(items[0])) {
					lines = lines +line + "\n";
					
				}
			}
			FileWriter writer = new FileWriter(file,false);
			writer.write(lines);
			writer.close();
		}catch (Exception e) {
			System.out.println("주소삭제:"+ e.toString());
		}
	}
	
	//주소등록
	public void insert(Juso juso) {
		try {
			FileWriter writer = new FileWriter(file,true);
			writer.write(juso.getNo()+","+juso.getName()+","+juso.getPhone()+","+juso.getAddress()+"\n");
			writer.close();
		}catch (Exception e) {
			System.out.println("주소등록:" +e.toString());
		}
	}
	//이름조회
	public Juso read(String name) { //return을 주지 않으면 오류발생
		Juso juso = new Juso();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine())!=null) {
				String[]items = line.split(",");
				if(items[1].equals(name) || items[0].equals(name)) {
				juso.setNo(Integer.parseInt(items[0]));
				juso.setName(items[1]);
				juso.setPhone(items[2]);
				juso.setAddress(items[3]);
				}
				
				}//try
		}catch(Exception e){
			System.out.println("이름조회:"+ e.toString());
		}
		return juso;
	}
	
	
	//주소목록
	
	File file = new File ("c:/data/java/ex05/juso.txt");
	public ArrayList<Juso> list(){
		ArrayList<Juso> array = new ArrayList<Juso>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line="";
			while((line=reader.readLine())!= null) {
				String[] items = line.split(",");
				
				Juso juso = new Juso();
				juso.setNo(Integer.parseInt(items[0]));
				juso.setName(items[1]);
				juso.setPhone(items[2]);
				juso.setAddress(items[3]);
				
				array.add(juso);
			}
		}catch(Exception e){
			System.out.println("주소목록:"+ e.toString());
		}
		return array;
	}
}
