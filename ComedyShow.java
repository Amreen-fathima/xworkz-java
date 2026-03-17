class ComedyShow {

    int id;
    String name;
    double price; 
    String venue;
    String showTime;
    String duration;
    String language;
    String host;
    int availableSeats;
    String category;
    String company;
    String country;
    String sponsor;
    String director;
    String cast;
    String genre;
    String quality;
    int rating;
    String review;
    String type;

    ComedyShow() {
        this(1,"Laugh Riot",500.0,"City Auditorium","7:00 PM","2 Hours","English",
             "John Doe",200,"Entertainment","Fun Events Ltd","India","Pepsi",
             "Jane Smith","Famous Cast","Standup","High",5,"Excellent","Live");
    }

    ComedyShow(int id,String name,double price,String venue,String showTime,String duration,
               String language,String host,int availableSeats,String category,String company,
               String country,String sponsor,String director,String cast,String genre,
               String quality,int rating,String review,String type) {

        this.id=id;
        this.name=name;
        this.price=price;
        this.venue=venue;
        this.showTime=showTime;
        this.duration=duration;
        this.language=language;
        this.host=host;
        this.availableSeats=availableSeats;
        this.category=category;
        this.company=company;
        this.country=country;
        this.sponsor=sponsor;
        this.director=director;
        this.cast=cast;
        this.genre=genre;
        this.quality=quality;
        this.rating=rating;
        this.review=review;
        this.type=type;
    }

    public void getComedyShowDetails() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(venue);
        System.out.println(showTime);
        System.out.println(duration);
        System.out.println(language);
        System.out.println(host);
        System.out.println(availableSeats);
        System.out.println(category);
        System.out.println(company);
        System.out.println(country);
        System.out.println(sponsor);
        System.out.println(director);
        System.out.println(cast);
        System.out.println(genre);
        System.out.println(quality);
        System.out.println(rating);
        System.out.println(review);
        System.out.println(type);
    }
}