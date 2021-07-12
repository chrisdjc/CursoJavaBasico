public class DataTypes {
    public static void main(String[] args) {
        /*
        BYTE        -128            HASTA       127
        SHORT       -32,768         HASTA       32,767
        INT         -2,147,483,648  HASTA       2,147,483,647
         */

        // NÚMEROS ENTEROS
        int n = 38768;
        long nL = 27725581558L;

        // NÚMEROS CON PARTE DECIMAL
        double nD = 23.342243874;
        float nF = 2348.459294F;

        /*
        TYPOS DE DATOS DE TEXTO Y BOOLEANOS

        CHAR        SOLO PUEDE ALMACENAR UN CARACTER Y VA ENCERRADO ENTRE COMILLAS SIMPLES ' '
        BOOLEAN     SOLO PUEDE SER TRUE O FALSE
        STRING      ALAMCENA UNA CADENA DE CARACTERES
         */

        //DECLARACIÓN DE VALORES NUMÉRICOS CON EL NUEVO FORMATO
        var salary = 1000; //int
        var pension = salary*0.03;     //DE PENSIÓN, SE LE RESTA EL 3% DE SU SALARIO Y ES TIPO DOUBLE
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        //  CADENAS DE TEXTO CON EL NUEVO FORMATO
        var employeeName = "JUSTINE BRICEÑO CORTEZ";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: $" + totalSalary);

    }
}
