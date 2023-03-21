package AtividadeRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        //1. ler o nº
        System.out.println("Digite um nº:");
        double nDigitado = sc.nextDouble();
        //2. se nº>10
        if(nDigitado>10){
            System.out.println("É maior que 10!");
        } else { //3. senão 
            System.out.println("Não é Maior que 10!");
        }
        
    }
    public void exemplo2() {
        //1. ler a quantidade htrabalhas
        System.out.println("Informe a Quantidade horas Trabalhas no Mês");
        int hTrabalhas = sc.nextInt();
        //2. ler o valor da horas
        System.out.println("Informe a valor da Hora");
        double valorHora = sc.nextDouble();
        //3. calcular a quantidade de horas Extras
        int horasExtras = hTrabalhas-200;
        //4. Calcular o Salário
        double salarioTotal = hTrabalhas*valorHora + horasExtras*valorHora*50/100;
        //5. Mostrar o salario Total
        System.out.println("O Salario Total é R$ "+salarioTotal);
    }
}
