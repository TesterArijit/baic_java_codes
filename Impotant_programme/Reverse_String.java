package com.basic.Impotant_programme;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String a=sc.next();
	String rev="";
	sc.close();
	System.out.println("The length of the string is >> "+a.length());
	
	for(int i=a.length()-1;i>=0;i--)
	{
		rev = rev+a.charAt(i);
	}
	System.out.println(rev);
	}

}
//Logic -->>Let us assume -->>  String a=ARIJIT , here length =6 , so i=5-i=5
//
 // i=a.length()-1   rev         rev = rev+a.charAt(i)
//   i=5              ""           T =""+T  (Where char at i =5)
//   i=4              T              TI=T+I (Where char at i =4)
//   i=3              TI             TIJ=TI+J (Where char at i =3)
//   i=2              TIJ             TIJI =TIJ+I (Where char at i =2)
//   i=1              TIJI            TIJIR=TIJI+R (Where char at i =1)
//   i=0               TIJIR          TIJIRA=TIJAR+A (Where char at i =0)
