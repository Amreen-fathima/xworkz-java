class BedSheet {

    int id;
    String name;
    double price;
    String brand;
    String material;
    String color;
    String size;
    String pattern;
    int threadCount;
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
    String designType;

    BedSheet() {
        this(1,"Cotton BedSheet",1200.0,"Bombay Dyeing","Cotton","Blue","Queen",
             "Floral",200,"Sleeping","Premium","Bombay Dyeing Ltd","India",
             "01-01-2025","2 Years","Box","Home Linen",5,"Excellent","Printed");
    }

    BedSheet(int id,String name,double price,String brand,String material,String color,
             String size,String pattern,int threadCount,String usage,String quality,
             String company,String country,String manufactureDate,String warranty,
             String packaging,String category,int rating,String review,String designType) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.material=material;
        this.color=color;
        this.size=size;
        this.pattern=pattern;
        this.threadCount=threadCount;
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
        this.designType=designType;
    }

    public void getBedSheetDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(material);
        System.out.println(color);
        System.out.println(size);
        System.out.println(pattern);
        System.out.println(threadCount);
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
        System.out.println(designType);
    }
}