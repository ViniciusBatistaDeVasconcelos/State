package model;

public class ConsultaEstadoRemarcada extends ConsultaEstado {

    private ConsultaEstadoRemarcada() {
    }

    private static ConsultaEstadoRemarcada instance = new ConsultaEstadoRemarcada();

    public static ConsultaEstadoRemarcada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Consulta Remarcada!";
    }

    public boolean agendar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoAgendada.getInstance());
        return true;
    }
}