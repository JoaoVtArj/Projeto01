package Conversion;

public class CurrencyConverter {
    public double dollar;
    public double reais;
    public double calc1(){
        return  (dollar * reais);
    }
    public double IOF(){
       double v = (calc1() * 6) / 100;
        return v + calc1();
    }
    public String toString(){
        return "O Valor em Reais é: R$"
                + String.format("%.2f", IOF());
    }

}
