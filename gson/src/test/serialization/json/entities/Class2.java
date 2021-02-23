package test.serialization.json.entities;

import java.util.ArrayList;
import java.util.List;

public class Class2 {

  private long id;
  private String firstname;
  private String lastname;
  private Class2 class2;
  private List<Class2> class2s = new ArrayList<Class2>();

  public Class2() {

  }

  public Class2(long id, String firstname, String lastname, Class2 class2, List<Class2> class2s) {
    super();
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.class2 = class2;
    this.class2s = class2s;
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

  public Class2 getClass2() {
    return class2;
  }

  public void setClass2(Class2 class2) {
    this.class2 = class2;
  }

  public List<Class2> getClass2s() {
    return class2s;
  }

  @Override
  public String toString() {
    return "Class2 [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", class2=" + class2
        + ", class2s=" + class2s + "]";
  }
}