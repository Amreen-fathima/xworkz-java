class ZanduBalm {

    int id;
    String name;
    double price;
    String brand;
    String type;
    int quantity;
    double weight;
    String color;
    String manufactureDate;
    String expiryDate;
    String company;
    String country;
    String usage;
    String smell;
    String packaging;
    String category;
    String quality;
    String availability;
    int rating;
    String review;

    ZanduBalm() {
        this(1,"Zandu Balm",50.0,"Emami","Pain Relief",10,25.5,"Yellow",
        "01-01-2025","01-01-2028","Emami Ltd","India","Headache Relief",
        "Strong","Box","Medical","High","Available",5,"Good");
    }

    ZanduBalm(int id,String name,double price,String brand,String type,
    int quantity,double weight,String color,String manufactureDate,
    String expiryDate,String company,String country,String usage,
    String smell,String packaging,String category,String quality,
    String availability,int rating,String review) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.type=type;
        this.quantity=quantity;
        this.weight=weight;
        this.color=color;
        this.manufactureDate=manufactureDate;
        this.expiryDate=expiryDate;
        this.company=company;
        this.country=country;
        this.usage=usage;
        this.smell=smell;
        this.packaging=packaging;
        this.category=category;
        this.quality=quality;
        this.availability=availability;
        this.rating=rating;
        this.review=review;
    }

    public void getZanduBalmDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(type);
        System.out.println(quantity);
        System.out.println(weight);
        System.out.println(color);
        System.out.println(manufactureDate);
        System.out.println(expiryDate);
        System.out.println(company);
        System.out.println(country);
        System.out.println(usage);
        System.out.println(smell);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(quality);
        System.out.println(availability);
        System.out.println(rating);
        System.out.println(review);
    }
}