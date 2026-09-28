package Ejercicio15_envioEncomiendas;

import java.util.ArrayList;
import java.util.List;

public class CamionDeReparto {
    private String patente;
    private List<Paquete> paquetes = new ArrayList<>();

    public CamionDeReparto(String patente) {
        this.patente = patente;
    }

    public void asignarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public boolean actualizarEstadoPaquete(String codigoPaquete, String nuevoEstado) {
        boolean estadoValido = nuevoEstado.equals("En Depósito") || nuevoEstado.equals("En Tránsito") || nuevoEstado.equals("Entregado");
        if (!estadoValido) {
            return false;
        }
        for (Paquete p : paquetes) {
            if (p.getCodigo().equals(codigoPaquete)) {
                p.setEstado(nuevoEstado);
                System.out.println("  Camión " + patente + ": paquete " + codigoPaquete + " -> " + nuevoEstado);
                return true;
            }
        }
        return false;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public String getPatente() {
        return patente;
    }
}
