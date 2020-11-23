package com.example.demo.beans.extensions.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	
	//byName
	@Autowired
	private Project project;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Project project) {
		super();
		this.project = project;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", project=" + project + "]";
	}

}
