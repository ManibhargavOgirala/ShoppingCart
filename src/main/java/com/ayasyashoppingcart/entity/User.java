package com.ayasyashoppingcart.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "login_name", unique = true)
	private String loginName;

	@Column(name = "email", unique = true)
	private String emailAddress;

	@Column(name = "contact", unique = true)
	private String contactNo;

	@Column(name = "age")
	private Integer age;

	@Column(name = "password")
	private String password;

	@Column(name = "gender")
	private String gender;

	public User(Long id, String productName, String categoryName, Integer quantity, Double price, Long userId,
			String userName, String emailAddress, String contactNo, Integer age, String password, String gender,
			String loginName) {

		this.userId = userId;
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.contactNo = contactNo;
		this.age = age;
		this.password = password;
		this.gender = gender;
		this.loginName = loginName;
	}

	public User() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User{" + "userId=" + userId + ", userName='" + userName + '\'' + ", emailAddress='" + emailAddress
				+ '\'' + ", contactNo='" + contactNo + '\'' + ", age=" + age + ", password='" + password + '\''
				+ ", gender='" + gender + '\'' + '}';
	}
}
