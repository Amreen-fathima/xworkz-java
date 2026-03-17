class Element {

    int atomicNumber;
    String elementName;
    String symbol;

    Element(int atomicNumber, String elementName, String symbol) {
        this.atomicNumber = atomicNumber;
        this.elementName = elementName;
        this.symbol = symbol;
    }

    void displayDetails() {
        System.out.println(atomicNumber);
        System.out.println(elementName);
        System.out.println(symbol);
    }
}