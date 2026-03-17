class SoapHolder {

    int id;
    String name;
    double price;
    String brand;
    String material;
    String color;
    String type;
    int capacity;
    String shape;
    String usage;
    String quality;
    String company;
    String country;
    String manufactureDate;
    String warranty;
    String packaging;
    String category;
    int rating;
    String review;
    String installationType;

    SoapHolder() {
        this(1,"Bathroom Soap Holder",250.0,"HomeEase","Plastic","White",
        "Wall Mount",2,"Rectangle","Hygiene","High","HomeEase Ltd","India",
        "01-01-2025","1 Year","Box","Bathroom","5","Excellent","Wall Mounted");
    }

    SoapHolder(int id,String name,double price,String brand,String material,
    String color,String type,int capacity,String shape,String usage,String quality,
    String company,String country,String manufactureDate,String warranty,String packaging,
    String category,int rating,String review,String installationType) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.material=material;
        this.color=color;
        this.type=type;
        this.capacity=capacity;
        this.shape=shape;
        this.usage=usage;
        this.quality=quality;
        this.company=company;
        this.country=country;
        this.manufactureDate=manufactureDate;
        this.warranty=warranty;
        this.packaging=packaging;
        this.category=category;
        this.rating=rating;
        this.review=review;
        this.installationType=installationType;
    }

    public void getSoapHolderDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(color);
        System.out.println(type);
        System.out.println(capacity);
        System.out.println(shape);
        System.out.println(usage);
        System.out.println(quality);
        System.out.println(company);
        System.out.println(country);
        System.out.println(manufactureDate);
        System.out.println(warranty);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(rating);
        System.out.println(review);
        System.out.println(installationType);
    }
}