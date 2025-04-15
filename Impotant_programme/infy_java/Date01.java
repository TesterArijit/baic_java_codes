package infy_java;

import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		
		Date d =new Date();
		System.out.println(d.getTime());
		
		Date d1= new Date(d.getTime());
		System.out.println(d1);
		
		//Future time:--
		Date d2 =new Date(d.getTime()+(1000*60*60*24*1));
		// 1000--mili seconds, 60-min, 60-sec, 1=no of days
		System.out.println(d2);
		
		//Past Date:--
		Date d3 =new Date(d.getTime()-(1000*60*60*24*1));
		System.out.println(d3);
		
		
		

	}

}
