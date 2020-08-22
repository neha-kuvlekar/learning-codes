package com.spring.mvc.bean;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="worker")
@DynamicUpdate
public class worker {

	@Id
	@Column(name="TaskId")
	private int TaskId;
    private String username;
    private String email;
    private String password;
   // @DateTimeFormat(pattern = "yyyy-mm-dd HH:MM:SS")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date create_time;
    private String TaskStatus;
	public int getTaskId() {
		return TaskId;
	}
	public void setTaskId(int taskId) {
		TaskId = taskId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getTaskStatus() {
		return TaskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		TaskStatus = taskStatus;
	}
	public worker(int taskId, String username, String email, String password, Date create_time, String taskStatus) {
		super();
		TaskId = taskId;
		this.username = username;
		this.email = email;
		this.password = password;
		this.create_time = create_time;
		TaskStatus = taskStatus;
	}
	public worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "worker [TaskId=" + TaskId + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", create_time=" + create_time + ", TaskStatus=" + TaskStatus + "]";
	}
    
    
    
}
