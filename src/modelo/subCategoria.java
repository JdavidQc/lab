package modelo;

public class subCategoria {
    
    private int subCate;
    private String nombSub;

    public subCategoria(int subCate, String nombSub) {
        this.subCate = subCate;
        this.nombSub = nombSub;
    }
  
    
    public int getSubCate() {
        return subCate;
    }

    public void setSubCate(int subCate) {
        this.subCate = subCate;
    }

    public String getNombSub() {
        return nombSub;
    }

    public void setNombSub(String nombSub) {
        this.nombSub = nombSub;
    }


    
}
