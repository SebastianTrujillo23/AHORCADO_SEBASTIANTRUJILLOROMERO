import java.util.Scanner;

public class AdivinarPalabra {

    public static void main(String [] args) {

        String [] palabras = {"golondrina", "avetoro", "codorniz", "garcilla", "alcotan", "albubilla", "perdiz", "abejaruco", "vencejo", "gavilan", "papamoscas", "petirrojo", "colirrojo", "pechiazul", "lavandera", "mosquetero", "milano", "aguila", "roquero", "estornino", "treparriscos", "halcon", "buitre", "canastera", "picapinos", "gorrion", "verderon", "verdecillo", "buitron", "bigotudo"};

        int numeroAleatorio = (int) (Math.random() * palabras.length-1);
        String palabraSecreta = palabras[numeroAleatorio];

        char[] palabraCaracteres = palabraSecreta.toCharArray();
        char[] vacio = new char[palabraSecreta.length()];


        int intentos = 0;
        int fallosRestantes = 5;

        boolean palabraAcertada = false;

        int aciertos = 0;

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Esta es la palabra que tienes que adivinar");

        for(int i=0; i<vacio.length; i++) {

                vacio[i] = '_';
                System.out.print(vacio[i]);
            }

        System.out.println("\n\nIntentos: "+intentos+"  Fallos rsetantes: "+fallosRestantes);




        do {
            boolean letraAcertada = false;


            System.out.println("\n\nEscribe una letra");
            char letra = sc.next().charAt(0);
            intentos++;

            for(int i=0; i<palabraCaracteres.length; i++) {

                if(letra == palabraCaracteres[i]){
                    vacio[i] = letra;
                    letraAcertada = true;
                    aciertos++;
                } 
                
            }

            for(int i=0; i<palabraCaracteres.length; i++) {
                System.out.print(vacio[i]);
            }



            if(!letraAcertada) {
                fallosRestantes--;
            }

            if(aciertos == palabraCaracteres.length) {
                palabraAcertada = true;
                System.out.println("\nHas acertado la palabra");
                sc.close();
            }


            System.out.println("\n\nIntentos: "+intentos+"  Fallos rsetantes: "+fallosRestantes);

            if(fallosRestantes== 0){
                System.out.println("Se ha acabado el mumero de intentos.Has perdido el juego");
            }

        } while(fallosRestantes > 0 || palabraAcertada);

        


    }
    
}
