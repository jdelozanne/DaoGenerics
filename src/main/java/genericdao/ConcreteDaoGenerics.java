/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericdao;

/**
 *
 * @author julia
 * @param <T>
 */
public class ConcreteDaoGenerics <T> extends AbstractDaoGenerics<T> implements InterfaceDaoGenerics<T>{

    public ConcreteDaoGenerics() {
        super();
    }
    
    public ConcreteDaoGenerics(Class<T> type) {
        super(type);
    }

    @Override
    public void save(T domain) {
        super.save(domain); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(T domain) {
        super.delete(domain); //To change body of generated methods, choose Tools | Templates.
    }
    
}
