/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author josue
 */
public class EmailAccount {

    private String correo;
    private String password;
    private String nombre;
    private Email[] inbox;

    public EmailAccount(String email, String contraseña, String nombre) {
        this.correo = email;
        this.password = contraseña;
        this.nombre = nombre;
        this.inbox = new Email[50];

    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean recibirEmail(Email em) {
        for (int contador = 0; contador < inbox.length; contador++) {
            if (inbox[contador] == null) {
                inbox[contador] = em;
                return true;
            }
        }
        return false;

    }

    public void printInbox() {
        System.out.println("Cuenta: " + correo + " - Nombre: " + nombre);
        System.out.println("Correos recibidos:");

        int totalCorreos = 0;
        int unreadEmails = 0;

        for (int contador = 0; contador < inbox.length; contador++) {
            if (inbox[contador] != null) {
                totalCorreos++;
                String read = inbox[contador].getRead() ? "LEIDO" : "SIN LEER";
                if (!inbox[contador].getRead()) {
                    unreadEmails++;
                }
                System.out.println((contador + 1) + " – " + inbox[contador].getSavedEmail() + " – " + inbox[contador].getAsunto() + " – " + read);
            }
        }

        System.out.println("\nTotal de correos sin leer: " + unreadEmails);
        System.out.println("Total de correos recibidos: " + totalCorreos);
    }

    public void leerEmail(int pos) {
        pos = pos - 1;
        if (pos >= 0 && pos < inbox.length && inbox[pos] != null) {
            System.out.println("Contenido del correo:");
            System.out.println(inbox[pos].getContenido());
            inbox[pos].leido();
        } else {
            System.out.println("Correo No Existe");
        }

    }

    public void borrarLeidos() {
        for (int i = 0; i < inbox.length; i++) {
            if (inbox[i] != null && inbox[i].getRead()) {
                inbox[i] = null; 
            }
        }
        System.out.println("Correos leídos eliminados.");
    }
}
