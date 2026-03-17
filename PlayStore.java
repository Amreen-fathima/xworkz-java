class PlayStore {

    int storeId;
    String owner;
    Application application;

    PlayStore(int storeId, String owner, Application application) {
        this.storeId = storeId;
        this.owner = owner;
        this.application = application;
    }

    void displayDetails() {
        System.out.println(storeId);
        System.out.println(owner);
        application.displayDetails();
    }
}