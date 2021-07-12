public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Redondeo hacia el entero siguiente
        System.out.println(Math.ceil(x));

        //Redondeo hacia el entero anterior
        System.out.println(Math.floor(x));

        //Devuelve un número elevado al otro
        System.out.println(Math.pow(x,y));

        //Devuelve el número mayor haciendo una comparación entre dos valores dados
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Área de un círculo PI * r * r
        System.out.println(Math.PI * Math.pow(y,2));

        //Área de una esfera 4*PI*r^2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de una esfera 4/3 * PI * r^3
        System.out.println(4/3 * Math.PI * Math.pow(y,3));


        //Ejemplos de constantes de la clase Math
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
