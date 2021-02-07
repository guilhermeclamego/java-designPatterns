package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Guilherme Cesar Lamego";
        BigDecimal valorOrcamento = new BigDecimal("500");
        int quantidadeItens = 4;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                //Lista das ações que irão executar (Padrão observer)
                Arrays.asList(
                        new SalvarPedidoNoBanco(),
                        new EnviarEmailPedido())
        );
        handler.execute(gerador);
    }
}
