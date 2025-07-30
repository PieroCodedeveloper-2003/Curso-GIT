public class Producto {
    /* Atributos */
    String nombre;
    double precio;
    int cantidad;
    /* Constructor con parámetros */
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    /* Método para calcular el subtotal */
    public double getSubtotal() {
        return precio * cantidad;
    }
}
