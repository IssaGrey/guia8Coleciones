/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/

package Entidad;

import java.util.Objects;

public class Tienda {
 private String producto;
 private Double precio;

    public Tienda() {
    }

    public Tienda(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tienda)) return false;
        Tienda tienda = (Tienda) o;
        return getProducto().equals(tienda.getProducto()) && getPrecio().equals(tienda.getPrecio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducto(), getPrecio());
    }

    @Override
    public String toString() {
        return
                " producto = " + producto + " precio $ " + precio ;

    }
}
