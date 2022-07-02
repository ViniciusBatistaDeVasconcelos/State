package model;

public class ConsultaEstadoRealizada extends ConsultaEstado {

    private ConsultaEstadoRealizada() {
    }

    private static ConsultaEstadoRealizada instance = new ConsultaEstadoRealizada();

    public static ConsultaEstadoRealizada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Consulta Realizada!";
    }

    public boolean aguardarRetorno(Consulta consulta) {
        consulta.setEstado(ConsultaEstadoAguardandoRetorno.getInstance());
        return true;
    }
}