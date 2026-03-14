class BlanketExecutor {
	
    public static void main(String[] args) {


        Blanket b1 = new Blanket();
        b1.brand = "AmazonBasics";
        b1.material = "Fleece";
        b1.color = "Red";
        b1.size = "Queen";
        b1.weight = 1.5;
        b1.price = 1200;

        System.out.println(b1.brand);
        System.out.println(b1.material);
        System.out.println(b1.color);
        System.out.println(b1.size);
        System.out.println(b1.weight);
        System.out.println(b1.price);
        System.out.println("---------------------------");

        Blanket b2 = new Blanket();
        b2.brand = "Sleepwell";
        b2.material = "Cotton";
        b2.color = "Blue";
        b2.size = "King";
        b2.weight = 1.8;
        b2.price = 1500;

        System.out.println(b2.brand);
        System.out.println(b2.material);
        System.out.println(b2.color);
        System.out.println(b2.size);
        System.out.println(b2.weight);
        System.out.println(b2.price);
        System.out.println("---------------------------");

        Blanket b3 = new Blanket();
        b3.brand = "D’Decor";
        b3.material = "Wool";
        b3.color = "Green";
        b3.size = "Double";
        b3.weight = 2.0;
        b3.price = 1800;

        System.out.println(b3.brand);
        System.out.println(b3.material);
        System.out.println(b3.color);
        System.out.println(b3.size);
        System.out.println(b3.weight);
        System.out.println(b3.price);
        System.out.println("---------------------------");

        Blanket b4 = new Blanket();
        b4.brand = "HomeCentre";
        b4.material = "Microfiber";
        b4.color = "Grey";
        b4.size = "Single";
        b4.weight = 1.2;
        b4.price = 1000;

        System.out.println(b4.brand);
        System.out.println(b4.material);
        System.out.println(b4.color);
        System.out.println(b4.size);
        System.out.println(b4.weight);
        System.out.println(b4.price);
        System.out.println("---------------------------");

        Blanket b5 = new Blanket();
        b5.brand = "Wakefit";
        b5.material = "Polyester";
        b5.color = "Beige";
        b5.size = "Queen";
        b5.weight = 1.6;
        b5.price = 1300;

        System.out.println(b5.brand);
        System.out.println(b5.material);
        System.out.println(b5.color);
        System.out.println(b5.size);
        System.out.println(b5.weight);
        System.out.println(b5.price);
        System.out.println("---------------------------");

        Blanket b6 = new Blanket();
        b6.brand = "Spaces";
        b6.material = "Cotton Blend";
        b6.color = "White";
        b6.size = "King";
        b6.weight = 1.9;
        b6.price = 1600;

        System.out.println(b6.brand);
        System.out.println(b6.material);
        System.out.println(b6.color);
        System.out.println(b6.size);
        System.out.println(b6.weight);
        System.out.println(b6.price);
        System.out.println("---------------------------");
    

        Blanket b7 = new Blanket("AmazonBasics", "Fleece", "Red", "Queen", 1.5, 1200);
        System.out.println(b7.brand);
        System.out.println(b7.material);
        System.out.println(b7.color);
        System.out.println(b7.size);
        System.out.println(b7.weight);
        System.out.println(b7.price);
        System.out.println("---------------------------");

        Blanket b8 = new Blanket("Sleepwell", "Cotton", "Blue", "King", 1.8, 1500);
        System.out.println(b8.brand);
        System.out.println(b8.material);
        System.out.println(b8.color);
        System.out.println(b8.size);
        System.out.println(b8.weight);
        System.out.println(b8.price);
        System.out.println("---------------------------");

        Blanket b9 = new Blanket("D’Decor", "Wool", "Green", "Double", 2.0, 1800);
        System.out.println(b9.brand);
        System.out.println(b9.material);
        System.out.println(b9.color);
        System.out.println(b9.size);
        System.out.println(b9.weight);
        System.out.println(b9.price);
        System.out.println("---------------------------");

        Blanket b10 = new Blanket("HomeCentre", "Microfiber", "Grey", "Single", 1.2, 1000);
        System.out.println(b10.brand);
        System.out.println(b10.material);
        System.out.println(b10.color);
        System.out.println(b10.size);
        System.out.println(b10.weight);
        System.out.println(b10.price);
        System.out.println("---------------------------");

        Blanket b11 = new Blanket("Wakefit", "Polyester", "Beige", "Queen", 1.6, 1300);
        System.out.println(b11.brand);
        System.out.println(b11.material);
        System.out.println(b11.color);
        System.out.println(b11.size);
        System.out.println(b11.weight);
        System.out.println(b11.price);
        System.out.println("---------------------------");

        Blanket b12 = new Blanket("Spaces", "Cotton Blend", "White", "King", 1.9, 1600);
        System.out.println(b12.brand);
        System.out.println(b12.material);
        System.out.println(b12.color);
        System.out.println(b12.size);
        System.out.println(b12.weight);
        System.out.println(b12.price);
        System.out.println("---------------------------");

    }
	
}