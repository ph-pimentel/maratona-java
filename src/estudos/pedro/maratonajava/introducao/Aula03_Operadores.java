package estudos.pedro.maratonajava.introducao;

/**
 * Operadores Aritiméticos
 * Comuns -> + - / *
 */

/**
 * Operadores Lógicos Pt.1
 *  < Menor;
 *  > Maior;
 *  <=  Menor ou igual;
 *  >=  Maior ou igual;
 *  == Comparação para ver se é igual ;
 *  != Comparação e inverte o resultado do boolean;
 */

/** Operadores Lógicos Pt.2
 *  && (and) Ambos tem que ser true para ser true; se a primeira for false o Java não avalia a segunda, retorna false;
 * || (or) pelo menos um tem que ser true para ser true; se a primeira for false o Java não avalia a segunda,
 * retorna true;
 * ! (not) Inverte o valor da saida;
 */

/** Operadores de Atribuição Pt.1
 * Atention ! = De acordo como você coloca se vai vir antes ou depois, pode influenciar no retorno do Java,
 * ele pode exibir com o valor atual e depois de exibir ele adiciona
 *  += Atrela a variavel a ela mesma, acrescentando o valor em questão;
 *  -= Atrela a variavel a ela mesma, tirando o valor em questão;
 *  *= Atrela a variavel a ela mesma, multiplicando o valor em questão;
 *  /= Atrela a variavel a ela mesma, dividindo o valor em questão;
 *  %= Atrela a variavel a ela mesma, mostando o resto da divisão o valor em questão;
 */

/**Operadores de Atribuição Pt.2
 *  Atention ! = De acordo como você coloca se vai vir antes ou depois, pode influenciar no retorno do Java,
 *  ele pode exibir com o valor atual e depois de exibir ele adiciona.
 *  ++ Adiciona mais um para a variavel em questão;
 *  -- Diminui mais um para a variavel em questão;
 */

public class Aula03_Operadores {
    public static void main (String[] args){
        //Operadores Aritiméticos
        int number1 = 10;
        int number2 = 5;
        int number3 = 20;
        double number4 = 5;
        int result = number1 + number2;
        double resultDecimal = number4 / number3;
        System.out.println(result);
        System.out.println(resultDecimal);

        //Operadores Logicos
        double salario = 2000D;
        double xbox = 1500D;
        double valorParcelado = 500D;
        boolean buyXbox = salario >= xbox && valorParcelado * 3 <= salario;
        boolean opiniaoDaMulher = !buyXbox;
        System.out.println(opiniaoDaMulher);

        //Operadores de Atribuição
        int registrosUsuarios = 200;
        registrosUsuarios += 20; // -= *= /= %=
        ++registrosUsuarios; // --
        System.out.println(registrosUsuarios);

    }
}
