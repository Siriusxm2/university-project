package com.jpaTEST;

import com.jpaTEST.templates.Warehouse;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestSystem {

  private final static EntityManagerFactory EMF = Persistence.createEntityManagerFactory("pu");


  public static void main(String[] args) {

    //addWarehouse(5, 325, "Good", 3, "Food", 4, 1);
    //addWarehouse(6, 125.35, "Poor", 2, "Water", 3, 0);
    listWarehousesByOccupation();
  }

  public static void addWarehouse(int id, double size, String conditions, int category, String prStored, int location, int occupied){
    EntityManager em = EMF.createEntityManager();
      em.getTransaction().begin();

      Warehouse whs = new Warehouse();
      whs.setId(id);
      whs.setSize(size);
      whs.setConditions(conditions);
      whs.setCategory(category);
      whs.setPrStored(prStored);
      whs.setLocation(location);
      whs.setOccupied(occupied);
      em.persist(whs);

      em.getTransaction().commit();
      em.close();
  }

  public static void listWarehousesByOccupation(){
    EntityManager em = EMF.createEntityManager();
    em.getTransaction().begin();

    Query q = em.createQuery("FROM Warehouse w WHERE w.occupied = 0", Warehouse.class);
    List<Warehouse> result = q.getResultList();
    for (Warehouse wh : result){
      System.out.println(wh.toString());
    }
    em.getTransaction().commit();
    em.close();
  }
}

