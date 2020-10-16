package com.jpaTEST.templates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

  @Column(name = "Categories_ID", nullable = false)
  private int category;

  @Column(name = "PRODUCT_STORED", nullable = false)
  private String prStored;

  @Column(name = "Locations_ID", nullable = false)
  private int location;

  @Column(name = "OCCUPIED", nullable = false)
  private int occupied;

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

  public int getCategory() {
    return this.category;
  }

  public void setCategory(int category) {
    this.category = category;
  }

  public String getPrStored() {
    return this.prStored;
  }

  public void setPrStored(String prStored) {
    this.prStored = prStored;
  }

  public int getLocation() {
    return this.location;
  }

  public void setLocation(int location) {
    this.location = location;
  }

  public int getOccupied() {
    return this.occupied;
  }

  public void setOccupied(int occupied) {
    this.occupied = occupied;
  }

  @Override
  public String toString() {
    return "Warehouse{" +
        "id=" + id +
        ", size=" + size +
        ", conditions='" + conditions + '\'' +
        ", category=" + category +
        ", prStored='" + prStored + '\'' +
        ", location=" + location +
        ", occupied=" + occupied +
        '}';
  }
}