package cn.hpe.pojo;

import java.util.Date;

public class User {
	
	private Integer id;
	private String account;
	private String password;
	private String userName;
	private Integer gender;
	private Integer age;
	private Date birthday;
	private Date createTime;
	
	public User() {
	}
	
	public User(Integer id, String account, String password, String userName, Integer gender, Integer age,
			Date birthday, Date createTime) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.birthday = birthday;
		this.createTime = createTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", password=" + password + ", userName=" + userName
				+ ", gender=" + gender + ", age=" + age + ", birthday=" + birthday + ", createTime=" + createTime + "]";
	}
}
