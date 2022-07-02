package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class ConsultaEstadoRealizadaTest {
    Consulta consulta;

    @BeforeEach
    void setUp() {
        LocalDateTime data = LocalDateTime.of(
                2022, Month.JULY, 29,
                19, 30, 40);

        consulta = new Consulta(
                data,
                "Rua das Palmeiras, N°1000",
                "A presença de um acompanhate maior de idade é obrigatória"
        );
        consulta.setEstado(ConsultaEstadoRealizada.getInstance());
    }

    @Test
    public void naoDeveAgendarConsulta() {
        assertFalse(consulta.agendar());
    }

    @Test
    public void naoDeveRemarcarConsulta() {
        assertFalse(consulta.remarcar());
    }

    @Test
    public void naoDeveCancelarConsulta() {
        assertFalse(consulta.cancelar());
    }

    @Test
    public void naoDeveRealizarConsulta() {
        assertFalse(consulta.realizar());
    }

    @Test
    public void deveAguardarRetornoConsulta() {
        assertTrue(consulta.aguardarRetorno());
    }
}