public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo, soy Piero!");
        
        // Crear objeto cliente
        Cliente cliente = new Cliente("Juan Pérez", "12345678");
        // Crear objeto factura
        Factura factura = new Factura(cliente);
        // Agregar productos
        factura.agregarProducto(new Producto("Arroz", 3.50, 2));
        factura.agregarProducto(new Producto("Azúcar", 4.00, 1));
        factura.agregarProducto(new Producto("Aceite", 10.00, 1));
        // Imprimir factura
        factura.imprimirFactura();
    }
}