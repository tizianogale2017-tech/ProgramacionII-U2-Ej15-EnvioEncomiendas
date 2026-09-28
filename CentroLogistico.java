package Ejercicio15_envioEncomiendas;

import java.util.ArrayList;
import java.util.List;

public class CentroLogistico {
    private List<CamionDeReparto> camiones = new ArrayList<>();

    public void agregarCamion(CamionDeReparto camion) {
        camiones.add(camion);
    }

    public void difundirEstado(String nuevoEstado) {
        System.out.println("[Centro] Difundiendo orden masiva: todos los paquetes -> " + nuevoEstado);
        for (CamionDeReparto camion : camiones) {
            for (Paquete p : camion.getPaquetes()) {
                camion.actualizarEstadoPaquete(p.getCodigo(), nuevoEstado);
            }
        }
    }

    public void mostrarSituacion() {
        System.out.println("=== Situación de la flota ===");
        for (CamionDeReparto camion : camiones) {
            for (Paquete p : camion.getPaquetes()) {
                System.out.println(camion.getPatente() + " | " + p.getCodigo() + " -> " + p.getDestino() + " | " + p.getEstado());
            }
        }
    }
}
