class GiriasExecutor {

    public static void main(String[] args) {

        boolean isCreated = Girias.createWashingMachine("LG","T80SKSF1Z",25999.00,8,"Top Load",2,780,true,"Silver",60);

        if (isCreated) {
            Girias.getWashingMachineDetails();
        } else {
            System.out.println("Washing Machine not created due to invalid data");
        }
    }
}