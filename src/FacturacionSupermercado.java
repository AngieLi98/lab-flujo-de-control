public class FacturacionSupermercado {
    public static void calcularTotal(double valorCompra, int cantidadProductos, boolean tieneMembresia) {

        double precioTotal = valorCompra;

        if(tieneMembresia) {
            double descuento = valorCompra * 0.10;
            precioTotal = valorCompra - descuento;
        }

        if (cantidadProductos > 10) {
            double adicinal = valorCompra * 0.05;
            precioTotal = valorCompra + adicinal;
        }

        System.out.println("El total a pagar es: "+ precioTotal);
    }
}
