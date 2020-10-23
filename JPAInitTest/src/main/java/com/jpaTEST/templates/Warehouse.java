package com.jpaTEST.templates;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "warehouses")
public class Warehouse {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "ID", unique = true)
  private int id;

  @Column(name = "SIZE", nullable = false)
  private double size;

  @Column(name = "CONDITIONS", nullable = false)
  private String conditions;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Category.class)
  @JoinColumn(name = "Categories_ID", referencedColumnName = "C_NAME", nullable = false)
  private Category whsCategory;

  @Column(name = "PRODUCT_STORED", nullable = false)
  private String prStored;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Location.class)
  @JoinColumn(name = "Locations_ID", referencedColumnName = "CITY", nullable = false)
  private Location whsLocation;

  @Column(name = "OCCUPIED", nullable = false)
  private int occupied;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Agent.class)
  @JoinColumn(name = "Agents_ID", referencedColumnName = "ID")
  private Agent whsAgent;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Owner.class)
  @JoinColumn(name = "Owners_ID", referencedColumnName = "ID")
  private Owner owner;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getSize() {
    return this.size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public String getConditions() {
    return this.conditions;
  }

  public void setConditions(String conditions) {
    this.conditions = conditions;
  }

  public Category getWhsCategory() {
    return this.whsCategory;
  }

  public void setWhsCategory(Category whsCategory) {
    this.whsCategory = whsCategory;
  }

  public String getPrStored() {
    return this.prStored;
  }

  public void setPrStored(String prStored) {
    this.prStored = prStored;
  }

  public Location getWhsLocation() {
    return this.whsLocation;
  }

  public void setWhsLocation(Location whsLocation) {
    this.whsLocation = whsLocation;
  }

  public int getOccupied() {
    return this.occupied;
  }

  public void setOccupied(int occupied) {
    this.occupied = occupied;
  }

  public Agent getWhsAgent() {
    return this.whsAgent;
  }

  public void setWhsAgent(Agent whsAgent) {
    this.whsAgent = whsAgent;
  }

  public Owner getOwner() {
    return this.owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "Warehouse{" +
        "id=" + this.id +
        ", size=" + this.size +
        ", conditions='" + this.conditions + '\'' +
        ", whsCategory=" + whsCategory +
        ", prStored='" + this.prStored + '\'' +
        ", whsLocation=" + whsLocation +
        ", occupied=" + this.occupied +
        '}';
  }
}