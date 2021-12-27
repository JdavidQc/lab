package modelo;

public class Categoria {
    
    private int idCategoria;
    private String nombreCate;

    public Categoria(int idCategoria, String nombreCate) {
        this.idCategoria = idCategoria;
        this.nombreCate = nombreCate;
    }

    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCate() {
        return nombreCate;
    }

    public void setNombreCate(String nombreCate) {
        this.nombreCate = nombreCate;
    }
    
}
