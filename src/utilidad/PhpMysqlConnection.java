/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author E5450
 */
public class PhpMysqlConnection {
    

	public static Connection getConnection(){
		Connection con=null;
		try {
			//Cargando Drive
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/bd_inv?useSSL=false&useTimezone=true&serverTimezone=UTC";
			String usr = "root";//mysql
			String psw = "David29";//mysql
			
			con = DriverManager.getConnection(url, usr, psw);
			
		} catch (ClassNotFoundException ex) {
			System.out.println("Error >> Driver no Instalado!!");
		}catch (SQLException ex) {
			System.out.println("Error >> de conexi�n con la BD");
		}catch (Exception ex) {
			System.out.println("Error >> general : " + ex.getMessage());
		} 
		return con;
		

	}
}
