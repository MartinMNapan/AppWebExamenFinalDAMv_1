package pe.idat.edu.appwebexamenfinaldamv_1.Entidad;

public class Producto {
    //
    private int id;
    private String producto;
    private String bateria;
    private String duracion;
    private int stock;

    //Constructores
    public Producto(String producto, String bateria, String duracion, int stock) {
        this.producto = producto;
        this.bateria = bateria;
        this.duracion = duracion;
        this.stock = stock;
    }

    public Producto(int id, String producto, String bateria, String duracion, int stock) {
        this.id = id;
        this.producto = producto;
        this.bateria = bateria;
        this.duracion = duracion;
        this.stock = stock;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
