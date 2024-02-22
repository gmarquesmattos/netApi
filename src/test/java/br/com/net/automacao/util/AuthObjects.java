package br.com.net.automacao.util;

import br.com.net.automacao.request.AuthDTO;



public class AuthObjects {

    public static AuthDTO buildauth() {
        AuthDTO authDTO = new AuthDTO();
        authDTO.setNome("morpheus");
        authDTO.setJob("leader");
        return authDTO;
    }

}
