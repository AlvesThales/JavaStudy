package testeBasico;

public class TesteArray {
	public static void main(String[] args) {
		
		   int[] numeros = {2,4,1,5,7,3,9,6,8};
		   int aux;

	        for (int i = 0; i < numeros.length; i++) {
	            for (int j = i; j < numeros.length; j++) {
	            	if (numeros[j] < numeros[i]) {
	            		aux = numeros[i];
	            		numeros[i] = numeros[j];
	            		numeros[j] = aux;
	            	}
	            }
	        }
	        
	        for (int i = 0; i < numeros.length; i++) {
	           System.out.println(numeros[i]);
	        }
	       
	}

}
