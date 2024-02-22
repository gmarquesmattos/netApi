package br.com.net.automacao.request;

import java.math.BigDecimal;

public class AuthDTO {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String job;

    public AuthDTO() {
    }



}
