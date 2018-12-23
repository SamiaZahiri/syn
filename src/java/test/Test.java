/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.Ville;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.kohsuke.rngom.digested.Main;
import sessions.VilleFacade;
import sessions.VilleFacadeLocal;

/**
 *
 * @author a
 */
public class Test {

    VilleFacadeLocal villeFacade = lookupVilleFacadeLocal();

    
    public static void main(String[] args) {
        Test t = new Test();
        t.villeFacade.create(new Ville(12,"ee"));
    }

    private VilleFacadeLocal lookupVilleFacadeLocal() {
        try {
            Context c = new InitialContext();
            return (VilleFacadeLocal) c.lookup("java:global/syn/VilleFacade!sessions.VilleFacadeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
}
