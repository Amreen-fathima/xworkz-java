public class PsFiveExecutor {

    public static void main(String[] args) {

        boolean result = PsFive.createPsFive("PS5 Slim","White",54999.0,1024,true,"AMD Ryzen",2,"Digital Edition",true,5);

        if (result) {
            System.out.println("\nPS Five Details:");
            PsFive.getPsFiveDetails();
        } else {
            System.out.println("PS Five creation failed due to invalid data.");
        }
    }
}