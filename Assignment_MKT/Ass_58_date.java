package Assignment_MKT;

import java.util.Date;

public class Ass_58_date {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.getTime()); //1724814665551
		//epoch time
		//Convert to human understandable
		//Current Date ---->>
		Date d1=new Date(d.getTime());
		System.out.println(d1);  //Wed Aug 28 08:43:37 IST 2024
		//Future date ----->>
		Date d2=new Date(d.getTime()+(1000*60*60*24*1));
		System.out.println(d2); // Thu Aug 29 08:48:56 IST 2024
		//Past Date ----->>
		Date d3=new Date(d.getTime()-(1000*60*60*24*2));
		System.out.println(d3); // Mon Aug 26 08:50:09 IST 2024
		System.out.println("============");
		//////////////
		// Peak the date---->>
		String date=d1.toString();
		System.out.println(date.substring(8, 10));
		// Peak the month---->>
		String month=d1.toString();
		System.out.println(month.substring(4, 8));
		// Peak the year---->>
		String year=d1.toString();
		System.out.println(year.substring(24, 28));
		
		
		
		
		
		
		
		
		
		
		

	}

}
