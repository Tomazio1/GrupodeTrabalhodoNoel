
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int N=0;
        do {
            System.out.println("DIgite a quantidade de elfos com o limite de 1000");
            System.out.print("Quantidade de elfos: ");
            N = read.nextInt();
            if(N<=0 || N> 1000){System.out.println("Digite novamente, valor inválido.");}
        }while(N<=0 || N> 1000);
        int h=0,p=0;
        String e,g;
        for(int i=0;i<N;i++) {

            System.out.println("Digite o nome do elfo: ");
            e = read.nextLine().toLowerCase();

            System.out.println("Digite o grupo do elfo: ");
            g = read.nextLine().toLowerCase();

            do {
                System.out.println("Horas trabalhadas por dia: ");
                h = read.nextInt();
                if(h<1 || h>24){System.out.println("valor inválido, tente novamente");}
            }while(h<1 || h>24);

            if (g=="bonecos") {
                p += h/8;
            } else if (g=="arquitetos") {
                p += h/4;
            } else if (g=="musicos") {
                p +=h/6;
            } else if (g=="desenhistas"){
                p+=h/12;
            }

        }
        System.out.println("brinquedos: "+p);
    }
}
