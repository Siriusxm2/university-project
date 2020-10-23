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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "agents")
public class Agent implements Serializable {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "ID", unique = true)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Client.class)
  @JoinColumn(name = "Client_ID", referencedColumnName = "ID")
  private List<Client> clientAgents;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Location.class)
  @JoinColumn(name = "Locations_ID", referencedColumnName = "CITY")
  private Location agentLocation;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Warehouse.class, mappedBy = "whsAgent")
  private List<Warehouse> whs;

  @Column(name = "RATING", nullable = false)
  private double rating;

  @Column(name = "SALARY", nullable = false)
  private int salary;

  public int getAgentId() {
    return this.id;
  }

  public void setAgentId(int id) {
    this.id = id;
  }

  public List<Client> getClientAgents() {
    return this.clientAgents;
  }

  public void setClientAgents(List<Client> clientAgents) {
    this.clientAgents = clientAgents;
  }

  public Location getAgentLocation() {
    return this.agentLocation;
  }

  public void setAgentLocation(Location agentLocation) {
    this.agentLocation = agentLocation;
  }

  public List<Warehouse> getWhs() {
    return this.whs;
  }

  public void setWhs(List<Warehouse> whs) {
    this.whs = whs;
  }
}
