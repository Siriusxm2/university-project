package com.jpaTEST.templates;

public abstract class User {
  public enum Roles{
    Admin, Owner, Agent
  };

  public String username;
  public char password;

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public char getPassword() {
    return this.password;
  }

  public void setPassword(char password) {
    this.password = password;
  }
}
