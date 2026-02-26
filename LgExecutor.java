class LgExecutor {

    public static void main(String[] args) {

        boolean isCreated = Lg.createRefrigerator("LG","GL-S292RPZX",28999.00,260,"Double Door",1,true,"Shiny Steel",4,true);

        if (isCreated) {
            Lg.getRefrigeratorDetails();
        } else {
            System.out.println("Refrigerator not created due to invalid data");
        }
    }
}