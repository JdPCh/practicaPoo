/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnologiasavanzadas.practicapoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Estudiante_MCA
 */
public class InscripcionesPersonas {
    
    private
    
    ArrayList<Persona> listado;


    public
    
    @Override
    String toString(){
        String resultado = "Personas Inscritas: \n";
        for(Persona persona : listado){
            resultado += persona + "\n\n";
        }
        return resultado;
    }
    
    InscripcionesPersonas() {
        this.listado = new ArrayList();
    }
    
    InscripcionesPersonas(ArrayList<Persona> listado) {
        this.listado = listado;
    }

    ArrayList<Persona> getListado() {
        return listado;
    }

    void setListado(ArrayList<Persona> listado) {
        this.listado = listado;
    }
    
    void inscribir(Persona persona){
        listado.add(persona);
        System.out.println("Persona inscrita correctamente");
    };
    void eliminar(Persona persona){
        listado.remove(persona);
        System.out.println("Persona eliminada correctamente");
    };
    void actualizar(Persona persona){
        
        
    };
    void guardarInformacion(Persona persona){
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter("src/main/java/OtherResources/Personas.txt", true));
            escritor.write("Id: " + persona.getId() + ", ");
            escritor.write("Nombre: " + persona.getNombre() + ", ");
            escritor.write("Apellido: " + persona.getApellido() + ", ");
            escritor.write("Email: " + persona.getEmail());
            escritor.newLine();
            escritor.flush();
            System.out.println("Persona guardada correctamente");
        }
        catch(IOException e){
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    };
    void cargarDatos(){

        try (BufferedReader lector = new BufferedReader(new FileReader("src/main/java/OtherResources/Personas.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) { 
                 String[] partes = linea.split(", ");
                 
                 String id = partes[0].split(": ")[1]; 
                 String nombre = partes[1].split(": ")[1]; 
                 String apellido = partes[2].split(": ")[1]; 
                 String email = partes[3].split(": ")[1]; 
                 
                 Persona persona = new Persona();
                 
                 persona.setId(Double.valueOf(id));
                 persona.setNombre(nombre);
                 persona.setApellido(apellido);
                 persona.setEmail(email);
                 
                 listado.add(persona);
            }
            System.out.println("Personas cargadas con exito: ");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    
    };
}
