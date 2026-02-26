public class PlaystoreExecutor {

    public static void main(String[] args) {

        boolean result = Playstore.createApp("WhatsApp","Meta",4.5,500000000,45.2,"Communication",true,"2.24.1");

        if (result) {
            System.out.println("\nApp Details:");
            Playstore.getAppDetails();
        } else {
            System.out.println("App creation failed.");
        }
    }
}