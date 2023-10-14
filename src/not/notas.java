package not;

public class notas {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notFinal(){
        return nota1 + nota2 + nota3;
    }
    public double faltnotas(){
        if (notFinal() < 60.0){
            return 60.0 - notFinal();
        }
        else {
            return 0.0;
        }

    }



}
