import factory.PetShopServicoFactory;
import interfaces.PetShopServico;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PetShopServicoBanhoTest {

    @Test
    public void executarTest(){
        PetShopServico petShopServico = PetShopServicoFactory.criarServico("Banho");
        assertEquals("Seu animal foi banhado",petShopServico.executar());
    }

    @Test
    public void cobrarTest(){
        PetShopServico petShopServico = PetShopServicoFactory.criarServico("Banho");
        assertEquals("Este serviço custou 10 reais.",petShopServico.cobrar());
    }
}
