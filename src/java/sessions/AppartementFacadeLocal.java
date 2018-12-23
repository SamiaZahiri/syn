/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import beans.Appartement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author a
 */
@Local
public interface AppartementFacadeLocal {

    void create(Appartement appartement);

    void edit(Appartement appartement);

    void remove(Appartement appartement);

    Appartement find(Object id);

    List<Appartement> findAll();

    List<Appartement> findRange(int[] range);

    int count();
    
}
