class PeriodicTable {

    int tableId;
    String category;
    Element element;

    PeriodicTable(int tableId, String category, Element element) {
        this.tableId = tableId;
        this.category = category;
        this.element = element;
    }

    void displayDetails() {
        System.out.println(tableId);
        System.out.println(category);
        element.displayDetails();
    }
}