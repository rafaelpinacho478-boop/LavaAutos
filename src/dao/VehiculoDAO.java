package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Vehiculo;
import utilidades.Conexion;

public class VehiculoDAO {

    private Connection conexion;

    public VehiculoDAO() {
        conexion = Conexion.getConexion();
    }

    public boolean guardarVehiculo(Vehiculo vehiculo) {

    String sql = """
        INSERT INTO vehiculos
        (marca, modelo, color, tipo, observaciones)
        VALUES (?, ?, ?, ?, ?)
        """;

    try {

        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setString(1, vehiculo.getMarca());
        ps.setString(2, vehiculo.getModelo());
        ps.setString(3, vehiculo.getColor());
        ps.setString(4, vehiculo.getTipo());
        ps.setString(5, vehiculo.getObservaciones());

        return ps.executeUpdate() > 0;

    } catch (SQLException e) {

        System.out.println(e.getMessage());

        return false;

    }

}
    
    public ArrayList<Vehiculo> listarVehiculos() {

    ArrayList<Vehiculo> lista = new ArrayList<>();

    String sql = "SELECT * FROM vehiculos";

    try {

        Statement st = conexion.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {

            Vehiculo vehiculo = new Vehiculo();

            vehiculo.setIdVehiculo(rs.getInt("id_vehiculo"));
            vehiculo.setMarca(rs.getString("marca"));
            vehiculo.setModelo(rs.getString("modelo"));
            vehiculo.setColor(rs.getString("color"));
            vehiculo.setTipo(rs.getString("tipo"));
            vehiculo.setObservaciones(rs.getString("observaciones"));

            lista.add(vehiculo);

        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());

    }

    return lista;

}
    
    public boolean actualizarVehiculo(Vehiculo vehiculo) {

    String sql = """
        UPDATE vehiculos
        SET marca = ?,
            modelo = ?,
            color = ?,
            tipo = ?,
            observaciones = ?
        WHERE id_vehiculo = ?
        """;

    try {

        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setString(1, vehiculo.getMarca());
        ps.setString(2, vehiculo.getModelo());
        ps.setString(3, vehiculo.getColor());
        ps.setString(4, vehiculo.getTipo());
        ps.setString(5, vehiculo.getObservaciones());
        ps.setInt(6, vehiculo.getIdVehiculo());

        return ps.executeUpdate() > 0;

    } catch (SQLException e) {

        System.out.println(e.getMessage());

        return false;

    }

}
}