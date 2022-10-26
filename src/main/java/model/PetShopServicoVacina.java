package model;

import interfaces.PetShopServico;

public class PetShopServicoVacina implements PetShopServico {
    @Override
    public String executar() {
        return "Seu animal foi vacinado";
    }

    @Override
    public String cobrar() {
        return "Este serviço custou 200 reais.";
    }
}
