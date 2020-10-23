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

@Entity
@Table(name = "categories")
public class Category implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", unique = true)
  private int id;

  @Column(name = "C_NAME", nullable = false)
  private String category;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Warehouse.class, mappedBy = "whsCategory")
  private List<Warehouse> warehouses;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public List<Warehouse> getWarehouses() {
    return this.warehouses;
  }

  public void setWarehouses(List<Warehouse> whsCategory) {
    this.warehouses = whsCategory;
  }
}
