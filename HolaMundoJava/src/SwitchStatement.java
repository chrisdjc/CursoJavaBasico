public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "1";

        switch(colorModeSelected){
            case "Light":
                System.out.println("SELECCIONASTE LIGHT MODE");
                break;
            case "Night":
                System.out.println("SELECCIONASTE NIGHT MODE");
                break;
            case "Blue Dark":
                System.out.println("SELECCIONASTE BLUE DARK MODE");
                break;
            case "Dark":
                System.out.println("SELECCIONASTE DARK MODE");
                break;
            default:
                System.out.println("SELECCIONA UNA OPCIÓN");
        }
    }
}
