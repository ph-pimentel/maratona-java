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
    }
}
