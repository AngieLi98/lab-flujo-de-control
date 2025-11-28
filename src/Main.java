//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n  Su factura es de: ");
        FacturacionSupermercado.calcularTotal(15000, 7,true);
        FacturacionSupermercado.calcularTotal(20000,12,false);

        System.out.println("\n  Veterinario: ");
        ClasificacionMascotas.tipoDeMascota("perro", 7);
        ClasificacionMascotas.tipoDeMascota("ave",3);
        ClasificacionMascotas.tipoDeMascota("pez",2);

        System.out.println("\n  Tarifa de su vehiculo: ");
        ControlParqueadero.tipoDeTarifa("moto", 21);
        ControlParqueadero.tipoDeTarifa("bicicleta", 16);

        System.out.println("\n Tienda de Ropa");
        PromocionTiendaRopa.precioPrenda("camisa",7);
        PromocionTiendaRopa.precioPrenda("pantalon",3);
    }
}