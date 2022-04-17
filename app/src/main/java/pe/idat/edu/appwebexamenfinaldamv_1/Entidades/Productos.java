package pe.idat.edu.appwebexamenfinaldamv_1.Entidades;

public class Productos {
    private int cod_producto;
    private String producto;
    private String bateria;
    private String duracion;
    private int imagen;
    //
    public Productos() {
    }
    //
    public Productos(int cod_producto, String producto, String bateria, String duracion, int imagen) {
        this.cod_producto = cod_producto;
        this.producto = producto;
        this.bateria = bateria;
        this.duracion = duracion;
        this.imagen = imagen;
    }
    //
    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
