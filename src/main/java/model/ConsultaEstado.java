package model;

public abstract class ConsultaEstado {

    public abstract String getEstado();

    public boolean agendar(Consulta consulta) {
        return false;
    }

    public boolean remarcar(Consulta consulta) {
        return false;
    }

    public boolean cancelar(Consulta consulta) {
        return false;
    }

    public boolean realizar(Consulta consulta) {
        return false;
    }

    public boolean aguardarRetorno(Consulta consulta) {
        return false;
    }

}
