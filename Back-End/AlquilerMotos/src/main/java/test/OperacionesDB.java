package test;
import beans.Motos;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesDB {

    public static void main(String[] args) {
        actuaizarMotos(1,"500");
        listarMotos();
    }

    public static void actuaizarMotos(int id, String cilindraje) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE motos SET cilindraje = '" + cilindraje + " 'WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void listarMotos() {

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM motos";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String marca = rs.getString("marca");
                String cilindraje = rs.getString("cilindraje");
                String tipo = rs.getString("tipo");
                int cantidad_disponible = rs.getInt("cantidad_disponible");
                boolean ultimo_modelo = rs.getBoolean("ultimo_modelo");

                Motos moto = new Motos(id, marca, cilindraje, tipo, cantidad_disponible, ultimo_modelo);
                System.out.println(moto.toString());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
}
