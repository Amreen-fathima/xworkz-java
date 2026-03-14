class ShoeLace {
    String brand;
    int length;
    String color;
    String material;
    String type;
    int price;
    String shoeUsed;
    int flexibility;
    int durability;
    String stitching;
    String texture;

    ShoeLace() {
		
	}

    ShoeLace(String brand, int length, String color, String material, String type,
             int price, String shoeUsed, int flexibility, int durability,
             String stitching, String texture) {
        this.brand = brand;
        this.length = length;
        this.color = color;
        this.material = material;
        this.type = type;
        this.price = price;
        this.shoeUsed = shoeUsed;
        this.flexibility = flexibility;
        this.durability = durability;
        this.stitching = stitching;
        this.texture = texture;
    }
}