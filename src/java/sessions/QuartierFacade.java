/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import beans.Quartier;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author a
 */
@Stateless
public class QuartierFacade extends AbstractFacade<Quartier> implements QuartierFacadeLocal {

    @PersistenceContext(unitName = "synPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QuartierFacade() {
        super(Quartier.class);
    }
    
}
