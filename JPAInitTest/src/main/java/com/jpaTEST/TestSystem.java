package com.jpaTEST;

// HIBERNATE
import com.jpaTEST.templates.Warehouse;
import java.io.File;
import java.lang.ModuleLayer.Controller;
import java.net.URL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
// Java FX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.stage.StageStyle;


public class TestSystem extends Application{

  private static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("pu");

  @Override
  public void start(Stage stage) throws Exception{
      Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("LoginForm.fxml"));
      System.out.println("s");
      stage.initStyle(StageStyle.UNDECORATED);
      stage.setScene(new Scene(root, 740, 400));
      stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
    //addWarehouse(5, 325, "Good", 3, "Food", 4, 1);
    //addWarehouse(6, 125.35, "Poor", 2, "Water", 3, 0);
    //listWarehousesByOccupation();
  }
  /*
  public static void addWarehouse(int id, double size, String conditions, int category, String prStored, int location, int occupied){
    EntityManager em = EMF.createEntityManager();
      em.getTransaction().begin();

      Warehouse whs = new Warehouse();
      whs.setId(id);
      whs.setSize(size);
      whs.setConditions(conditions);
      whs.setWhsCategory(category);
      whs.setPrStored(prStored);
      whs.setLocation(location);
      whs.setOccupied(occupied);
      em.persist(whs);

      em.getTransaction().commit();
      em.close();
  }
  */

  public static void listWarehousesByOccupation(TextArea ta){
    EntityManager em = EMF.createEntityManager();
    em.getTransaction().begin();

    Query q = em.createQuery("FROM Warehouse w WHERE w.occupied = 0", Warehouse.class);
    List<Warehouse> result = q.getResultList();
    for (Warehouse wh : result){
      ta.appendText(wh.toString() + "\n");
      //System.out.println(wh.toString());
    }
    em.getTransaction().commit();
    em.close();
  }
}

