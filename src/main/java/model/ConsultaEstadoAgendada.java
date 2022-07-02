package model;

public class ConsultaEstadoAgendada extends ConsultaEstado {

    private ConsultaEstadoAgendada() {
    }

    private static ConsultaEstadoAgendada instance = new ConsultaEstadoAgendada();

    public static ConsultaEstadoAgendada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Consulta Agendada!";
    }

    public boolean remarcar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoRemarcada.getInstance());
        return true;
    }

    public boolean realizar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoRealizada.getInstance());
        return true;
    }

    public boolean cancelar(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoCancelada.getInstance());
        return true;
    }
}