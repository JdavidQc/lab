/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionalidad;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;
import utilidad.PhpMysqlConnection;


/**
 *
 * @author C_O_L
 */
public class OperacionUsuario {

    public boolean nuevoUsuario(Usuario use) {
        Connection conexion = null;
        PreparedStatement pst = null;
        boolean bandera = false;
        try {

            conexion = PhpMysqlConnection.getConnection();
            String sql = "INSERT tblusuario (`nombre`, `apellido`, `idRol`, `matricula`, `pass`) "
                    + "VALUES (?,?, ?,?, ?);";

            pst = conexion.prepareStatement(sql);
            pst.setString(1, use.getNombre());
            pst.setString(2, use.getApellido());
            pst.setInt(3, use.getRol().getIdrol());
            pst.setString(4, use.getMatricula());
            pst.setString(5, use.getPassword());
            bandera = pst.executeUpdate() >0;
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error en la sentencia de insert usuario: " + e.getMessage());
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return bandera;

    }
    
 
}
