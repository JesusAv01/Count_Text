import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        String texto;
        int contadorA=0;


        System.out.println("Ingrese el texto ");
        texto = scanner.nextLine();
        contador(texto, contadorA);

    }


    public static void contador (String texto, int contadorA) {

        for(int i=0;i<texto.length();i++) {
            if(texto.charAt(i)=='a' || texto.charAt(i)=='A' ) {
                contadorA++;
                System.out.println(contadorA);
            }
        }

    }
}