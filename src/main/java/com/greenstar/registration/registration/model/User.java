package com.greenstar.registration.registration.model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
	 * 
	 * String name;
	 * 
	 * String email;
	 * 
	 * public User() {}
	 * 
	 * public User(Integer id, String name, String email) { super(); this.id = id;
	 * this.name = name; this.email = email; }
	 * 
	 * public Integer getId() { return id; }
	 * 
	 * public void setId(Integer id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String email) { this.email = email; }
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long user_id;
	
	
	private String first_name;
	private String last_name ; 
	private String email;
	private Long phone;
	private String password; 
	private Date last_upd_dt;
	private Date last_upd_dt_time; 
	private String last_upd_by; 
	private String role; 
	private boolean enabled;
	
	public User() {}
	
	public User(Long user_id, String first_name, String last_name, String email, Long phone, String password,
			Date last_upd_dt, Date last_upd_dt_time, String last_upd_by, String role, boolean enabled) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.last_upd_dt = last_upd_dt;
		this.last_upd_dt_time = last_upd_dt_time;
		this.last_upd_by = last_upd_by;
		this.role = role;
		this.enabled = enabled;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLast_upd_dt() {
		return last_upd_dt;
	}
	public void setLast_upd_dt(Date last_upd_dt) {
		this.last_upd_dt = last_upd_dt;
	}
	public Date getLast_upd_dt_time() {
		return last_upd_dt_time;
	}
	public void setLast_upd_dt_time(Date last_upd_dt_time) {
		this.last_upd_dt_time = last_upd_dt_time;
	}
	public String getLast_upd_by() {
		return last_upd_by;
	}
	public void setLast_upd_by(String last_upd_by) {
		this.last_upd_by = last_upd_by;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
	
	
}
