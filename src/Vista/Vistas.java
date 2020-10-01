/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import testagendatelefonica.Agenda;
import testagendatelefonica.Cliente;

/**
 *
 * @author MArio
 */
public class Vistas {
    
    public static void AgregarCliente(Agenda age){
        Long telefono;
         System.out.println("----------------------------------****-----------------------------------------");
        System.out.println("");
        System.out.println("Esta gregando clientes");
        Cliente cliente1=new Cliente("avaca", "mario", 30377673, "san luis");
        telefono=Long.parseLong("2664222979");
        age.agregarCliente(telefono, cliente1);
        //Probando que no ingrese numero de tel repetido
        Cliente cliente2=new Cliente("avaca", "mario", 30377673, "san luis");
        telefono=Long.parseLong("2664222979");
        age.agregarCliente(telefono, cliente2);
        Cliente cliente3=new Cliente("juarez", "belen", 31356168, "san luis");
        telefono=Long.parseLong("2664548476");
        age.agregarCliente(telefono, cliente3);
        Cliente cliente4=new Cliente("avaca", "mario", 30377673, "san luis");
        telefono=Long.parseLong("2664778899");
        age.agregarCliente(telefono, cliente4);
        Cliente cliente5=new Cliente("perez", "juan", 306666777, "san luis");
        telefono=Long.parseLong("2664445566");
        age.agregarCliente(telefono, cliente5);
        Cliente cliente6=new Cliente("gonzalez", "pedro", 30888999, "san luis");
        telefono=Long.parseLong("2664112233");
        age.agregarCliente(telefono, cliente6);
        System.out.println("");
    }
    public static void buscarCliente(Agenda age){
        System.out.println("----------------------------------****-----------------------------------------");
        System.out.println();
        System.out.println("Va a buscar un cliente por el numero de celular");
        Long telefono=Long.parseLong("2664548476");
        //System.out.println("Ingrese el numero telefonico");
        System.out.println("El cliente encontrado es: "+ age.buscarCliente(telefono).getApellido());
        System.out.println("");
    }
    public static void buscarTelefono(Agenda age){
        System.out.println("----------------------------------****-----------------------------------------");
        System.out.println("");
        System.out.println("Va a buscar un telefono por el apellido");
        String apellido="juarez";
        Set<Long> aux=new HashSet<>();
        //System.out.println("Ingrese el apellido del cliente");
        aux=age.buscarTelefono(apellido);
        System.out.print("Los Telefonos encontrados son: ");
        for(Long it: aux){
            System.out.println(it.toString());
        }

        System.out.println("");
    }
    public static void buscarClientes(Agenda age){
         System.out.println("----------------------------------****-----------------------------------------");
        System.out.println();
        System.out.println("Va a buscar un cliente por provincia");
        Set <Cliente> aux= new HashSet<>();
        String ciudad;
        ciudad="san luis";
        System.out.println("Los clientes encontrados son: ");
        aux=age.buscarClientes(ciudad);
        for(Cliente it: aux){
            System.out.println(it.getApellido()+" "+it.getNombre());
        }
        System.out.println("");
    }
    public static void borrarCliente(Agenda age){
        long dni;
        dni = 30377673;
         System.out.println("----------------------------------****-----------------------------------------");
        System.out.println();
        System.out.println("Va a borrar un cliente");
        age.borrarCliente(dni);
        //System.out.println("El cliente a sido borrado con exito y es: "+ age.borrarCliente(dni).getApellido());
        System.out.println("");
    }
    public static void mostrarAgenda(Agenda age){
        Map <Long, Cliente> aux=new HashMap<>();
        aux=age.getDirectorio();
        System.out.println("Mostrando Agenda");
        for(Map.Entry<Long,Cliente> it: aux.entrySet()){
            System.out.println("----------------------------------****-----------------------------------------");
            System.out.println("Apellido: "+it.getValue().getApellido()+"  Telefono: "+it.getKey().toString()+ " DNI: "+it.getValue().getDni());
        }
        System.out.println("");
    }
    
}
