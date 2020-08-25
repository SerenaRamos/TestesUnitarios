package br.senai.projetoTestes;

import java.util.Calendar;

public class dividaRefatorada {
    public String classificarDivida2(int anoDivida, String situacao, float valor){
        String prioridade;

        int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);
        int diferencaAnos = anoCorrente - anoDivida;

        if(diferencaAnos !=0){
            if (situacao.equals("Inscrita") && valor >= 1000){
                if (diferencaAnos == 1 || diferencaAnos ==2){
                    prioridade = "Prioridade 3";
                }else if (diferencaAnos == 3 ||diferencaAnos == 4){
                    prioridade ="Prioridade 2";
                } else if (diferencaAnos == 5){
                    prioridade = "Prioridade 1";
                } else {
                    prioridade = "Inapta";
                }
            } else{
                prioridade = "Inapta";
            }
        }else {
            prioridade = "Não cobrar agora";
        }
        return prioridade;
    }
}
