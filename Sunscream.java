class Sunscream {

    int id;
    String name;
    double price;
    String brand;
    String skinType;
    int quantity;
    double weight;
    String color;
    String manufactureDate;
    String expiryDate;
    String company;
    String country;
    String fragrance;
    String packaging;
    String category;
    String quality;
    String availability;
    int rating;
    String review;
    String usage;

    Sunscream() {
        this(1,"Sun Shield Sunscream",250.0,"Nivea","All Skin Types",30,100.0,
             "White","01-03-2025","01-03-2027","Nivea Ltd","India",
             "Mild","Tube","SkinCare","Premium","Available",5,"Excellent","Face & Body");
    }

    Sunscream(int id,String name,double price,String brand,String skinType,
              int quantity,double weight,String color,String manufactureDate,
              String expiryDate,String company,String country,String fragrance,
              String packaging,String category,String quality,String availability,
              int rating,String review,String usage) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.skinType=skinType;
        this.quantity=quantity;
        this.weight=weight;
        this.color=color;
        this.manufactureDate=manufactureDate;
        this.expiryDate=expiryDate;
        this.company=company;
        this.country=country;
        this.fragrance=fragrance;
        this.packaging=packaging;
        this.category=category;
        this.quality=quality;
        this.availability=availability;
        this.rating=rating;
        this.review=review;
        this.usage=usage;
    }

    public void getSunscreamDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(skinType);
        System.out.println(quantity);
        System.out.println(weight);
        System.out.println(color);
        System.out.println(manufactureDate);
        System.out.println(expiryDate);
        System.out.println(company);
        System.out.println(country);
        System.out.println(fragrance);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(quality);
        System.out.println(availability);
        System.out.println(rating);
        System.out.println(review);
        System.out.println(usage);
    }
}