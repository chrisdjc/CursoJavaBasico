public class Casting {
    public static void main(String[] args) {
        //En un año se ubicó a 30 perritos
        //Cuántos ubiqué al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs); //Se puede pasar a otra variable
        System.out.println((int) monthlyDogs);    //Se puede agregar la palabra reservada justo antes de imprimir

        //EXACTITUD
        int a = 30;
        int b = 9;
        System.out.println("cast a/b: " + (double) a/b);

        double h = a/b;
        System.out.println(h);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

        //EJERCICIO DE CASTING
        //-----------------------    #1    --------------------------
        char c = 'z'; //CONVERTIR A INT     R= CONVERSIÓN AUTOMÁTICA
        int cI = c;
        System.out.println("char c = 'z' convertida a int: " + cI);

        //-----------------------    #2    --------------------------
        int i = 250; //CONVERTIR A LONG     R= CONVERSIÓN AUTOMÁTICA Y EXACTA
        long iL = i;//CONVERTIR A SHORT     R= ¡¡REQUIERE CAST!!
        System.out.println("int i = 250 convertida a long: " + iL); //IMPRESIÓN EXACTA

        short iS = (short) iL;
        System.out.println("long i convertida ahora a short: " + iS); //IMPRESIÓN ESTIMADA

        //-----------------------    #3    --------------------------
        double d = 301.067; //CONVERTIR A LONG  R= ¡¡REQUIERE CAST!!
        long dL = (long) d;
        System.out.println("double d = 301.067 convertida a long: " + dL); //impresión estimada

        //-----------------------    #4    --------------------------
        int j = 100; //súmale 5000.66 y conviertelo a float
        j += 5000.66; //CONVERSIÓN AUTOMÁTICA
        float jF = j;
        System.out.println("int j = 100 más 5000.66 y luego convertida a float: " + jF); //impresión estimada

        //-----------------------    #5    --------------------------
        int k = 737; //multiplícalo por 100 y conviertelo a byte
        k = k * 100;
        byte kB = (byte) k; //¡¡REQUIERE CAST!!
        System.out.println("int k = 737 multiplicado por 100 y convertido a byte: " + kB);

        //-----------------------    #6    --------------------------
        double m = 298.638; //divídelo entre 25 y conviertelo a long
        m = m/25;
        long mL = (long) m; //¡¡REQUIERE CAST!!
        System.out.println("double m = 298.638 divídido entre 25 y convertido a long: " + mL); //IMPRESIÓN ESTIMADA
        byte x = 1; byte y = 1; byte z = x+y;
    }
}

/*
EJERCICIO #3
1. Asegurarme que tengo la maquina virtual JRT version 9 o mayor para compilar
2. Generar los paquetes (*.JAR) ejecutables de cada una de las clases
3. En el caso de WINDOWS asegurarme que la maquina virtual que se tenga en el OS sea igual o mayor a la
    version en la cual fue compilado, de similar forma en el caso de utilizar UBUNTU, caso contrario instalar
    la version 9 de java o mayor. Para averiguar la version de la maquina virtual seleccionada, se utiliza el
    comando: “java -version” dirigirse al directorio [WINDOWS(usando por consola comando CD) UBUNTU
    (usando comando también CD)] donde se encuentran los archivos JAR respectivos, y ejecutar el comando:
    “java -jar Ejercicio1.jar” o “java -jar Ejercicio2.jar”
 */