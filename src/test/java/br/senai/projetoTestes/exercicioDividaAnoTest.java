package br.senai.projetoTestes;

import org.junit.Assert;
import org.junit.Test;

public class exercicioDividaAnoTest {
    @Test
    public void testarNaoCobrarAgora(){
        String resultadoEsperado = "Não cobrar agora";
        String resultadoReal;

        exercicioDividaAno exercicio = new exercicioDividaAno();
        resultadoReal = exercicio.classificarDivida(2020);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade3(){
        String resultadoEsperado = "Prioridade 3 de cobrança";
        String resultadoReal;

        exercicioDividaAno exercicio = new exercicioDividaAno();
        resultadoReal = exercicio.classificarDivida(2019);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade2(){
        String resultadoEsperado = "Prioridade 2 de cobrança";
        String resultadoReal;

        exercicioDividaAno exercicio = new exercicioDividaAno();
        resultadoReal = exercicio.classificarDivida(2017);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarPrioridade1(){
        String resultadoEsperado = "Prioridade 1 de cobrança";
        String resultadoReal;

        exercicioDividaAno exercicio = new exercicioDividaAno();
        resultadoReal = exercicio.classificarDivida(2015);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarInapta(){
        String resultadoEsperado = "Inaptas";
        String resultadoReal;

        exercicioDividaAno exercicio = new exercicioDividaAno();
        resultadoReal = exercicio.classificarDivida(2014);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testarNaoClassificada(){
        String resultadoEsperado = "Não classificada";
        String resultadoReal;

        exercicioDividaAno exercicio = new exercicioDividaAno();
        resultadoReal = exercicio.classificarDivida(2021);

        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
