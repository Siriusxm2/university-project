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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "locations")
public class Location implements Serializable {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "ID", unique = true)
  private int id;

  @Column (name = "CITY", nullable = false)
  private String cityName;

  @Column (name = "MUNICIPALITY", nullable = false)
  private String munName;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Agent.class, mappedBy = "agentLocation")
  private List<Agent> agent;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Warehouse.class, mappedBy = "whsLocation")
  private List<Warehouse> whsLocation;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCityName() {
    return this.cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public String getMunName() {
    return this.munName;
  }

  public void setMunName(String munName) {
    this.munName = munName;
  }

  public List<Agent> getAgent() {
    return this.agent;
  }

  public void setAgent(List<Agent> agent) {
    this.agent = agent;
  }

  public List<Warehouse> getWhsLocation() {
    return this.whsLocation;
  }

  public void setWhsLocation(List<Warehouse> whsLocation) {
    this.whsLocation = whsLocation;
  }
}
