package modelo;

public class Usuario {

    
    private int idUsuario;
    private String nombre;
    private String apellido;
    private Rol rol;
    private String matricula;
    private String password;

    public Usuario(int idUsuario, String nombre, String apellido, Rol rol, String matricula, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.matricula = matricula;
        this.password = password;
    }
    public Usuario( String nombre, String apellido, Rol rol, String matricula, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.matricula = matricula;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
