import java.util.*;

public class PrimeiraClasse {
    public static void main(String args[]){
        exec1();
        exec2();
    }
    private static void exec1() {
//        List<String> listaNomes = new ArrayList<String>();
        Scanner nomes = new Scanner(System.in);
        System.out.println("Insira nomes separados por vírgula");
        String resposta = nomes.next();
        String[] listaNomes = resposta.split(",");

        for(int i = 0; i<listaNomes.length; i++){
            System.out.println(" "+listaNomes[i]);
        }
        Arrays.sort(listaNomes);
        for(String nome : listaNomes)
            System.out.println(nome);
        System.out.println();
    }
    private static void exec2() {
        ArrayList<String> sexoMasculino = new ArrayList<>();
        ArrayList<String> sexoFeminino = new ArrayList<>();
        System.out.println("Insira nomes separados por vírgula, com um - para o sexo");

        Scanner nomes = new Scanner(System.in);
        String resposta = nomes.next();
        String[] listaNomes = resposta.split(",");


        for(String nome : listaNomes){
            if(nome.split("-")[1].equals("m"))
                sexoMasculino.add(nome.split("-")[0]);
            if(nome.split("-")[1].equals("f")){
                sexoFeminino.add(nome.split("-")[0]);
            }
        }
        Collections.sort(sexoMasculino);
        Collections.sort(sexoFeminino);
        System.out.println("Sexo Masculino");
        System.out.println(sexoMasculino);
        System.out.println("Sexo Feminino");
        System.out.println(sexoFeminino);
    }

}
