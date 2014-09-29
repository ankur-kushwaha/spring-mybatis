package com.raistudies.domain;

import java.io.Serializable;

public class User implements Serializable {

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", standard=" + standard
				+ ", age=" + age + ", sex=" + sex + "]";
	}

	private String id, name, standard, age, sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}