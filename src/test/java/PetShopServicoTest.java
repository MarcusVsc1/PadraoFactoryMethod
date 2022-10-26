import factory.PetShopServicoFactory;
import interfaces.PetShopServico;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class PetShopServicoTest {


    @Test
    public void servicoInexistenteTest(){
        try {
            PetShopServico petShopServico = PetShopServicoFactory.criarServico("Corrida");
            fail();
        } catch (Exception e){
            assertEquals("Serviço não existe!", e.getMessage());
        }
    }

    @Test
    public void servicoErroTest(){
        try {
            PetShopServico petShopServico = PetShopServicoFactory.criarServico("ConcursoDeBeleza");
            fail();
        } catch (Exception e){
            assertEquals("Serviço inválido!", e.getMessage());
        }
    }

}
