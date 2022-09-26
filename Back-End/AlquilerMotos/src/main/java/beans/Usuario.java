
package beans;


public class Usuario {
    private String username;
    private String contrasena;
    private String nombres;
    private String apellidos;
    private String email;
    private double saldo;
    private boolean calificacion;
    private boolean tipo_calificacion;  

    public Usuario(String username, String contrasena, String nombres, String apellidos, String email, double saldo, boolean calificacion, boolean tipo_calificacion) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.saldo = saldo;
        this.calificacion = calificacion;
        this.tipo_calificacion = tipo_calificacion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isCalificacion() {
        return calificacion;
    }

    public void setCalificacion(boolean calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isTipo_calificacion() {
        return tipo_calificacion;
    }

    public void setTipo_calificacion(boolean tipo_calificacion) {
        this.tipo_calificacion = tipo_calificacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", saldo=" + saldo + ", calificacion=" + calificacion + ", tipo_calificacion=" + tipo_calificacion + '}';
    }
    
}
