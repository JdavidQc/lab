package modelo;

public class Material {

    private int idMaterial;
    private String nombre;
    private String civeq;
    private String kimax;
    private String sinMarca;
    private String pirex;
    private String simax;
    private String brand;
    private String schott_duran;
    private String pkMexico;
    private String superiekborosilicate;
    private String glass;
    private String p_e;
    private String volumen;
    private String cantidad;
    private String ubicacion;
    private String observaciones;
    private CateSubCate cateSubCate;

    public Material(int idMaterial, String nombre, String cantidad, String ubicacion, CateSubCate cateSubCate) {
        this.idMaterial = idMaterial;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.cateSubCate = cateSubCate;
    }

    public Material(String nombre, String cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Material(int idMaterial, String nombre, String volumen, String cantidad, String ubicacion, CateSubCate cateSubCate) {
        this.idMaterial = idMaterial;
        this.nombre = nombre;
        this.volumen = volumen;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.cateSubCate = cateSubCate;
    }

    public Material(int idMaterial, String nombre, String civeq, String kimax, String sinMarca, String pirex, String simax, String brand, String schott_duran, String pkMexico, String superiekborosilicate, String glass,
            String p_e, String volumen, String cantidad, String ubicacion, String observaciones, CateSubCate cateSubCate) {
        this.idMaterial = idMaterial;
        this.nombre = nombre;
        this.civeq = civeq;
        this.kimax = kimax;
        this.sinMarca = sinMarca;
        this.pirex = pirex;
        this.simax = simax;
        this.brand = brand;
        this.schott_duran = schott_duran;
        this.pkMexico = pkMexico;
        this.superiekborosilicate = superiekborosilicate;
        this.glass = glass;
        this.p_e = p_e;
        this.volumen = volumen;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.observaciones = observaciones;
        this.cateSubCate = cateSubCate;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiveq() {
        return civeq;
    }

    public void setCiveq(String civeq) {
        this.civeq = civeq;
    }

    public String getKimax() {
        return kimax;
    }

    public void setKimax(String kimax) {
        this.kimax = kimax;
    }

    public String getSinMarca() {
        return sinMarca;
    }

    public void setSinMarca(String sinMarca) {
        this.sinMarca = sinMarca;
    }

    public String getPirex() {
        return pirex;
    }

    public void setPirex(String pirex) {
        this.pirex = pirex;
    }

    public String getSimax() {
        return simax;
    }

    public void setSimax(String simax) {
        this.simax = simax;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSchott_duran() {
        return schott_duran;
    }

    public void setSchott_duran(String schott_duran) {
        this.schott_duran = schott_duran;
    }

    public String getPkMexico() {
        return pkMexico;
    }

    public void setPkMexico(String pkMexico) {
        this.pkMexico = pkMexico;
    }

    public String getSuperiekborosilicate() {
        return superiekborosilicate;
    }

    public void setSuperiekborosilicate(String superiekborosilicate) {
        this.superiekborosilicate = superiekborosilicate;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getP_e() {
        return p_e;
    }

    public void setP_e(String p_e) {
        this.p_e = p_e;
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public CateSubCate getCateSubCate() {
        return cateSubCate;
    }

    public void setCateSubCate(CateSubCate cateSubCate) {
        this.cateSubCate = cateSubCate;
    }

}
