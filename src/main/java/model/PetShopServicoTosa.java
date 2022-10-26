package model;

import interfaces.PetShopServico;

public class PetShopServicoTosa implements PetShopServico {
    @Override
    public String executar() {
        return "Seu animal foi tosado";
    }

    @Override
    public String cobrar() {
        return "Este serviço custou 30 reais.";
    }
}
