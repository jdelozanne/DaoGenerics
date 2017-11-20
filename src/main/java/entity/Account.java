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
public class Account implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int id;
    @Column
    private String naam;

    public Account() {
    }

    public Account(String naam) {
        this.naam = naam;
    }

    public Account(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
