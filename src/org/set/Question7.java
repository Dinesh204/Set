package org.set;

import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		Set<StudentDetails> details = new LinkedHashSet<>();
		StudentDetails info = new StudentDetails();

		info.setStdId(450);
		info.setStdname("Dinesh");
		info.setStdPhnoe(9960805340l);
		info.setAddress("thousand light's, chennai ");
		info.setDob("12-04-1993");
		info.seteMail("dinesh@gmail.com");
		info.setGender("Male");

		details.add(info);

		for (StudentDetails st : details) {
			System.out.println("Student id: " + st.getStdId());
			System.out.println("Student name: " + st.getStdname());
			System.out.println("Student phone#:" + st.getStdPhnoe());
			System.out.println("Student Address: " + st.getAddress());
			System.out.println("Student DOB: " + st.getDob());
			System.out.println("Student Email: " + st.geteMail());
			System.out.println("Student gender: " + st.getGender());
		}

	}

}
