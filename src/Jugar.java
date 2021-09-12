import java.util.Scanner;


public class Jugar {
    static boolean agarrarBoolean;
    static Scanner continuar = new Scanner(System.in);
    static Gato gatoCreado;

    public static void main(String[] args) {

        //Gato spock2 = new Gato("Spock II", true);
        //Gato gatosfera = new Gato("La Gatósfera", true);
        //Gato sarita = new Gato("Sarita", false);
        //Gato cecilio = new Gato("Cecilio", true);

        crearGato();
        menu();

    }

    public static void crearGato (){
        // preguntar nombre
        System.out.println("Vamos a crear un gato");
        Scanner padmeInput = new Scanner(System.in);
        System.out.println("¿Cómo se llama el gato?");
        String padmeInputString = padmeInput.nextLine();

        // preguntar si se deja agarrar
        Scanner padmeInput2 = new Scanner(System.in);
        System.out.println("¿Se deja agarrar? S/N");
        char seDejaInput = padmeInput2.next().charAt(0);

        if (seDejaInput == 's' || seDejaInput == 'S') {
            agarrarBoolean = true;
        } else {
            agarrarBoolean = false;
        }

        //Gato cecilio = new Gato("Cecilio", true);
        gatoCreado = new Gato(padmeInputString, agarrarBoolean);


    }

    public static void menu (){
        int menu =0;
        do {
            Scanner entrada  = new Scanner(System.in);
            System.out.println(
                    "¿Qué quieres que haga el gato?\n" +
                            "1. Maullar\n"+
                            "2. Cazar cucaracha\n"+
                            "3. Agarrar al gato\n\n"+
                            "0. Salir"
            );
            menu = entrada.nextInt();
            switch (menu){
                case 1:
                    gatoCreado.hacerMiau();
                    break;
                case 2:
                    gatoCreado.cazarCuca();
                    break;
                case 3:
                    gatoCreado.dejarseAgarrar();
                    break;
                default:
                    System.exit(0);
            }

        }while(menu !=0);
    }
}
