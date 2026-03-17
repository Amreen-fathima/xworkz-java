class PlasticPlate {

    int id;
    String name;
    double price;
    String brand;
    String material;
    String color;
    int diameter; // in cm
    int quantityPerPack;
    String usage;
    String quality;
    String company;
    String country;
    String manufactureDate;
    String expiryDate;
    String packaging;
    String category;
    String shape;
    int rating;
    String review;
    String type;

    PlasticPlate() {
        this(1,"Disposable Plastic Plate",150.0,"EcoPlast","Plastic","White",
             10,50,"Serving","High","EcoPlast Ltd","India","01-01-2025",
             "01-01-2027","Box","Kitchenware","Round",5,"Excellent","Single Use");
    }

    PlasticPlate(int id,String name,double price,String brand,String material,String color,
                 int diameter,int quantityPerPack,String usage,String quality,String company,
                 String country,String manufactureDate,String expiryDate,String packaging,
                 String category,String shape,int rating,String review,String type) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.material=material;
        this.color=color;
        this.diameter=diameter;
        this.quantityPerPack=quantityPerPack;
        this.usage=usage;
        this.quality=quality;
        this.company=company;
        this.country=country;
        this.manufactureDate=manufactureDate;
        this.expiryDate=expiryDate;
        this.packaging=packaging;
        this.category=category;
        this.shape=shape;
        this.rating=rating;
        this.review=review;
        this.type=type;
    }

    public void getPlasticPlateDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(color);
        System.out.println(diameter);
        System.out.println(quantityPerPack);
        System.out.println(usage);
        System.out.println(quality);
        System.out.println(company);
        System.out.println(country);
        System.out.println(manufactureDate);
        System.out.println(expiryDate);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(shape);
        System.out.println(rating);
        System.out.println(review);
        System.out.println(type);
    }
}