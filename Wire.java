class Wire {

    int id;
    String name;
    double price;
    String brand;
    String material;
    int length;
    String color;
    String type;
    String usage;
    String quality;
    String company;
    String country;
    String manufactureDate;
    String warranty;
    String packaging;
    String category;
    String thickness;
    String conductivity;
    int rating;
    String review;

    Wire() {
        this(1,"Electric Wire",150.0,"Finolex","Copper",50,"Red","Flexible",
        "Electrical","High","Finolex Ltd","India","01-01-2025","2 Years",
        "Roll","Electrical","Medium","High",5,"Excellent");
    }

    Wire(int id,String name,double price,String brand,String material,
    int length,String color,String type,String usage,String quality,
    String company,String country,String manufactureDate,String warranty,
    String packaging,String category,String thickness,String conductivity,
    int rating,String review) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.material=material;
        this.length=length;
        this.color=color;
        this.type=type;
        this.usage=usage;
        this.quality=quality;
        this.company=company;
        this.country=country;
        this.manufactureDate=manufactureDate;
        this.warranty=warranty;
        this.packaging=packaging;
        this.category=category;
        this.thickness=thickness;
        this.conductivity=conductivity;
        this.rating=rating;
        this.review=review;
    }

    public void getWireDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(length);
        System.out.println(color);
        System.out.println(type);
        System.out.println(usage);
        System.out.println(quality);
        System.out.println(company);
        System.out.println(country);
        System.out.println(manufactureDate);
        System.out.println(warranty);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(thickness);
        System.out.println(conductivity);
        System.out.println(rating);
        System.out.println(review);
    }
}