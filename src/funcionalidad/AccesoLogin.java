/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidad;

import vista.GuiPrincipal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Joption.Joption;
import Joption.Joptionx;
import utilidad.PhpMysqlConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Rol;
import modelo.Usuario;

/**
 *
 * @author E5450
 */
public class AccesoLogin {

    Joption icon = new Joption();
    Joptionx save = new Joptionx();


    public Usuario Acceso(String matricula, String contraseña) {

        Connection conexion = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conexion = PhpMysqlConnection.getConnection();
            String sql = "call accesoLogin(?,?)";
            pst = conexion.prepareStatement(sql);
            pst.setString(1, matricula);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), new Rol(rs.getString(4)), rs.getString(5), rs.getString(6));
               
            } 
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error en la sentencia de logeo: " + e.getMessage());
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccesoLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
return null;
    }

}
