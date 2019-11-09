package com.userData;

public class userDetails {
	private String firstName;
	private String lastName;
	private String age;
	private String gender;
	private String userId;
	private String pwd;

	public userDetails(String firstName, String lastName, String age, String gender,
			String userId, String pwd) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.userId = userId;
		this.pwd = pwd;
	}


	public userDetails() {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String string) {
		this.age = string;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String string) {
		this.gender = string;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
