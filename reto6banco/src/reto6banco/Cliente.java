package reto6banco;

import java.util.ArrayList;
import java.util.Hashtable;

public class Cliente {

    private Integer cedula = 0;
    private String nombre = "NN";
    private String pais = "NP";
    private int contacto = 0;
    ArrayList<Articulo> articulos = new ArrayList<>();

    public Cliente(Integer cedula, String nombre, String pais, int contacto) { //constructor 
        this.cedula = cedula;
        this.nombre = nombre;
        this.pais = pais;
        this.contacto = contacto;
    }

    public Cliente() { //constructor vacio.

    }

    public void Registrar(Hashtable banco) { //metodo que recibe un hashtable e ingresa un usuario nuevo en ese hashtable.
        Utileria tool = new Utileria();
        Cliente usuario = new Cliente(new Utileria().ingresoInteger("Ingrese su cèdula: "), tool.ingresoString("Ingrese su nombre: "), tool.ingresoString("Ingrese su pais de origen: "), Integer.parseInt(new Utileria().ingresoString("Ingrese su número de contacto: ")));//cree una nueva utileria para cada ingreso para evitar que el scanner saltara los strings 
        banco.put(usuario.getCedula(), usuario); //añadimos el usuario agregado al Hashtable pero este usuario aun no tiene articulos 
    }

    public void mostrarArticulos() { 
        for (int i = 0; i < this.articulos.size(); i++) {
            System.out.println((i + 1) + ") " + articulos.get(i).toString()); //el cliente nos muestra sus articulos almacenados
        }
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getNumerocontacto() {
        return contacto;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNumerocontacto(int contacto) {

        this.contacto = contacto;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula: " + cedula + ", nombre: " + nombre + ", pais: " + pais + ", contacto: " + contacto + ", articulos: " + articulos.toString() + '}';
    }

}
