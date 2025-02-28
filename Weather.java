import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:
            Scanner input = new Scanner(System.in);

        //Si es bajo 0: Te estás congelando
        System.out.print("Ingrese tutemperatura en Celsius: ");
        

        int temperatura = input.nextInt();
        if (temperatura < 0) {
            System.out.print("" + temperatura + " Te estás congelando");
        } else if ((temperatura >= 0) && (temperatura <= 10)) {
            System.out.print("" +temperatura + " Hace mucho frío");
        } else if ((temperatura >= 11) && (temperatura <= 17)){
            System.out.print("" +temperatura + " Con un abrigo estás bien");
        }  else if ((temperatura >= 18) && (temperatura <= 25)){
            System.out.print("" +temperatura + " Parece que ha llegado el verano");
        } else if ((temperatura >= 26) && (temperatura <= 35)){
            System.out.print("" +temperatura + " Que calooorrrrr");
        } else if (temperatura < 36){
            System.out.print("" +temperatura + " Ahí no hay quien viva");
        };

        //Si es entre 0 y 10: Hace mucho frío 
        //Si es entre 11 y 17: Con un abrigo estás bien
        //Si es entre 18 y 25: Parece que ha llegado el verano
        //Si es entre 26 y 35: Que calooorrrrr
        //Si es mayor a 36: Ahí no hay quien viva

        //Imprime el resultado

        input.close();
    };
}   