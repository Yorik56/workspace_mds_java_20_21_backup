package test.serialization.xml.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Class1 {

	  private long id;
	  private String prop1;
	  private boolean prop2;

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getProp1() {
	    return prop1;
	  }

	  public void setProp1(String prop1) {
	    this.prop1 = prop1;
	  }

	  public boolean isProp2() {
	    return prop2;
	  }

	  public void setProp2(boolean prop2) {
	    this.prop2 = prop2;
	  }

	  @Override
	  public String toString() {
	    return "Class1 [id=" + id + ", prop1=" + prop1 + ", prop2=" + prop2 + "]";
	  }
}