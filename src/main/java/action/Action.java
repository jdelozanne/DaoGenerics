/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import genericdao.AbstractDaoGenerics;
import genericdao.InterfaceDaoGenerics;
import entity.Product;
import genericdao.ConcreteDaoGenerics;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author julia
 */
public class Action {
 
 
 public  void saveProduct() {
     
       Product p = new Product("naam", 3);
     AbstractDaoGenerics dao = (AbstractDaoGenerics) new ConcreteDaoGenerics(Product.class);
      dao.save(p);
 
   
      
   }   
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Action a = new Action();
               //a.saveProduct();
      
        
    }
    
}
