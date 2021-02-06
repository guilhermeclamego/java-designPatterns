package br.com.alura.loja.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento{

    public void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
