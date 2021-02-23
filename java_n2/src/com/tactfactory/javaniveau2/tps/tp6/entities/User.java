package com.tactfactory.javaniveau2.tps.tp6.entities;

public class User {

  private String firstname;
  private String lastname;

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

  @Override
  public String toString() {
    return "User [firstname=" + firstname + ", lastname=" + lastname + "]";
  }

  @Override
  public boolean equals(Object obj) {
    boolean result = true;
    if (obj instanceof User) {
      if (!this.getFirstname().equals(((User)obj).getFirstname())
          && !this.getLastname().equals(((User)obj).getLastname())
          ) {
        result = false;
      }
      return result;
    }else {
      return super.equals(obj);
    }
  }
}
