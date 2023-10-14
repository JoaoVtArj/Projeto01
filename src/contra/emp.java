package contra;

public class emp {
    public String nome;
    public double salarioBruto;
    public double taxa;
    public double salarioLiq(){
        return salarioBruto - taxa;
    }
    public void acresSal(double porcent){
        salarioBruto += salarioBruto * porcent / 100.0;
    }
    public String toString(){
        return "Funcionario: "
                + nome
                +", "
                + "Salario: R$ "
                + String.format("%.2f", salarioLiq());
    }
}
