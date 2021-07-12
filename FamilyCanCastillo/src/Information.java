public class Information {
    public static void main(String[] args) {
        //Información acerca de mi familia
        String firstApellido = "CAN";
        String secondApellido = "CASTILLO";
        String familyName = firstApellido + " " + secondApellido;

        int numberOfMembers = 8;
        String parent1Apellidos = "CAN POLANCO";
        String parent1Names ="EMIR ENRIQUE";

        String parent2Apellidos = "CASTILLO SUASTE";
        String parent2Names ="YRMA YOLANDA";

        int numberOfSons = 3;
        int numberOfPets = 3;

        String name1 = "CHRISTOPHER DE JESUS";
        int age1 = 24;
        String gender1 = "MALE";

        String name2 = "JESSICA LUCERO";
        int age2 = 23;
        String gender2 = "FEMALE";

        String name3 = "SOLANGE AIRAM";
        int age3 = 14;
        String gender3 = "FEMALE";

        String pet1 = "LOKI";
        String pet2 = "NYSSA";
        String pet3 = "BENYI";

        System.out.println("FAMILY: " + familyName);

        System.out.println("NUMBER OF MEMBERS: " + numberOfMembers);
        System.out.println("\nPARENTS NAMES: \n" + parent1Apellidos + " " + parent1Names + " AND " + parent2Apellidos + " " + parent2Names);

        System.out.println("\nSONS: ");
        System.out.println(gender1 + " " + name1 + " " + age1 + " YEARS OLD");
        System.out.println(gender2 + " " + name2 + " " + age2 + " YEARS OLD");
        System.out.println(gender3 + " " + name3 + " " + age3 + " YEARS OLD");

        System.out.println("\nPETS: " + pet1 + ", " + pet2 + ", " + pet3);
    }
}
