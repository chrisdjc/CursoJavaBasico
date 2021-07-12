public class Funciones {

    public static void main(String[] args) {
        double y = 3;

        //Área de un círculo PI * r * r
        circleArea(y);

        //Área de una esfera 4*PI*r^2
        sphereArea(y);

        //Volumen de una esfera 4/3 * PI * r^3
        sphereVolume(y);

        System.out.println("PESOS MXN A DOLARES: " + converToDolar(200,"MXN"));
        System.out.println("PESOS COLOMB A DOLARES: " + converToDolar(1000,"COP"));

    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return 4/3 * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función que introduciendo cantidad y moneda, hace la conversión a dólares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda (sólo acepta MXN o COP
     * @return quantity devuelve la equivalencia en dólares de la cantidad que se introdujo
     * */
    public static double converToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }

        return quantity;
    }
}
