package Ejercicio15_envioEncomiendas;

public class Paquete {
    private String codigo;
    private String destino;
    private String estado;

    public Paquete(String codigo, String destino) {
        this.codigo = codigo;
        this.destino = destino;
        this.estado = "En Depósito";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
