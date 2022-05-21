package org.college;

public class College {
	public void collegeName() {
		System.out.println("College Name: Anna University");
	}
	public void collegeCode() {
		System.out.println("College Code: A01001");
	}
	public void collegeRank() {
		System.out.println("College Rank: 02");
	}
	public static void main(String[] args) {
		College C = new College();
		C.collegeName();
		C.collegeCode();
		C.collegeRank();
		Student S = new Student();
		S.studentName();
		S.studentDept();
		S.studentId();
		Hostel H = new Hostel();
		H.hostelName();
		Dept D = new Dept();
		D.deptName();
	}
}
