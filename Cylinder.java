class Cylinder {

    int id;
    String name;
    double price;
    String brand;
    String material;
    double height;
    double radius;
    double capacity;
    String color;
    String usage;
    String quality;
    String company;
    String country;
    String manufactureDate;
    String expiryDate;
    String packaging;
    String category;
    int rating;
    String review;
    String type;

    Cylinder() {
        this(1,"Gas Cylinder",1500.0,"Indane","Steel",90.0,15.0,14.2,
             "Blue","Cooking","High","Indane Ltd","India",
             "01-01-2025","01-01-2030","Box","Kitchen",5,"Excellent","LPG");
    }

    Cylinder(int id,String name,double price,String brand,String material,
             double height,double radius,double capacity,String color,String usage,
             String quality,String company,String country,String manufactureDate,
             String expiryDate,String packaging,String category,int rating,String review,
             String type) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.material=material;
        this.height=height;
        this.radius=radius;
        this.capacity=capacity;
        this.color=color;
        this.usage=usage;
        this.quality=quality;
        this.company=company;
        this.country=country;
        this.manufactureDate=manufactureDate;
        this.expiryDate=expiryDate;
        this.packaging=packaging;
        this.category=category;
        this.rating=rating;
        this.review=review;
        this.type=type;
    }

    public void getCylinderDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(height);
        System.out.println(radius);
        System.out.println(capacity);
        System.out.println(color);
        System.out.println(usage);
        System.out.println(quality);
        System.out.println(company);
        System.out.println(country);
        System.out.println(manufactureDate);
        System.out.println(expiryDate);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(rating);
        System.out.println(review);
        System.out.println(type);
    }
}