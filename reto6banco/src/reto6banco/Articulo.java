package reto6banco;

public class Articulo {

    private String nombre = "vacio";
    private String descripcion = "no hay nada.";
    private double valorEstimado = 0.0;

    public Articulo(String nombre, String descripcion, double valorEstimado) { //constructor
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorEstimado = valorEstimado;
    }

    public Articulo() { //constructor vacio.
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    @Override
    public String toString() {
        return "nombre: " + getNombre() + ", descripcion: " + getDescripcion() + ", valorEstimado: " + getValorEstimado() + '}';
    }

}
