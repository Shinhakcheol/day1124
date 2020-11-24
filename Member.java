package method;

import java.time.LocalDateTime;

public class Member {
	
	
	private String id;
	private String password;
	private String name;
	private String email;
	private LocalDateTime date;
	private boolean auth;
	
	
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setDate(LocalDateTime date) {
		this.date=date;
	}
	public LocalDateTime getDate() {
		return date;
	}
	
	public void setAuth(boolean auth) {
		this.auth=auth;
	}
	public boolean isAuth() {
		return auth;
	}
	
	
	
	
	
	
}
