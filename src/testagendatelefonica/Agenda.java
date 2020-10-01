/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testagendatelefonica;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author MArio
 */
public class Agenda {
    //Atributos
    Map<Long, Cliente> directorio;
    
    //Metodos

    public Agenda() {
        this.directorio=new TreeMap<>();
    }
    
    public void agregarCliente(long telefono, Cliente cliente){
        directorio.put(telefono, cliente);
        
    }
    public Cliente buscarCliente(Long clave){
        if(directorio.containsKey(clave)){
            return directorio.get(clave);
        }
        else 
            return null;
    
    }
    public Set<Long> buscarTelefono(String apellido){
        Cliente c;
        HashSet<Long> telefonos=new HashSet<>();
        for(Long telefono: directorio.keySet()){
            c=directorio.get(telefono);
            if(c.getApellido().equals(apellido)){
                telefonos.add(telefono);
            }
        }
        return telefonos;
    }
        
    public Set<Cliente> buscarClientes(String ciudad){
        Cliente c;
        Set<Cliente> clientes=new HashSet<>();
        directorio.values().stream().filter((lugar) -> (lugar.getCiudad().equals(ciudad))).forEachOrdered((lugar) -> {
            clientes.add(lugar);
        });
        return clientes;
    }
    public void borrarCliente(long dni){
        Set <Long> telefonos= directorio.keySet();
        Iterator<Long> it= telefonos.iterator();
        Long key=null;
        while(it.hasNext()){
            key=it.next();
                if(directorio.get(key).getDni()==dni){
                    it.remove();
                }
        }
    }
    public Map<Long, Cliente> getDirectorio() {
        return directorio;
    }

    
}  
  

