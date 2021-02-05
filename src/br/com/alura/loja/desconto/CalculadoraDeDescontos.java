package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

//Chain of Responsibility
public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiraDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return cadeiraDeDesconto.efetuarCalculo(orcamento);
    }
}
