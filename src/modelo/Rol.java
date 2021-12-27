package modelo;


public class Rol {
    
    private int idrol;
    private String nombreRol;

    public Rol(String nombreRol) {
    this.nombreRol=nombreRol;
    }
     public Rol(int idrol) {
    this.idrol=idrol;
    }
    

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
}
