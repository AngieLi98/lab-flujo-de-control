public class ClasificacionMascotas {
    public static String tipoDeMascota(String mascotaIngresada, int edad) {
        String mascota = mascotaIngresada.toLowerCase();
        String suVeterinario = "veterinario general";

        switch (mascota) {
            case "gato":
                suVeterinario = "veterinario felino";
                if (edad > 5) {
                    System.out.println("A su gato se le recomienda vacunar");
                }
                break;

            case "perro":
                suVeterinario = "veterinario canino";
                if (edad > 5) {
                    System.out.println("A su perro se le recomienda vacunar");
                }
                break;

            case "ave":
                suVeterinario = "veterinario de animales exóticos";
                break;
            default:
                System.out.println("Otra especie");
        }

        System.out.println("Tipo de veterinario: "+ suVeterinario);
        return suVeterinario;
    }
}
