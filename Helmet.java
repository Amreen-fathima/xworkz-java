class Helmet {

    String brand;
    String type;
    double weight;

    Helmet() {
        Helmet temp = new Helmet("DefaultBrand", "DefaultType", 500.0);
        this.brand = temp.brand;
        this.type = temp.type;
        this.weight = temp.weight;
    }

    Helmet(String brand, String type, double weight) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
    }
}