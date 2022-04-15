package prcode;

import java.util.Scanner;

public class averageofthreenum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int  m1, m2, m3, tot;
		double avg;
		System.out.println("enter a number");
		m1=s.nextInt();
		System.out.println("enter 2nd number");
		m2=s.nextInt();
		System.out.println("enter 3rd number");
		m3=s.nextInt();
		tot=m1+m2+m3;
		avg=tot/3.0;
		System.out.println("Total is "+tot);
		System.out.println("avg is "+avg);
		

	}

}
