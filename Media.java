import java.util.Scanner;

public class Media {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int media = 0;
        System.out.println("Insira uma nota");
        int nota = s.nextInt();
        System.out.println("Insira uma nota");
        int nota1 = s.nextInt();
        System.out.println("Insira uma nota");
        int nota2 = s.nextInt();
        System.out.println("Insira uma nota");
        int nota3 = s.nextInt();
        soma += nota1 + nota + nota3 + nota2;
        media = soma / 4;
        for (cont = 1; cont <= 4; cont++) {
            if (cont == 4) {
                if (media >= 7 && media <= 10) {
                    System.out.println("Aprovado, media " + media);
                } else if (media >= 5 && media <= 6) {
                    System.out.println("Recuperação,media :" + media);
                } else {
                    System.out.println("Reprovado, media :" + media);
                }

            }
            
        }
    }
}

