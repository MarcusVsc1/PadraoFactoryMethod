package factory;

import interfaces.PetShopServico;

import java.lang.reflect.InvocationTargetException;

public class PetShopServicoFactory {

    public static PetShopServico criarServico(String servico){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("model.PetShopServico".concat(servico));
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Serviço não existe!");
        }
        if (!(objeto instanceof PetShopServico)){
            throw new IllegalArgumentException("Serviço inválido!");
        }
        return (PetShopServico) objeto;
    }
}
