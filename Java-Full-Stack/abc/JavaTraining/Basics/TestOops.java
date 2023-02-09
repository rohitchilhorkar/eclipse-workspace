package Basics;

import java.time.LocalDate;

public class TestOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops e = new Oops("Rohit", 143, 23, 10000, LocalDate.of(2023, 01, 23));
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
		System.out.println(e.getDateOfJoining());
	}

}
