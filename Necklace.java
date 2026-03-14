class Necklace {
	
    String brand;
    String material;
    String color;
    double length;
    double weight;
    int price;
    String style;
    String gender;
    String occasion;
    String gemType;
    int rating;
    int flexibility;
    String design;
    String origin;
    String claspType;
    int shineLevel;
    int durability;
    int popularity;
    int brandReputation;

    Necklace() {
		
	}

    Necklace(String brand, String material, String color, double length, double weight, int price,
             String style, String gender, String occasion, String gemType, int rating,
             int flexibility, String design, String origin, String claspType,
             int shineLevel, int durability, int popularity, int brandReputation) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.weight = weight;
        this.price = price;
        this.style = style;
        this.gender = gender;
        this.occasion = occasion;
        this.gemType = gemType;
        this.rating = rating;
        this.flexibility = flexibility;
        this.design = design;
        this.origin = origin;
        this.claspType = claspType;
        this.shineLevel = shineLevel;
        this.durability = durability;
        this.popularity = popularity;
        this.brandReputation = brandReputation;
    }
}