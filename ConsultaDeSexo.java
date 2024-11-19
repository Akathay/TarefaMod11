import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDeSexo {
    
        public static void main(String[] args) {
            consultaSexo();

        }
    
        public static void consultaSexo() {
            Scanner s = new Scanner(System.in);
            List<String> homem = new ArrayList<String>();
            List<String> mulher = new ArrayList<String>();
            System.out.println("Qual seu nome? ");
            String nome = s.next();
            System.out.println("Qual seu Sexo? [M/F] ");
            String sexo = s.next();
            
            
            if (sexo == "M") {
                homem.add(nome);
                System.out.println("Nome inserido na Lista Masculina");
            } else if (sexo == "F") {
                mulher.add(nome);
                System.out.println("Nome inserido na Lista Feminina");
            } else {
                System.out.println("Erro. Tente novamente, inserindo apenas M ou F");
            }
           
            System.out.println(nome);
            System.out.println(sexo);

            System.out.println("--- Lista Masculina ---");
            System.out.println(homem);
            System.out.println("--- Lista Feminina ---");
            System.out.println(mulher);

  
    }
}
