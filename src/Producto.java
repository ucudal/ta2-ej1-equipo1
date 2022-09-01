/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Martin
 */
public class Producto implements IProducto {
    
    private Comparable codigoProducto;
    private String nombre;
    private int precio;
    private int stock;
    
    public Producto(Comparable codigoProducto, String nombre, int precio, int stock) {
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }

    @Override
    public Comparable getCodProducto() {
        return codigoProducto;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer getStock() {
        return stock; 
    }
    

    public void setStock(int valor){
        stock = valor < 0 ? 0 : valor;
    }

    @Override
    public void agregarCantidadStock(Integer stock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void restarCantidadStock(Integer stock) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
