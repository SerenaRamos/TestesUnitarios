package br.senai.projetoTestes;

import java.util.Calendar;

public class exercicioDividaAno {
    public String classificarDivida(int anoDivida){
        String prioridade;
        int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);

        if(anoDivida == anoCorrente){
            prioridade = "Não cobrar agora";
        } else if (anoDivida >= 2018 && anoDivida <= 2019){
            prioridade = "Prioridade 3 de cobrança";
        } else if (anoDivida>=2016 && anoDivida <= 2017){
            prioridade = "Prioridade 2 de cobrança";
        } else if (anoDivida == 2015){
            prioridade = "Prioridade 1 de cobrança";
        } else if (anoDivida <2015){
            prioridade = "Inaptas";
        } else {
            prioridade = "Não classificada";
        }
        return prioridade;
    }
}
