/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import beans.Immeuble;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author a
 */
@Local
public interface ImmeubleFacadeLocal {

    void create(Immeuble immeuble);

    void edit(Immeuble immeuble);

    void remove(Immeuble immeuble);

    Immeuble find(Object id);

    List<Immeuble> findAll();

    List<Immeuble> findRange(int[] range);

    int count();
    
}
