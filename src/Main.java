import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        String texto;
        int contadorLetras=0;



        System.out.println("Ingrese el texto ");
        texto = scanner.nextLine();


        for (int i = 0; i <1; i++) {
            if(esLetra(texto.charAt(i))) {
                contador(texto, contadorLetras);
            }else if(!esLetra(texto.charAt(i)))  {
                System.out.println("Ingrese solo letras");
                break;
            }
        }

    }


    public static void contador (String texto, int contadorLetras) {
        for(int i=0;i<texto.length();i++) {
            if(texto.charAt(i)=='a' || texto.charAt(i)=='A' ) {
                contadorLetras++;
                System.out.println("Suma  = "+ contadorLetras);
            }else if(texto.charAt(i)=='e' || texto.charAt(i)=='E') {
                contadorLetras=contadorLetras-i;
                System.out.println("Resta = "+ contadorLetras);
            }
        }
        System.out.println("Total = "+ contadorLetras);
    }

    static boolean esLetra(char caracter) {
        return (caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z');
    }
}