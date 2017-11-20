/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import entity.Account;
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
     AbstractDaoGenerics dao = new ConcreteDaoGenerics(Product.class);
      Product p = new Product("naam", 3);
      dao.save(p);
   }   
       
public  void saveAccount() {
     Account a = new Account("naam");
     AbstractDaoGenerics dao = new ConcreteDaoGenerics(a.getClass());
      
      dao.save(a);
   }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Action a = new Action();
               a.saveProduct();
               a.saveAccount();
               
      
        
    }
    
}
