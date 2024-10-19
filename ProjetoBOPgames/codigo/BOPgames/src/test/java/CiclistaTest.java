import controller.CiclistaController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import view.CiclistaView;

import static org.mockito.Mockito.*;

public class CiclistaTest {

    private CiclistaController controller;
    private CiclistaView view;

    @BeforeEach
    public void setUp() {
        view = Mockito.mock(CiclistaView.class);
        controller = new CiclistaController(view);
    }

    @Test
    public void testIniciar() {
        controller.iniciar();
        verify(view, times(1)).iniciar();
    }

    @Test
    public void testAdicionarEtapaParaCiclistas() {
        when(view.getNumeroEtapa()).thenReturn(1);
        when(view.getNomeCiclista1()).thenReturn("Ciclista 1");
        when(view.getDuracaoCiclista1()).thenReturn(120);
        when(view.getNomeCiclista2()).thenReturn("Ciclista 2");
        when(view.getDuracaoCiclista2()).thenReturn(110);

        controller.adicionarEtapaParaCiclistas();

        verify(view).mostrarResultado("Vencedor da Etapa 1: Ciclista 2");
        verify(view).mostrarResultado("Diferença de tempo entre os dois ciclistas: 10 segundos.");
        verify(view).mostrarResultado("Líder Geral: Ciclista 2");
    }

    @Test
    public void testAdicionarEtapaParaCiclistasComMesmoTempo() {
        when(view.getNumeroEtapa()).thenReturn(2);
        when(view.getNomeCiclista1()).thenReturn("Ciclista 1");
        when(view.getDuracaoCiclista1()).thenReturn(130);
        when(view.getNomeCiclista2()).thenReturn("Ciclista 2");
        when(view.getDuracaoCiclista2()).thenReturn(130);

        controller.adicionarEtapaParaCiclistas();

        verify(view).mostrarResultado("Vencedor da Etapa 2: Ciclista 1");
        verify(view).mostrarResultado("Diferença de tempo entre os dois ciclistas: 0 segundos.");
        verify(view).mostrarResultado("Líder Geral: Ciclista 1");
    }

    @Test
    public void testAdicionarEtapaParaCiclistasErro() {
        when(view.getNumeroEtapa()).thenThrow(new RuntimeException("Falha ao obter etapa"));

        controller.adicionarEtapaParaCiclistas();

        verify(view).mostrarResultado("Erro ao adicionar etapa: Falha ao obter etapa");
    }
}

