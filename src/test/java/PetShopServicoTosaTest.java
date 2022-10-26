import factory.PetShopServicoFactory;
import interfaces.PetShopServico;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PetShopServicoTosaTest {

    @Test
    public void executarTest(){
        PetShopServico petShopServico = PetShopServicoFactory.criarServico("Tosa");
        assertEquals("Seu animal foi tosado",petShopServico.executar());
    }

    @Test
    public void cobrarTest(){
        PetShopServico petShopServico = PetShopServicoFactory.criarServico("Tosa");
        assertEquals("Este serviço custou 30 reais.",petShopServico.cobrar());
    }
}
