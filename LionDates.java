class LionDates {

    int id;
    String name;
    double price;
    String brand;
    String type;
    int quantity;
    double weight; // in grams
    String color;
    String taste;
    String origin;
    String company;
    String country;
    String manufactureDate;
    String expiryDate;
    String packaging;
    String category;
    String quality;
    String availability;
    int rating;
    String review;

    LionDates() {
        this(1,"Lion Dates",350.0,"Lion","Medjool",20,500.0,"Brown",
             "Sweet","Middle East","Lion Foods Ltd","India","01-01-2025",
             "01-01-2027","Box","Food","Premium","Available",5,"Excellent");
    }

    LionDates(int id,String name,double price,String brand,String type,int quantity,
              double weight,String color,String taste,String origin,String company,
              String country,String manufactureDate,String expiryDate,String packaging,
              String category,String quality,String availability,int rating,String review) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.type=type;
        this.quantity=quantity;
        this.weight=weight;
        this.color=color;
        this.taste=taste;
        this.origin=origin;
        this.company=company;
        this.country=country;
        this.manufactureDate=manufactureDate;
        this.expiryDate=expiryDate;
        this.packaging=packaging;
        this.category=category;
        this.quality=quality;
        this.availability=availability;
        this.rating=rating;
        this.review=review;
    }

    public void getLionDatesDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(type);
        System.out.println(quantity);
        System.out.println(weight);
        System.out.println(color);
        System.out.println(taste);
        System.out.println(origin);
        System.out.println(company);
        System.out.println(country);
        System.out.println(manufactureDate);
        System.out.println(expiryDate);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(quality);
        System.out.println(availability);
        System.out.println(rating);
        System.out.println(review);
    }
}