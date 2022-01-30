package org.college;

public class College {
	
	private void CollegeName() {
		// TODO Auto-generated method stub
	System.out.println("The College Name is New Prince Bhavani Engg College");

	}
	private void CollegeCode() {
		// TODO Auto-generated method stub
	System.out.println("The College Code is 5143");

	}
	private void CollegeRank() {
		// TODO Auto-generated method stub
    System.out.println("The College Rank is Second");
	}

	public static void main(String[] args) {
		College c = new College();
		c.CollegeName();
		c.CollegeCode();
		c.CollegeRank();
		System.out.println("--------------");
		
		Student S = new Student();
		S.studentName();
		S.studentDept();
		S.studentId();
		System.out.println("--------------");
		
		
		Hostel H = new Hostel();
		H.hostelName();
		System.out.println("--------------");
		
		Dept D = new Dept();
		D.deptName();
		System.out.println("--------------");
		
	}
}
