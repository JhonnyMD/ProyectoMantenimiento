/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.persistencia;

import co.edu.unicolombo.pb.datos.Salones;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author POWERGROUP
 */
public class Almacenamiento {
    public static String rutaBase = System.getProperty("user.home") +File.separator+"mis datos";
    public static String nombreArchivo = "datos.txt";
    
    public static void guardar(HashMap<String, Salones> bd) throws IOException{
        
        String rutacompleta = rutaBase+ File.separator+nombreArchivo;
        File archivo = new File (rutacompleta);
        
        


        if(!archivo.exists()){
           
            File carpeta = new File(archivo.getParent());
            
            if(!carpeta.exists()){
                carpeta.mkdir();
            }
            
            
            archivo.createNewFile();
            
        
        }
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
        
        oos.writeObject(bd);
        
    }
    
    public static HashMap<String, Salones> recuperar() throws Exception{
        
        String rutacompleta = rutaBase+ File.separator+nombreArchivo;
        File archivo = new File (rutacompleta);
        
        if(!archivo.exists()){
            
            archivo.createNewFile();
            
            throw new Exception("La base de datos esta vacia");
            
        }
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
        
        HashMap<String, Salones> SalonesBD = (HashMap<String, Salones>) ois.readObject();
        
        return SalonesBD;
        
    
    
    }
}
