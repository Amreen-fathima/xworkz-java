class Comb {

    int id;
    String name;
    double price;
    String brand;
    String material;
    String color;
    String type;
    int teethCount;
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
    String handleType;

    Comb() {
        this(1,"Hair Comb",50.0,"Kent","Plastic","Black","Fine-Tooth",
        120,"Rectangular","Hair Styling","High","Kent Ltd","India",
        "01-01-2025","6 Months","Box","Personal Care",5,"Excellent","Non-Slip");
    }

    Comb(int id,String name,double price,String brand,String material,
         String color,String type,int teethCount,String shape,String usage,
         String quality,String company,String country,String manufactureDate,
         String warranty,String packaging,String category,int rating,String review,
         String handleType) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.material=material;
        this.color=color;
        this.type=type;
        this.teethCount=teethCount;
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
        this.handleType=handleType;
    }

    public void getCombDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(color);
        System.out.println(type);
        System.out.println(teethCount);
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
        System.out.println(handleType);
    }
}