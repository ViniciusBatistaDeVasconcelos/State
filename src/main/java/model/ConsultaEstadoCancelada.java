package model;

public class ConsultaEstadoCancelada extends ConsultaEstado {

    private ConsultaEstadoCancelada() {
    }

    private static ConsultaEstadoCancelada instance = new ConsultaEstadoCancelada();

    public static ConsultaEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Consulta Cancelada!";
    }
}