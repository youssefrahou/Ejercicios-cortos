public class NumeroPrimo10001 {
    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    What is the 10 001st prime number?
     */

    public static void calculoPrimos(){
        int numeroMaximo = 5678900;
        boolean[] tabla = new boolean[1999999];
        int posicion = 0;

        for (int i = 0; i < tabla.length; i++){
            tabla[i]=true;
        }


        for (int i = 2; i < tabla.length-2; i++){
            for (int  k = 2; k < tabla.length-2; k++){

                if ( (i*k) < tabla.length){
                    tabla[(i*k)]=false;
                }else{
                    break;
                }

            }
        }
        tabla[0]=false;
        tabla[1]=false;

        for (int i = 1; i < tabla.length; i++){

            if(tabla[i]){
                posicion++;
            }
            if (posicion==10001){
                System.out.println(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        calculoPrimos();
    }


}
