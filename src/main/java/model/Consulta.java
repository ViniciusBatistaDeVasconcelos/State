package model;

import java.time.LocalDateTime;

public class Consulta {

    private LocalDateTime data;
    private String local;
    private String observacao;
    private ConsultaEstado estado;

    public Consulta(LocalDateTime data, String local, String observacao) {
        this.data = data;
        this.local = local;
        this.observacao = observacao;

        this.estado = ConsultaEstadoAgendada.getInstance();
    }

    public boolean agendar() {
        return estado.agendar(this);
    }

    public boolean remarcar() {
        return estado.remarcar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean realizar() {
        return estado.realizar(this);
    }

    public boolean aguardarRetorno() {
        return estado.aguardarRetorno(this);
    }

    public ConsultaEstado getEstado() {
        return estado;
    }

    public void setEstado(ConsultaEstado estado) {
        this.estado = estado;
    }
}
