import java.util.Scanner;

public class Gato {
    //atributos
    String nombre;
    static boolean seDejaAgarrar;
    int patas = 4;
    boolean cola = true;
    int orejas = 2;
    int ojos = 2;
    String colorPelo;

    //Método constructor
    Gato(String nombre, boolean seDejaAgarrar){
        this.nombre = nombre;
        this.seDejaAgarrar = seDejaAgarrar;
        System.out.println("¡Mira, un gato!");
        this.hacerMiau();
    }

    //comportamientos (métodos)
    public void hacerMiau(){
        System.out.println(this.nombre + ": Miau");
        System.out.println("Creo que intenta manipularte con sus maullidos.\n");
    }

    public void dejarseAgarrar(){
        System.out.println("A ver... intenta agarrar a "+this.nombre+"\n");
        if (seDejaAgarrar){
            System.out.println(this.nombre + " se deja agarrar.\n");
        }else{
            System.out.println(this.nombre + " sale corriendo.\n");
        }
    }

    public void cazarCuca(){
        double cucaracha = Math.random();
        System.out.println("Cazando una cucaracha");
        Scanner continuar = new Scanner(System.in);
        if (cucaracha <0.3){
            System.out.println(this.nombre+" atrapó una cucaracha.\n");
        }else if(cucaracha >= 0.33 && cucaracha < 0.66){
            System.out.println(this.nombre+ " subió una cucaracha a la cama. \nMamá y papá están gritando\n");
        }else{
            System.out.println("La cucaracha escapó.\n");
        }
    }
}
