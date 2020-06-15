/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDao;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TelefonoDao implements ITelefonoDao {

    
    private ArrayList listaT;

    public TelefonoDao() {
        
         listaT=new ArrayList<Telefono>();
    }

    @Override
    public void create(Telefono telefono) {
       
        listaT.add(telefono);
    }

    @Override
    public Telefono read(String codigo) {
       return null;
    }

    @Override
    public void update(Telefono telefono) {
       
    }

    @Override
    public void delete(Telefono telefono) {
       
    }

    @Override
    public ArrayList<Telefono> mostrar() {
      return listaT;
    }
    
}
