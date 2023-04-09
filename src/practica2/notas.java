package practica2;
import java.util.Scanner;

/**
 * Clase en la que se declaran las notas
 * @author Isabel
 */
public class notas {
	//declaramos la variables que nos hacen falta
        /**
         * Nota de la uf correspondiente
         */
	double uf1, uf2, uf3;
        /**
         * Nota preponderada de la uf correspondiente
         */
	double acu1, acu2, acu3, def;
	//utilizames ecaner para poder introducir datos
	Scanner entrada_datos = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
        
    /**
     * Método para introducir las notas obtenidas
     */
	
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");

		uf1= entrada_datos.nextDouble();
                

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada_datos.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada_datos.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas

    /**
     * Método que comprueba la introducción correcta de las notas, no debe ser mayor de 10
     */
	
	public void comprobacion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	// metodo para calcular nota
	
    /**
     * Método que calcula la nota preponderada de cada uf y la nota definitiva
     */
    public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}

    /**
     * Método que muestra las notas obtenidas
     */
    public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

    /**
     * Método que dice si el alumno ha aprobado o suspendido
     */
    public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
    /**
     * Método principal en el que se llama a los métodos para ingresar notas, comprobarlas, calcularlas y mostrarlas
     * @param args Este parámetro es un arreglo de cadenas de caracteres que se puede pasar al método main
     */
    public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobacion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}