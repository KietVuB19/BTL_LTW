package practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String fullName;
	private boolean active;
	private String roles;
	
	public void setup(User user) {
		this.id = user.id;
		this.username = user.username;
		this.password = user.password;
		this.fullName = user.fullName;
		this.active = user.active;
		this.roles = user.roles;
	}
}
