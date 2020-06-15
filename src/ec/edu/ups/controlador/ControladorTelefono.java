/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefonoDao;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.IngresoTelefono;
import java.util.ArrayList;

/**
 *
 * @author Lisseth Reinoso
 */
public class ControladorTelefono {
    
    private IngresoTelefono ingresoT;
    private ITelefonoDao telefonoDao;

    public ControladorTelefono() {
    }

    public ControladorTelefono(IngresoTelefono ingresoT, ITelefonoDao telefonoDao) {
        this.ingresoT = ingresoT;
        this.telefonoDao = telefonoDao;
    }
    
    public void ingresarTelefono(Telefono telefono){
        telefonoDao.create(telefono);
    }
    
    public ArrayList<Telefono> mostrarT(){
        return telefonoDao.mostrar();
        }
}
