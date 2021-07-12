public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono de $200
        salary += 200;
        System.out.println("Salario base: $" + salary);

        //pensión de $50 que se descuenta
        salary -=50;
        System.out.println("Salario con deducciones: $" + salary);

        //horas extra en $30 c/u
        //gasto de alimentos $45
        int precioHoraExtra = 30;
        int precioCuponAlimentos = 45;
        int horasExtraTrabajadas = 2;
        int cuponesDeAlimentos = 1;
        salary = (salary + (precioHoraExtra * horasExtraTrabajadas)) - (precioCuponAlimentos * cuponesDeAlimentos);
        System.out.println("Salario neto: $" + salary);

        //actualizando cadenas de texto
        String employeeName = "Christopher Can";
        employeeName += " Castillo";
        System.out.println("Nombre: " + employeeName);
    }
}
