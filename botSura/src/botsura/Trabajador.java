/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

//import vista.inicio;

/**
 *
 * @author japb1
 */
public class Trabajador {
    public String matricula;
    public String correo;
    public String archivo;
    leerArchivo trabajadores;
    //public ArrayList<String> listaMat;
    //Scanner file;
    /**
     *
     * @param matricula
     * @param correo
     */
    
    public Trabajador(String matricula, String correo){
        this.archivo="base1.txt";
        
        
        this.matricula = matricula;
        
        // this.matricula = inicio.matricula.getText();
         this.correo=correo;
        // this.correo= inicio.correo.getText();
        
        trabajadores= new leerArchivo(archivo);
        
        
    }    
        
   
    public int buscarTrabajador(){
        int i;
        i=trabajadores.buscarTrabajador(this.matricula, this.correo);
        
        return i;
    }
    
    
    
    //concatenar la nueva matricula el correo 
    //y el resultado del quiz para ser guardado en el archivo
    //
    public String cadenaActualizacion(String resultado){
       String content = "";
       content= matricula + "," + correo + "," + resultado;
     return content;
    }

    public  void actualizarArchivo(String resultado){
        int i;
        i=this.buscarTrabajador();
        String cadena="";
        trabajadores.ActualizarArchivo(i,this.cadenaActualizacion(resultado));
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public leerArchivo getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(leerArchivo trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    
    
 
    
   
   

}