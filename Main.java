package entornosUd4;

public class Main {

		public static void main(String[] args) { 

		  
			/**
			 * @author 1DAW
			 * @param d Array con valores
			 * @param e Valor contador de numeros repetidos
			 * @param f Valor auxiliar para ordenar los numeros
			 */
			
		        int[] d = {4, 7, 2, 9, 2, 5}; 

		        int e = 0; 

		        int f = d[0]; 

		  
		        /**
		         * 
		         */
		        
		        for (int i = 1; i < d.length; i++) { 

		            if (d[i] > f) { 

		                f = d[i]; 

		            } 

		        } 

		  

		        for (int i = 0; i < d.length; i++) { 

		            if (d[i] == f) { 

		                e++; 

		            } 

		        } 

		  

		        System.out.println(f + ":" + e); 

		    } 

		} 
