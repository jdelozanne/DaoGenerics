/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author julia
 */
@Entity

public class Product implements Serializable{
    
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int id;
    @Column
    private String naam;
    @Column(nullable = true)
    private int aantal;

    public Product() {
    }
    public Product(String naam, int aantal) {
        this.naam = naam;
        this.aantal = aantal;
    } 

    public Product(int id, String naam, int aantal) {
        this.id = id;
        this.naam = naam;
        this.aantal = aantal;
    } 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
