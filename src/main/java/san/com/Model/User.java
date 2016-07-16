package san.com.Model;

import org.springframework.data.annotation.Id;

public class User {

@Id
int id;
String name;
String pass;

public User(){}

public User(int id, String name, String pass) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the user
 */
public String getName() {
	return name;
}
/**
 * @param user the user to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the pass
 */
public String getPass() {
	return pass;
}
/**
 * @param pass the pass to set
 */
public void setPass(String pass) {
	this.pass = pass;
}
}
