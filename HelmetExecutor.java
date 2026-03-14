class HelmetExecutor {
    public static void main(String[] args) {

        Helmet h1 = new Helmet();
        h1.brand = "SG";
        h1.type = "Cricket";
        h1.weight = 600.0;

        System.out.println(h1.brand);
        System.out.println(h1.type);
        System.out.println(h1.weight);

        Helmet h2 = new Helmet();
        h2.brand = "Shrey";
        h2.type = "Cricket";
        h2.weight = 580.0;

        System.out.println(h2.brand);
        System.out.println(h2.type);
        System.out.println(h2.weight);

        Helmet h3 = new Helmet();
        h3.brand = "Masuri";
        h3.type = "Cricket";
        h3.weight = 610.0;

        System.out.println(h3.brand);
        System.out.println(h3.type);
        System.out.println(h3.weight);
		
		Helmet h4 = new Helmet("Kookaburra", "Cricket", 595.0);
        System.out.println(h4.brand);
        System.out.println(h4.type);
        System.out.println(h4.weight);

        Helmet h5 = new Helmet("Gray-Nicolls", "Cricket", 610.0);
        System.out.println(h5.brand);
        System.out.println(h5.type);
        System.out.println(h5.weight);

        Helmet h6 = new Helmet("Adidas", "Cricket", 605.0);
        System.out.println(h6.brand);
        System.out.println(h6.type);
        System.out.println(h6.weight);
    
    }
}