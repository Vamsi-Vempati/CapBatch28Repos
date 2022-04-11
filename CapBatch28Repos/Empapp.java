package com.cg.in;

import java.util.Scanner;

public class Empapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		long pno=sc.nextLong();
		Employee e1=new Employee(id,name,pno);
		System.out.println(e1);
	}

}
