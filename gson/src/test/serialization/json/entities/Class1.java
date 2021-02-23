package test.serialization.json.entities;

import java.util.ArrayList;
import java.util.List;

public class Class1 {

	  private long id;
	  private String firstname;
	  private String lastname;
	  private Class1 class1;
	  private List<Class1> class1s = new ArrayList<Class1>();

	  public Class1() {

	  }

	  public Class1(long id, String firstname, String lastname, Class1 class1, List<Class1> class1s) {
	    super();
	    this.id = id;
	    this.firstname = firstname;
	    this.lastname = lastname;
	    this.class1 = class1;
	    this.class1s = class1s;
	  }

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getFirstname() {
	    return firstname;
	  }

	  public void setFirstname(String firstname) {
	    this.firstname = firstname;
	  }

	  public String getLastname() {
	    return lastname;
	  }

	  public void setLastname(String lastname) {
	    this.lastname = lastname;
	  }

	  public Class1 getClass1() {
	    return class1;
	  }

	  public void setClass1(Class1 class1) {
	    this.class1 = class1;
	  }

	  public List<Class1> getClass1s() {
	    return class1s;
	  }

	  @Override
	  public String toString() {
	    return "Class1 [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", class1=" + class1
	        + ", class1s=" + class1s + "]";
	  }
	}