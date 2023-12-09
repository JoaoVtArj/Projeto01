package Teste_Pratico_iniflex;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;


public class Funcionario extends Pessoa{
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dtNascimento, BigDecimal salario, String funcao){
        super(nome, dtNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }


    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+
                ", Data Nascimento: " + getDtNascimento()+
                ", Salario R$: "+salario+
                ", Função : "+funcao ;
    }
}
