package com.jpaTEST.templates;


public abstract class User {

  public enum Roles{
    Admin, Owner, Agent
  };

  public String email;
  public char password;

  public User(String email, char password) {
    this.email = email;
    this.password = password;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String username) {
    this.email = username;
  }

  public char getPassword() {
    return this.password;
  }

  public void setPassword(char password) {
    this.password = password;
  }
}
