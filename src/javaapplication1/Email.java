/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author josue
 */
public class Email {
    
    private String savedEmail;
    private String asunto;
    private String contenido;
    private boolean read;
    
    public Email(String asunto, String content){
        this.read=false;
        this.savedEmail= savedEmail;
        this.asunto=asunto;
        this.contenido=contenido;
        
    }
    
    public boolean getRead(){
        return read;
    }
    public String getAsunto(){
        return asunto;
    }
    public String getContenido(){
        return contenido;
    }
    public String getSavedEmail(){
        return savedEmail;
    }
    
    public boolean leido(){
        read=true;
        return read;
    }
    
    public String print(){
        return "De: " + savedEmail + "\nASUNTO: " + asunto + "\nContenido: " + contenido;
    }
}
