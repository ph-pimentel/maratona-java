package estudos.pedro.maratonajava.introducao;

// While, Do-While, For

public class Aula06_EstrutrasDeRepeticao {
    public static void main (String[] args){
        int age = 5;
        while (age < 18) {
            if (age < 18) {
                System.out.println("Você ainda é de menor " + age);
                ++age;
            }
            if (age == 18) {
                System.out.println ("É de maior agora " + age);
            }
        }
        do {
            System.out.println("Eu executo e depois verifico :()");
            ++age;
        }while (age < 7);

        for (int i = 0;i < 10; i++){
            System.out.println("Seu valor de i:" + i);
        }

        //Utilizando break para sair da repetição
        //Imprimir os primeiros 10 números de 20
        int numberMax = 20;
        for (int i = 0; i < numberMax; i++) {
            if (i > 10){
                break;
            }
            System.out.println("Numbers -> " + i);
        }

        //Utilizando continue para continuar a repetição
        // Imprima os primeiros números de 1 a 10 mas a partir do 5
        for (int i = 1; i <= 10; i++){
            if (i < 5){
                continue; // Só vai executar quando i começar a ser maior de que 5, fazendo assim um continue
            }
            System.out.println("Números:"+ i);
        }
    }
}
