package model;

public class ConsultaEstadoAguardandoRetorno extends ConsultaEstado {

    private ConsultaEstadoAguardandoRetorno() {
    }

    private static ConsultaEstadoAguardandoRetorno instance = new ConsultaEstadoAguardandoRetorno();

    public static ConsultaEstadoAguardandoRetorno getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Consulta Cancelada!";
    }
}