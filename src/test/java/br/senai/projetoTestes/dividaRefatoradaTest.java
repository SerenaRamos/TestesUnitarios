package br.senai.projetoTestes;

import org.junit.Assert;
import org.junit.Test;

public class dividaRefatoradaTest {
    @Test
        public void testarNaoCobrarAgoraAno(){
            String resultadoEsperado = "Não cobrar agora";
            String resultadoReal;

            dividaRefatorada exemplo2 = new dividaRefatorada();
            resultadoReal = exemplo2.classificarDivida2(2020, "Inscrita", 1500);

            Assert.assertEquals(resultadoEsperado,resultadoReal);
        }

        @Test
        public void testarInaptasAno(){
            String resultadoEsperado = "Inapta";
            String resultadoReal;

            dividaRefatorada exemplo2 = new dividaRefatorada();
            resultadoReal = exemplo2.classificarDivida2(2014, "Inscrita", 1001);

            Assert.assertEquals(resultadoEsperado,resultadoReal);
        }

        @Test
        public void testarInaptasValor(){
            String resultadoEsperado = "Inapta";
            String resultadoReal;

            dividaRefatorada exemplo2 = new dividaRefatorada();
            resultadoReal = exemplo2.classificarDivida2(2016, "Inscrita", 800);

            Assert.assertEquals(resultadoEsperado,resultadoReal);
        }

        @Test
        public void testarInaptasSituacao(){
            String resultadoEsperado = "Inapta";
            String resultadoReal;

            dividaRefatorada exemplo2 = new dividaRefatorada();
            resultadoReal = exemplo2.classificarDivida2(2016, "Não inscrita", 1800);

            Assert.assertEquals(resultadoEsperado,resultadoReal);
        }

        @Test
        public void testarPrioridade1(){
            String resultadoEsperado = "Prioridade 1";
            String resultadoReal;

            dividaRefatorada exemplo2 = new dividaRefatorada();
            resultadoReal = exemplo2.classificarDivida2(2015, "Inscrita", 1001);

            Assert.assertEquals(resultadoEsperado,resultadoReal);
        }

        @Test
        public void testarPrioridade2(){
            String resultadoEsperado = "Prioridade 2";
            String resultadoReal;

            dividaRefatorada exemplo2 = new dividaRefatorada();
            resultadoReal = exemplo2.classificarDivida2(2016, "Inscrita", 1500);

            Assert.assertEquals(resultadoEsperado,resultadoReal);
        }

        @Test
        public void testarPrioridade3(){
            String resultadoEsperado = "Prioridade 3";
            String resultadoReal;

            dividaRefatorada exemplo2 = new dividaRefatorada();
            resultadoReal = exemplo2.classificarDivida2(2019, "Inscrita", 1500);

            Assert.assertEquals(resultadoEsperado,resultadoReal);
        }

    }


