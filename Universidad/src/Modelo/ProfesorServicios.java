package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfesorServicios {

    public void guardar(Connection conexion, Profesor d) throws SQLException {

        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO docente (codigo, nombre, apellido, direccion)" + "VALUES(?,?,?,?)");
            consulta.setString(1, d.getCodigo());
            consulta.setString(2, d.getNombre());
            consulta.setString(3, d.getApellido());
            consulta.setString(4, d.getDireccion());
            consulta.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }

    public void eliminar(Connection conexion, Profesor d) throws SQLException {

        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM docente WHERE `docente`.`codigo`='" + d.getCodigo() + "'");
            consulta.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
}
