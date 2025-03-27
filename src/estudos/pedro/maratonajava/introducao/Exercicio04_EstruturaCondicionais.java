package estudos.pedro.maratonajava.introducao;

public class Exercicio04_EstruturaCondicionais {
    public static void main(String[] args){
        // Exercicio de Imposto
        double salario = 30000;
        boolean imposto1 = salario >= 0 && salario <= 34712;
        boolean imposto2 = salario >= 34712 && salario <= 68507;
        double taxaPorcentagem;
        double taxaSalario;
        String alert;
        if (imposto1){
            taxaPorcentagem = 9.70;
            taxaSalario = 1 - (taxaPorcentagem / 100);
            salario *= taxaSalario;
             alert = "Sua taxa é de:" + taxaPorcentagem + "% .Seu salario menos a sua taxa é: R$" + salario ;
        }else if (!imposto1 && imposto2){
            taxaPorcentagem = 37.35;
            taxaSalario = 1 - (taxaPorcentagem / 100);
            salario *= taxaSalario;
            alert = "Sua taxa é de:" + taxaPorcentagem + "% .Seu salario menos a sua taxa é: R$" + salario ;
        }else{
            taxaPorcentagem = 49.50;
            taxaSalario = 1 - (taxaPorcentagem / 100);
            salario *= taxaSalario;
            alert = "Sua taxa é de:" + taxaPorcentagem + "% .Seu salario menos a sua taxa é: R$" + salario ;
        }
        System.out.println(alert);
    }
}
