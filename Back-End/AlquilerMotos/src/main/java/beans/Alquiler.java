
package beans;

import java.sql.Date;


public class Alquiler {
    private int id;
    private int username;
    private Date fecha; 
    private String cilindraje;
    private boolean ultimo_modelo;

    public Alquiler(int id, int username, Date fecha, String cilindraje, boolean ultimo_modelo) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.cilindraje = cilindraje;
        this.ultimo_modelo = ultimo_modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isUltimo_modelo() {
        return ultimo_modelo;
    }

    public void setUltimo_modelo(boolean ultimo_modelo) {
        this.ultimo_modelo = ultimo_modelo;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", cilindraje=" + cilindraje + ", ultimo_modelo=" + ultimo_modelo + '}';
    }
    
    

   
    
}
  
    

