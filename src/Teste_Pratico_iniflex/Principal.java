package Teste_Pratico_iniflex;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        //fiquei com dificuldades em por a  data no formato dd/mm/yyyy
        // e tambem com dificuldades para remover o joao pois no console ele nao esta sumindo porem fiz os codigos. e obrigado pela oportunidade!!

        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000,10,18), BigDecimal.valueOf(2009.44),"Operador"));
        funcionarios.add(new Funcionario("Joao", LocalDate.of(1990,5,12), BigDecimal.valueOf(2284.38),"Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961,5,2), BigDecimal.valueOf(9836.14),"Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988,10,14), BigDecimal.valueOf(19119.88),"Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995,1,5), BigDecimal.valueOf(2234.68),"Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999,11,19), BigDecimal.valueOf(1582.72),"Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993,3,31), BigDecimal.valueOf(4071.84),"Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994,7,8), BigDecimal.valueOf(3017.45),"Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003,5,24), BigDecimal.valueOf(1606.85),"Eletrícista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996,9,2), BigDecimal.valueOf(2799.93),"Gerente"));

        funcionarios.remove(new Funcionario("Joao", null, null, null));

        System.out.println();
        System.out.println("Funcionarios: ");
        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }

        System.out.println();
        for (Funcionario funcionario : funcionarios){
            funcionario.setSalario((funcionario.getSalario().multiply(BigDecimal.valueOf(1.10))));
        }
        System.out.println();

        Map<String, List<Funcionario>> funcionarioFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        System.out.println("Funcionários por Função: ");
        for (Map.Entry<String, List<Funcionario>> entry : funcionarioFuncao.entrySet()){
            System.out.println(entry.getKey() + ":");
            for (Funcionario funcionario : entry.getValue()){
                System.out.println(funcionario);
            }
        }
       
        System.out.println("Funcionários que fazem aniversário em outubro e dezembro");
        for (Funcionario funcionario : funcionarios){
            if(funcionario.getDtNascimento().getMonthValue() == 10 || funcionario.getDtNascimento().getMonthValue() == 12){
                System.out.println(funcionario);
            }

        }
     
        int maiorIdade = funcionarios.stream()
                        .map(funcionario -> funcionario.calcIdade())
                                .max(Integer::compareTo)
                                        .orElseThrow(RuntimeException::new);
        Funcionario funcionarioMaioridade = funcionarios.stream()
                        .filter(funcionario -> funcionario.calcIdade() == maiorIdade)
                                .findFirst()
                                        .orElseThrow(RuntimeException::new);

        System.out.println("Funcionario com maior idade");
        System.out.println("Nome: " +funcionarioMaioridade.getNome());
        System.out.println("Idade: " + funcionarioMaioridade.calcIdade());
   

        System.out.println("Nomes dos funcionarios de A - Z");
        funcionarios.sort(Comparator.comparing(Funcionario::getNome));
        for (Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }
        System.out.println();

        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total de todos os salarios R$:  "+totalSalarios);
        System.out.println();

        funcionarios.stream().forEach(funcionario -> {
            BigDecimal salMinimo = BigDecimal.valueOf(1212.00);
            double qtdSalmin = funcionario.getSalario().divide(salMinimo, 2, RoundingMode.HALF_UP).doubleValue();
            System.out.println("Nomes: "+ funcionario.getNome()+"Quantidade de Salario Minimos: " +qtdSalmin);
        });

        }
    }


