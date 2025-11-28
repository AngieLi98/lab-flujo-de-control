public class ControlParqueadero {
    public static double tipoDeTarifa(String tipoDeVehiculo, int horaDeLlegada) {
        String vehiculo = tipoDeVehiculo.toLowerCase();
        double costo = 0;

        switch (vehiculo) {
            case "auto":
                costo = 5000;
                break;
            case "moto":
                costo = 3000;
                break;
            case "bicicleta":
                costo = 1000;
                break;
            default:
                System.out.println("Por favor especifique su vehículo");
                return 0;
        }

        if (horaDeLlegada > 20) {
            double recargo = costo * 0.20;
            costo += recargo;
        }

        System.out.println("El total a pagar es: " + costo);
        return costo;
    }
}
