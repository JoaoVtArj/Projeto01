package Teste_Pratico_iniflex;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;


public class Pessoa {
    private String nome;
    private LocalDate dtNascimento;



    public Pessoa(String nome, LocalDate dtNascimento){
        this.nome = nome;
        this.dtNascimento = dtNascimento;
    }
    public int calcIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(dtNascimento, dataAtual).getYears();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Nome : "+nome+
                ", Data Nascimento: " +dtNascimento+ ", ";
    }
}
