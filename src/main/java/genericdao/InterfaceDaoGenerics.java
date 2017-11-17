/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author julia
 * @param <T>
 
 */
public interface InterfaceDaoGenerics <T> {
 
  
    public void save (T domain);
    public void delete(T domain);
}
