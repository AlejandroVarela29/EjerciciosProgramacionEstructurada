public class App5 {
    public static void main(String[] args) {

        System.out.print("En este programa se medira el tiempo la rapidz real con la que opera la computadora");
        
        long tiempoInicial = System.currentTimeMillis();
        
        int cuenta = 1;
        while (cuenta <= 300000000) {
            // Una vez que la cuenta alcance un múltiplo de 1,000,000 despliegue dicho número en la pantalla
            if (cuenta % 1000000 == 0) {
                System.out.println(cuenta);
            }
            cuenta++;
        }

        long tiempoFinal = System.currentTimeMillis();
        
        long tiempoTotal = tiempoFinal - tiempoInicial;
        
        System.out.println("Tiempo total: " + tiempoTotal + " milisegundos");
    }
}