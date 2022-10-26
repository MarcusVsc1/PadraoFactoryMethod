import factory.PetShopServicoFactory;
import interfaces.PetShopServico;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PetShopServicoVacinaTest {

    @Test
    public void executarTest(){
        PetShopServico petShopServico = PetShopServicoFactory.criarServico("Vacina");
        assertEquals("Seu animal foi vacinado",petShopServico.executar());
    }

    @Test
    public void cobrarTest(){
        PetShopServico petShopServico = PetShopServicoFactory.criarServico("Vacina");
        assertEquals("Este serviço custou 200 reais.",petShopServico.cobrar());
    }
}
