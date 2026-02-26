class Forever24Executor {

    public static void main(String[] args) {

        boolean isCreated = Forever24.createCloth("Forever24","Casual T-Shirt","Top Wear","M","Black",799.00,"Cotton","Unisex","Summer",true,50,"India");

        if (isCreated) {
            Forever24.getCloth();
        } else {
            System.out.println("Cloth not created due to invalid data");
        }
    }
}