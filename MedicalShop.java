class MedicalShop {

    int id;
    String name;
    String ownerName;
    String location;
    String city;
    String state;
    String country;
    String licenseNumber;
    int totalStaff;
    int openHours; // per day
    String contactNumber;
    String email;
    String category;
    String availability;
    String quality;
    String services;
    int rating;
    String review;
    String registrationDate;
    String type;

    MedicalShop() {
        this(1,"HealthPlus Pharmacy","Dr. Rahul Kumar","MG Road","Bangalore",
             "Karnataka","India","LIC12345",15,12,"9876543210","healthplus@gmail.com",
             "Retail","Available","Premium","Medicines & Consultation",
             5,"Excellent","01-01-2015","Retail");
    }

    MedicalShop(int id,String name,String ownerName,String location,String city,String state,
                String country,String licenseNumber,int totalStaff,int openHours,
                String contactNumber,String email,String category,String availability,
                String quality,String services,int rating,String review,String registrationDate,
                String type) {

        this.id=id;
        this.name=name;
        this.ownerName=ownerName;
        this.location=location;
        this.city=city;
        this.state=state;
        this.country=country;
        this.licenseNumber=licenseNumber;
        this.totalStaff=totalStaff;
        this.openHours=openHours;
        this.contactNumber=contactNumber;
        this.email=email;
        this.category=category;
        this.availability=availability;
        this.quality=quality;
        this.services=services;
        this.rating=rating;
        this.review=review;
        this.registrationDate=registrationDate;
        this.type=type;
    }

    public void getMedicalShopDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(ownerName);
        System.out.println(location);
        System.out.println(city);
        System.out.println(state);
        System.out.println(country);
        System.out.println(licenseNumber);
        System.out.println(totalStaff);
        System.out.println(openHours);
        System.out.println(contactNumber);
        System.out.println(email);
        System.out.println(category);
        System.out.println(availability);
        System.out.println(quality);
        System.out.println(services);
        System.out.println(rating);
        System.out.println(review);
        System.out.println(registrationDate);
        System.out.println(type);
    }
}