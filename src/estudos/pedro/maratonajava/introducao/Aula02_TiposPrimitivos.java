package estudos.pedro.maratonajava.introducao;
/**
 * Tipos Primitivos em Java:
 *  byte, short, int, long, float, double, char, boolean ( execeto boolean não é numerico)
 *  int: Mais recomendado na maioria dos casos
 *  long: Recomendado para registros muitos grandes
 *  double: Valores Decimais
 *  float: Valores Decimais, mas usado para economizar memoria, necessita a adição de F no final
 */
/**
 * Castin
 * 'Converter' o tipo da variavel, ignorando se o tipo vai aguentar ou não o tamanho alocado.
 * Forçando a converção
 */
/**
 * Tipo Referencial em Java
 * String: é um tipo referencial pois é uma classe Java
 */

public class Aula02_TiposPrimitivos {
    public static void main (String[] args){
        int age = 100;
        long ageCasting = age; // Casting Implícito = não gera perdas
        boolean cpf = false;
        double money = 200.00D;
        int moneyCastin = (int) money; // Casting explícito = perdeu decimais
        float temp = 34.5F;
        String name = "Goku";
        System.out.println("Seu nome é: " + name + ". Sua idade é: " + ageCasting + ". Seu CPF é: " + cpf);
        System.out.println("Seu dinheiro: " + moneyCastin + ". Temperatura: " + temp);
    }
}
