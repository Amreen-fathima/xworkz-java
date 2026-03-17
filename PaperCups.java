class PaperCups {

    int id;
    String name;
    double price;
    String brand;
    String material;
    int capacity; // ml
    String color;
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

    PaperCups() {
        this(1,"Disposable Paper Cups",200.0,"EcoCups","Paper",250,"White",
             50,"Drinking","High","EcoCups Ltd","India","01-01-2025",
             "01-01-2027","Box","Kitchenware","Round",5,"Excellent","Single Wall");
    }

    PaperCups(int id,String name,double price,String brand,String material,int capacity,
              String color,int quantityPerPack,String usage,String quality,String company,
              String country,String manufactureDate,String expiryDate,String packaging,
              String category,String shape,int rating,String review,String type) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.material=material;
        this.capacity=capacity;
        this.color=color;
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

    public void getPaperCupsDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(capacity);
        System.out.println(color);
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