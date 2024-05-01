import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java!");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;
// imprimir todas las variables
        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);


        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;

        System.out.println("Media de la evaluación de " +nombre + ": " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println(nombre + " Es una película reciente");
        }else{
            System.out.println(nombre + " Es una película retro");
            }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluación que le das a " + nombre);
        double notaMatrix = teclado.nextDouble();
        mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media calculada por el usuario para " + nombre + " es " + mediaEvaluacionUsuario / 3);

// end main
        }
// end class
    }
