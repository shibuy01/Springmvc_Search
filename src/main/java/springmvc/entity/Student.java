package springmvc.entity;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private Long Id;
	private Date dob;
	private List<String> subject;
	private String gender;
	private String type;
	
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List getSubject() {
		return subject;
	}
	public void setSubject(List subject) {
		this.subject = subject;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", dob=" + dob + ", subject=" + subject + ", gender=" + gender
				+ ", type=" + type + ", address=" + address + "]";
	}
	
	
}

