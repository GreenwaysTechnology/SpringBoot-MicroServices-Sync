package com.example.demo.beans.extensions.annotations;

public class Project {
	private int pid;
	private String name;
	private String client;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", client=" + client + "]";
	}
}
