public class PromocionTiendaRopa {
    public static double precioPrenda(String tipoDePrenda, int cantidadAcomprar) {
        String prenda = tipoDePrenda.toLowerCase();
        double precioCamisa = 30000;
        double precioPantalon = 50000;
        double precioChaqueta = 80000;
        double valorApagar = 0;

        switch (prenda) {
            case "camisa":
                valorApagar = precioCamisa * cantidadAcomprar;
                break;
            case "pantalon":
                valorApagar = precioPantalon * cantidadAcomprar;
                break;
            case "chaqueta":
                valorApagar = precioChaqueta * cantidadAcomprar;
                break;
            default:
                System.out.println("Ingresa bien el nombre del producto");
                return 0;
        }

        if (cantidadAcomprar > 5) {
            double descuento = valorApagar * 0.15;
            valorApagar -= descuento;
        }

        System.out.println("El total a pagar es: " + valorApagar);
        return valorApagar;
    }
}
