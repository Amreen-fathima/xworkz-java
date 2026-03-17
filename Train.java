class Train {

    int trainId;
    String trainName;
    Boggy boggy;

    Train(int trainId, String trainName, Boggy boggy) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.boggy = boggy;
    }

    void displayDetails() {
        System.out.println(trainId);
        System.out.println(trainName);
        boggy.displayDetails();
    }
}