package Basics;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.Scanner;

public class LocalTimes{
	public static void main(String args[])
	{
		LocalTime l = LocalTime.now();
		System.out.print(l.getHour() + ":");
		System.out.print(l.getMinute()+ ":");
		System.out.println(l.getSecond()+ "");
		if (l.getHour() <= 12 && l.getHour() > 5) {
			System.out.println("Good Morning");
		}
		else if(l.getHour() > 12 && l.getHour()<18)
			System.out.println("Good Afternoon");
		else
			System.out.println("Good Night");
		
		int day = 4;
		switch(day)
		{
		case 1:
			System.out.println("First");
			break;
		case 2:
			System.out.println("Second");
			break;
		case 3:
			System.out.println("Third");
			break;
		default:
			System.out.println("Nothing Matched :(");
			break;
		}
	}
}