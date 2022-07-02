package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class ConsultaEstadoAgendadaTest {

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
    }

    @Test
    public void naoDeveAgendarConsulta() {
        assertFalse(consulta.agendar());
    }

    @Test
    public void deveRemarcarConsulta() {
        assertTrue(consulta.remarcar());
    }

    @Test
    public void deveCancelarConsulta() {
        assertTrue(consulta.cancelar());
    }

    @Test
    public void deveRealizarConsulta() {
        assertTrue(consulta.realizar());
    }

    @Test
    public void naoDeveAguardarRetornoConsulta() {
        assertFalse(consulta.aguardarRetorno());
    }
}