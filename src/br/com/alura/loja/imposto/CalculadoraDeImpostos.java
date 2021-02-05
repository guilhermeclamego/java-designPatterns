package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calular(Orcamento orcamento, TipoImposto tipoImposto){
        switch (tipoImposto){
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.06"));
            case ICMS:
                return orcamento.getValor().multiply(new BigDecimal("0.1"));
            default:
                return BigDecimal.ZERO;
        }

    }
}
