package modelo;

public class CateSubCate {
    
    private int idCateSubCate;
     private Categoria categoria;
      private subCategoria subCategoria;

    public CateSubCate(int idCateSubCate, Categoria categoria, subCategoria subCategoria) {
        this.idCateSubCate = idCateSubCate;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
    }
 public CateSubCate(int idCateSubCate) {
        this.idCateSubCate = idCateSubCate;
    }

    public CateSubCate(int buscarIdSubCate_and_Categoria, Object object, Object object0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      

    public int getIdCateSubCate() {
        return idCateSubCate;
    }

    public void setIdCateSubCate(int idCateSubCate) {
        this.idCateSubCate = idCateSubCate;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public subCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(subCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }
    
}
