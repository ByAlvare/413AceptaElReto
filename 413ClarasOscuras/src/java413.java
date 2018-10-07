
public class java413 {
	
        static java.util.Scanner entrada;
   
    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 1; i <= numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba()
    {
	int ancho = entrada.nextInt();
	int alto = entrada.nextInt();
	
	int losetasTotales = ancho * alto;
	
	int claras = 0;
	int oscuras = 0;
	
	if( losetasTotales % 2 == 0){
	   claras = losetasTotales /2;
	   oscuras = losetasTotales /2;
	   System.out.println(claras +" "+ oscuras);
	   }
	   else{	    
	    oscuras = losetasTotales /2;
	    claras = losetasTotales - oscuras;
	    System.out.println(claras +" "+ oscuras);
	   }
    }
}
