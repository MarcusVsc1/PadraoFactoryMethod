package model;

import interfaces.PetShopServico;

public class PetShopServicoBanho implements PetShopServico {

    @Override
    public String executar() {
        return "Seu animal foi banhado";
    }

    @Override
    public String cobrar() {
        return "Este serviço custou 10 reais.";
    }
}
