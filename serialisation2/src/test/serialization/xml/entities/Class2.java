package test.serialization.xml.entities;

public class Class2 {

	  private long id;
	  private String data1;
	  private String data2;

	  public Class2() {

	  }

	  public long getId() {
	    return id;
	  }

	  public void setId(long id) {
	    this.id = id;
	  }

	  public String getData1() {
	    return data1;
	  }

	  public void setData1(String data1) {
	    this.data1 = data1;
	  }

	  public String getData2() {
	    return data2;
	  }

	  public void setData2(String data2) {
	    this.data2 = data2;
	  }

	  @Override
	  public String toString() {
	    return "Class2 [id=" + id + ", data1=" + data1 + ", data2=" + data2 + "]";
	  }
	}