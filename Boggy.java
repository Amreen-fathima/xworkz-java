class Boggy {

    int boggyId;
    String type;
    int capacity;

    Boggy(int boggyId, String type, int capacity) {
        this.boggyId = boggyId;
        this.type = type;
        this.capacity = capacity;
    }

    void displayDetails() {
        System.out.println(boggyId);
        System.out.println(type);
        System.out.println(capacity);
    }
}