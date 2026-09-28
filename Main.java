package Ejercicio15_envioEncomiendas;

public class Main {
    public static void main(String[] args) {
        CentroLogistico centro = new CentroLogistico();

        CamionDeReparto camion1 = new CamionDeReparto("AB123CD");
        camion1.asignarPaquete(new Paquete("PK-001", "Rosario"));
        camion1.asignarPaquete(new Paquete("PK-002", "Córdoba"));
        CamionDeReparto camion2 = new CamionDeReparto("EF456GH");
        camion2.asignarPaquete(new Paquete("PK-003", "Mendoza"));

        centro.agregarCamion(camion1);
        centro.agregarCamion(camion2);

        centro.mostrarSituacion();
        centro.difundirEstado("En Tránsito");
        centro.mostrarSituacion();
    }
}
