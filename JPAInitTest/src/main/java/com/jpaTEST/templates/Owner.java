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
@Table(name = "owners")
public class Owner implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", unique = true)
  private int id;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Client.class)
  private List<Client> clientOwners;

  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Warehouse.class, mappedBy = "owner")
  private List<Warehouse> ownedWarehouses;

  public int getOwnerId() {
    return this.id;
  }

  public void setOwnerId(int id) {
    this.id = id;
  }

  public List<Client> getClientOwners() {
    return this.clientOwners;
  }

  public void setClientOwners(List<Client> clientOwners) {
    this.clientOwners = clientOwners;
  }

  public List<Warehouse> getOwnedWarehouses() {
    return this.ownedWarehouses;
  }

  public void setOwnedWarehouses(List<Warehouse> ownedWarehouses) {
    this.ownedWarehouses = ownedWarehouses;
  }
}
