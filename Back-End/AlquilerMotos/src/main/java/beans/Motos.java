
package beans;


public class Motos {
    private int id;
    private String marca;
    private String cilindraje;
    private String tipo;
    private int cantidad_disponible;
    private boolean ultimo_modelo;

    public Motos(int id, String marca, String cilindraje, String tipo, int cantidad_disponible, boolean ultimo_modelo) {
        this.id = id;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
        this.cantidad_disponible = cantidad_disponible;
        this.ultimo_modelo = ultimo_modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public boolean isUltimo_modelo() {
        return ultimo_modelo;
    }

    public void setUltimo_modelo(boolean ultimo_modelo) {
        this.ultimo_modelo = ultimo_modelo;
    }

    @Override
    public String toString() {
        return "Motos{" + "id=" + id + ", marca=" + marca + ", cilindraje=" + cilindraje + ", tipo=" + tipo + ", cantidad_disponible=" + cantidad_disponible + ", ultimo_modelo=" + ultimo_modelo + '}';
    }
    
    
}
