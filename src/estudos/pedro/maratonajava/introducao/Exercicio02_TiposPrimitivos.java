package estudos.pedro.maratonajava.introducao;

public class Exercicio02_TiposPrimitivos {
    public static void main(String[] args){
        String name = "Goku";
        String endereco = "Rua Mestre Kami, 7000";
        double salario = 2000.00D;
        String date = "20/03/2004";
        String mensage1 = "Eu " + name + ", morando no endereco: " + endereco + ",";
        String mensage2 = "confirmo que recebi o salario de:" + salario + " na data de: " + date;
        String relatorio = mensage1 + mensage2;
        System.out.println(relatorio);
    }
}
