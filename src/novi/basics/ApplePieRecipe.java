package novi.basics;

import java.util.Arrays;

public class ApplePieRecipe {

    Ingredient roomboter = new Ingredient(200,"gram","Ongzouten roomboter");
    Ingredient bastardsuiker = new Ingredient(200,"gram","witte bastaard suiker");
    Ingredient bakmeel = new Ingredient(400,"gram","zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(12,"stuk","ei");
    Ingredient vannilesuiker = new Ingredient(8,"gram","vannilesuiker");
    Ingredient zout = new Ingredient(1,"snuf","zout");
    Ingredient appels = new Ingredient(1.5,"kilo","zoetzure apples");
    Ingredient kristalsuiker = new Ingredient(75,"gram","kristal suiker");
    Ingredient kaneel = new Ingredient(3,"theelepels","kaneel");
    Ingredient paneermeel = new Ingredient(15,"gram","paneermeel");

    public Ingredient[] ingredients = {roomboter, bastardsuiker, bakmeel, ei, vannilesuiker, zout, appels, kristalsuiker, kaneel, paneermeel};

    public void printIngredients() {

        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }
    }

    @Override
    public String toString() {
        return "ApplePieRecipe{" +
                "roomboter=" + roomboter +
                ", bastardsuiker=" + bastardsuiker +
                ", bakmeel=" + bakmeel +
                ", ei=" + ei +
                ", vannilesuiker=" + vannilesuiker +
                ", zout=" + zout +
                ", appels=" + appels +
                ", kristalsuiker=" + kristalsuiker +
                ", kaneel=" + kaneel +
                ", paneermeel=" + paneermeel +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }

    public static void steps(){
        ovenverwarmen();
        klopEi();
        mengBoter();
        schilAppels();
        springvorm();
        deegbodem();
        vullen();
        deegSnijden();
        taartTop();
        Oven();

    }

    public static void ovenverwarmen (){
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)\n");

    }
    public static void klopEi (){
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.\n");
    }
    public static void mengBoter (){
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.\n");
    }
    public static void schilAppels (){
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n");
    }
    public static void springvorm (){
        System.out.println("Vet de springvorm in en bestrooi deze met bloem\n");
    }
    public static void deegbodem (){
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.\n");
    }
    public static void vullen (){
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.\n");
    }
    public static void deegSnijden (){
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.\n");
    }
    public static void taartTop (){
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken\n");
    }
    public static void Oven (){
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.\n");
    }





   /* public static void printIngredients(){

        System.out.println(roomboter.getAmount() + " " + roomboter.getUnit() + " " + roomboter.getName());
        System.out.println(bastardsuiker.getAmount() + " " + bastardsuiker.getUnit() + " " + bastardsuiker.getName());
        System.out.println(bakmeel.getAmount() + " " + bakmeel.getUnit() + " " + bakmeel.getName());
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName());
        System.out.println(vannilesuiker.getAmount() + " " + vannilesuiker.getUnit() + " " + vannilesuiker.getName());
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName());
        System.out.println(appels.getAmount() + " " + appels.getUnit() + " " + appels.getName());
        System.out.println(kristalsuiker.getAmount() + " " + kristalsuiker.getUnit() + " " + kristalsuiker.getName());
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName());
        System.out.println(paneermeel.getAmount() + " " + paneermeel.getUnit() + " " + paneermeel.getName());
        System.out.println("");
    }*/

}
