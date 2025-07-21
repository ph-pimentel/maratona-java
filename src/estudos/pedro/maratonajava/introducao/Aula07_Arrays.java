package estudos.pedro.maratonajava.introducao;

public class Aula07_Arrays {
    public static void main (String[] args){
        //Arrays são variáveis do tipo referencial, não alocando diretamenta na memória, criando uma referência
        int [] idade = new int[2];
        idade[0] = 20;
        idade[1] = 23;
        System.out.println("Dentro do nosso array:" + idade[0]);
        System.out.println("Dentro do nosso array:" + idade[1]);

        String [] fightersZ = new String[3];
        fightersZ[0] = "Goku";
        fightersZ[1] = "Vegeta";
        fightersZ[2] = "Kuririn";
        //Uso do for para exibir o array, junto com length tamanho do objeto = array
        for (int i = 0;i < fightersZ.length;i++){
            System.out.println("Nomes: " + fightersZ[i]);
        }

        // Forma de alocar diretamente na declaração
        String [] nomes = {"Goku", "Gohan"};
        int [] number = {1, 2, 3, 4}; // Já define o tamanho do objeto e os dados
        for (int num : number){ // Forearch = ao invés de usar 'i' trabalha com o tamanho do array
            System.out.println(num);
        }

    }
}
