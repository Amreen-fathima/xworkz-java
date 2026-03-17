class CCD {

    int cafeId;
    String cafeName;
    Coffee coffee;

    CCD(int cafeId, String cafeName, Coffee coffee) {
        this.cafeId = cafeId;
        this.cafeName = cafeName;
        this.coffee = coffee;
    }

    void displayDetails() {
        System.out.println(cafeId);
        System.out.println(cafeName);
        coffee.displayDetails();
    }
}