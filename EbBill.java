package com.eb;

import java.util.Scanner;

public class EbBill {//domestic purpose 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double units = sc.nextDouble();
		double cunits=1;
		if(units<=100) {
			cunits=0;
		}
		else if(units>100 && units<=200) {
			units=units-100;
			cunits=units*2.25;
		}
		else if(units>200 && units<=400) {
			units=units-200;
			cunits=225+(units*4.50);
		}
		else if(units>400 && units<=500) {
			units=units-400;
			cunits=225+900+(units*6.0);
		}
		else if(units>500 && units<=600) {
			units=units-500;
			cunits=450+900+600+(units*8.0);
		}
		else if(units>600 && units<=800) {
			units=units-600;
			cunits=450+900+600+800+(units*9.0);
		}
		else if(units>800 && units<=1000) {
			units=units-800;
			cunits=450+900+600+800+1800+(units*10.0);
		}
		else {
			units=units-1000;
			cunits=450+900+600+800+1800+2000+(units*11.0);
		}
		
	System.out.println(cunits);
	}

}
