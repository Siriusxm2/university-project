package com.jpaTEST.templates;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import org.hibernate.annotations.Generated;

@Entity
@Table(name = "clients")
public class Client extends User implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", unique = true)
  private int id;

  @Column(name = "FIRST_NAME", nullable = false)
  private String fName;

  @Column(name = "LAST_NAME", nullable = false)
  private String lName;

  @Column(name = "EMAIL", nullable = false, unique = true)
  private String email;

  @Column(name = "USERNAME", nullable = false, unique = true)
  private String username = getUsername();

  @Column(name = "PASSWORD", nullable = false)
  private char password = getPassword();

  @Column(name = "PHONE", nullable = false, unique = true)
  private String phone;

  @Column(name = "ROLES", nullable = false)
  private User.Roles role;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Agent.class, mappedBy = "clientAgents")
  private List<Agent> agent;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Owner.class, mappedBy = "clientOwners")
  private List<Owner> owner;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getfName() {
    return this.fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return this.lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setUsername(String uname){
    this.username = uname;
  }

  public String getClientUsername() {
    return this.username;
  }

  public void setPassword(char pword){
    this.password = pword;
  }

  public char getClientPassword() {
    return this.password;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Roles getRole() {
    return this.role;
  }

  public void setRole(Roles role) {
    this.role = role;
  }

  public List<Agent> getAgent() {
    return this.agent;
  }

  public void setAgent(List<Agent> agent) {
    this.agent = agent;
  }

  public List<Owner> getOwner() {
    return this.owner;
  }

  public void setOwner(List<Owner> owner) {
    this.owner = owner;
  }
}
