class TheoBroma {

    int id;
    String name;
    double price; // average product price
    String brand;
    String category;
    int quantity;
    String flavor;
    String ingredients;
    String weight; // grams
    String color;
    String expiryDate;
    String manufactureDate;
    String company;
    String country;
    String packaging;
    String quality;
    String availability;
    String type;
    int rating;
    String review;

    TheoBroma() {
        this(1,"Chocolate Cake",500.0,"TheoBroma","Bakery",5,"Chocolate",
             "Flour,Sugar,Eggs","500g","Brown","01-04-2025","01-04-2025",
             "TheoBroma Pvt Ltd","India","Box","Premium","Available",
             "Online","5","Excellent");
    }

    TheoBroma(int id,String name,double price,String brand,String category,int quantity,
              String flavor,String ingredients,String weight,String color,String expiryDate,
              String manufactureDate,String company,String country,String packaging,
              String quality,String availability,String type,int rating,String review) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.category=category;
        this.quantity=quantity;
        this.flavor=flavor;
        this.ingredients=ingredients;
        this.weight=weight;
        this.color=color;
        this.expiryDate=expiryDate;
        this.manufactureDate=manufactureDate;
        this.company=company;
        this.country=country;
        this.packaging=packaging;
        this.quality=quality;
        this.availability=availability;
        this.type=type;
        this.rating=rating;
        this.review=review;
    }

    public void getTheoBromaDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(category);
        System.out.println(quantity);
        System.out.println(flavor);
        System.out.println(ingredients);
        System.out.println(weight);
        System.out.println(color);
        System.out.println(expiryDate);
        System.out.println(manufactureDate);
        System.out.println(company);
        System.out.println(country);
        System.out.println(packaging);
        System.out.println(quality);
        System.out.println(availability);
        System.out.println(type);
        System.out.println(rating);
        System.out.println(review);
    }
}