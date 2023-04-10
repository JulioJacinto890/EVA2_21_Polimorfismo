/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_polimorfismo;

/**
 *
 * @author hp
 */
public class EVA2_21_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Estudiante est1=new Estudiante("22550291", "Julio", "Jacinto", 18);
        
        est1.imprimirDatos();
        
        Docentes doc1=new Docentes("442", "Juan", "Garcia", 40);
        
        doc1.imprimirDatos();
        
        
        //polimorfismo
        //una variable de tipo persona 
        
        //es un estudiante pero lo va a tratar como una persona
        //lo convierte en una persona y oculta cosas
        Peronsa perso1=est1;
//        perso1.13
        
       Peronsa perso2=doc1;
        
       Peronsa perso3=new Peronsa();
        
        
        //se pueden ocultar cosas pero no agregar7
//        Estudiante est2=perso3;
        
        
        //is a--- extends, impplements
        //estudiante is a persona--- si
        //persona is a estudiante---- no  
    }
    
}