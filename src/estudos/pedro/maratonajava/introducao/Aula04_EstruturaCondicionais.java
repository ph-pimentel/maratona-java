package estudos.pedro.maratonajava.introducao;

/** Operadores Ternário
 * Tem que estar alocado como valor em algo. Diferente do JavaScript
 *  (condião) ? (true) : false -> If
 *  (condição) ? (true) : (condição) ? (true) : (else) -> If Else
 */

/** Switch
 *  Seria uma forma de realizar um IF ELSE mais organizado e limpo.
 */
public class Aula04_EstruturaCondicionais {
    public static void main(String[] args){
        //IF Else
        double salario = 5000D;
        double jogo = 300D;
        double ps5 = 5000D;
        boolean buyPs5AndJogo = salario >= ps5 + jogo;
        boolean buyPs5 = !buyPs5AndJogo && salario >= ps5;
        String alert = "";

        if (buyPs5AndJogo) {
            alert = "Você pode comprar o Ps5 e um jogo";
        }else if (buyPs5){
            alert = "Você pode comprar o Ps5";
        }else {
            alert = "Você não pode comprar nada";
        }
        // Mesma coisa em operado ternário ->
        //String alertTernario =  buyPs5AndJogo ? "Você pode comprar o Ps5 e um jogo" : buyPs5 ? "Você pode comprar o Ps5" : "Você não pode comprar nada";
        System.out.println(alert);

        //Switch Exercicio Dia Útil e Final de Semana
        byte dias = 5;
        switch (dias){
            case 7:{}
            case 1:{
                System.out.println("Day work");
                break;
            }
            case 2:{}
            case 3:{}
            case 4:{}
            case 5:{}
            case 6:{
                System.out.println("Day off");
                break;
            }

        }

    }
}
