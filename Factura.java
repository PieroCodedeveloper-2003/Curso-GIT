import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    /* Atributos */
    Cliente cliente;
    List<Producto> productos;
    Date fecha;
    /* Constructor con parámetros */
    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date(); // Fecha actual
    }
    /* Método agregarProducto */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    /* Método calcularTotal */
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getSubtotal();
        }
        return total;
    }
    /* Método imprimirFactura */
    public void imprimirFactura() {
        System.out.println("====== FACTURA ======");
        System.out.println("Cliente: " + cliente.nombre + " | DNI: " + cliente.dni);
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("- " + p.nombre + " x" + p.cantidad + " = S/." + p.getSubtotal());
        }
        System.out.println("TOTAL: S/." + calcularTotal());
        System.out.println("=====================");
    }
}
