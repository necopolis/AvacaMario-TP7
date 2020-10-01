/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagendatelefonica;

import Vista.Vistas;

/**
 *
 * @author MArio
 */
public class TestAgendaTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agenda directorioSL=new Agenda();
        Vistas.AgregarCliente(directorioSL);
        Vistas.mostrarAgenda(directorioSL);
        Vistas.buscarCliente(directorioSL);
        Vistas.buscarTelefono(directorioSL);
        Vistas.buscarClientes(directorioSL);
        Vistas.borrarCliente(directorioSL);
        Vistas.mostrarAgenda(directorioSL);
                      
    }
    
}
