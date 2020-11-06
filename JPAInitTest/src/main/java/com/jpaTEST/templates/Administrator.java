package com.jpaTEST.templates;

public class Administrator extends User{

  private User.Roles role;

  public Administrator(String username, char password) {
    super(username, password);
  }

  public Administrator(String username, char password, Roles role) {
    super(username, password);
    this.role = role;
  }

}
