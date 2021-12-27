package funcionalidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.CateSubCate;
import modelo.Categoria;
import modelo.Material;
import modelo.subCategoria;
import utilidad.PhpMysqlConnection;

public class OperacionMaterial {

    public List<Categoria> listadoCategoria() {
        List<Categoria> lista = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = PhpMysqlConnection.getConnection();
            pst = cn.prepareStatement("SELECT * FROM tblcategoria");
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Categoria(0, rs.getString(2)));
            }
        } catch (SQLException e) {
            System.out.println("Error en la sentencia listado categoria: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
        }
        return lista;
    }

    public List<subCategoria> listadoSubCategoria() {
        List<subCategoria> lista = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = PhpMysqlConnection.getConnection();
            pst = cn.prepareStatement("SELECT * FROM tblsubcategoria");
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new subCategoria(0, rs.getString(2)));
            }
        } catch (SQLException e) {
            System.out.println("Error en la sentencia listado tblsubcategoria: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
        }
        return lista;
    }

    public int buscarIdSubCate_and_Categoria(int idCategoria, int idSubCate) {
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = PhpMysqlConnection.getConnection();
            pst = cn.prepareStatement("call buscarCateSubCate(?,?)");
            pst.setInt(1, idCategoria);
            pst.setInt(2, idSubCate);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error en la sentencia listado busca catesub: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
        }
        return -1;
    }

    public List<Material> listadoMaterial() {
        List<Material> lista = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = PhpMysqlConnection.getConnection();
            pst = cn.prepareStatement("call listadoMaterial()");
            rs = pst.executeQuery();
            while (rs.next()) {

                lista.add(new Material(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
                        rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),
                        rs.getString(15), rs.getString(16), rs.getString(17),
                        new CateSubCate(
                                rs.getInt(18),
                                new Categoria(rs.getInt(22), rs.getString(23)),
                                new subCategoria(rs.getInt(24), rs.getString(25))))
                );
            }
        } catch (SQLException e) {
            System.out.println("Error en la sentencia listado tblsubcategoria: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
        }
        return lista;
    }
  public List<Material> listadoStockBajo(int n) {
        List<Material> lista = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = PhpMysqlConnection.getConnection();
            pst = cn.prepareStatement("call MaterialStokBajo(?)");
            pst.setInt(1, n);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Material(rs.getString(2),rs.getString(1)));
            }
        } catch (SQLException e) {
            System.out.println("Error en la sentencia listado stockBajo: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
        }
        return lista;
    }

    public boolean EliminarMaterial(int id) {

        Connection cn = null;
        PreparedStatement pst = null;
        try {
            cn = PhpMysqlConnection.getConnection();
            pst = cn.prepareStatement("delete from tblmaterial where idMaterial = ?");
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error en la sentencia eliminar material: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }

    public boolean saveMaterial(Material m) {

        Connection cn = null;
        PreparedStatement pst = null;
        try {
            cn = PhpMysqlConnection.getConnection();
            pst = cn.prepareStatement("call sp_save(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, m.getIdMaterial());
            pst.setString(2, m.getNombre());
            pst.setString(3, m.getCiveq());
            pst.setString(4, m.getKimax());
            pst.setString(5, m.getSinMarca());
            pst.setString(6, m.getPirex());
            pst.setString(7, m.getSimax());
            pst.setString(8, m.getBrand());
            pst.setString(9, m.getSchott_duran());
            pst.setString(10, m.getPkMexico());
            pst.setString(11, m.getSuperiekborosilicate());
            pst.setString(12, m.getGlass());
            pst.setString(13, m.getP_e());
            pst.setString(14, m.getVolumen());
            pst.setString(15,m.getCantidad());
            pst.setString(16, m.getUbicacion());
            pst.setString(17, m.getObservaciones());
            pst.setInt(18, m.getCateSubCate().getIdCateSubCate());
            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error en la sentencia save material: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
            }
        }
        return false;
    }
    
  public Material buscarMaterial(int id) {

        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs;
        try {
            cn = PhpMysqlConnection.getConnection();
               pst = cn.prepareStatement
      ("call buscaMaterial(?)");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if(rs.next()){
            return new Material(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10),
                        rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14),
                        rs.getString(15), rs.getString(16), rs.getString(17),
                        new CateSubCate(
                                rs.getInt(18),
                                new Categoria(rs.getInt(22), rs.getString(23)),
                                new subCategoria(rs.getInt(24), rs.getString(25))));

                
            }
        } catch (SQLException e) {
            System.out.println("Error en la sentencia where material: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
            }
        }
        return null;
    }
}
