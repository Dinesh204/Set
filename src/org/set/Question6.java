package org.set;

import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		Set<EmployeeDetails> l = new LinkedHashSet<>();
		EmployeeDetails em = new EmployeeDetails();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee Details:");

		String name = scan.nextLine();
		em.setName(name);
		System.out.println("Emloyee name: " + em.getName());

		String address = scan.nextLine();
		em.setAddress(address);
		System.out.println("Employee Address: " + em.getAddress());

		String mail = scan.nextLine();
		em.setmaill(mail);
		System.out.println("Emloyee Email: " + em.getmail());

		String gender = scan.nextLine();
		em.setGender(gender);
		System.out.println("Employee gender: " + em.getGender());

		String dateOf = scan.nextLine();
		em.setdateOf(dateOf);
		System.out.println("Employee DOB :" + em.getDateOf());

		String doj = scan.nextLine();
		em.setDoj(doj);
		System.out.println("Employee DOJ :" + em.getDoj());

		int id = scan.nextInt();
		em.setId(id);
		System.out.println("Employee Id: " + em.getId());

		long phone = scan.nextLong();
		em.setPhone(phone);
		System.out.println("Employee Phone number: " + em.getPhone());

		int salary = scan.nextInt();
		em.setSalary(salary);
		System.out.println("Employee Salary: " + em.getSalary());

	}

}
