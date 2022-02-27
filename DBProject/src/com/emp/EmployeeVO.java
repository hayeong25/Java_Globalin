package com.emp;

public class EmployeeVO {
	// 필드 정의
	private int no; // 사원번호
	private String name;
	private String jobGrade;
	private int department; // 부서번호
	private String email;
	private String status;
	
	// 기본 생성자
	public EmployeeVO() {
		
	}
	
	// 생성자
	public EmployeeVO(int no, String name, String jobGrade, int department, String email) {
		this.no = no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
	}
	
	// 생성자 매개변수를 이용해 필드 초기화
	public EmployeeVO(int no, String name, String jobGrade, int department, String email, String status) {
		this.no = no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
		this.status = status;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobGrade() {
		return jobGrade;
	}

	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return getNo() + ", " + getName();
	}
}