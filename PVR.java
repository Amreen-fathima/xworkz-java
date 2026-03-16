class PVR {

String name;
String location;
String city;
String state;
String country;
String numberOfScreens;
String seatingCapacity;
String ticketPriceRange;
String soundSystem;
String screenType;
String foodCourt;
String parkingFacility;
String onlineBooking;
String openingYear;
String ownerCompany;
String cleanlinessRating;
String staffService;
String popularity;
String weekendRush;
String brandTagline;

PVR(String name,String location,String city,String state,String country,
String numberOfScreens,String seatingCapacity,String ticketPriceRange,
String soundSystem,String screenType,String foodCourt,String parkingFacility,
String onlineBooking,String openingYear,String ownerCompany,
String cleanlinessRating,String staffService,String popularity,
String weekendRush,String brandTagline){

this.name=name;
this.location=location;
this.city=city;
this.state=state;
this.country=country;
this.numberOfScreens=numberOfScreens;
this.seatingCapacity=seatingCapacity;
this.ticketPriceRange=ticketPriceRange;
this.soundSystem=soundSystem;
this.screenType=screenType;
this.foodCourt=foodCourt;
this.parkingFacility=parkingFacility;
this.onlineBooking=onlineBooking;
this.openingYear=openingYear;
this.ownerCompany=ownerCompany;
this.cleanlinessRating=cleanlinessRating;
this.staffService=staffService;
this.popularity=popularity;
this.weekendRush=weekendRush;
this.brandTagline=brandTagline;

}

void display(){

System.out.println(name);
System.out.println(location);
System.out.println(city);
System.out.println(state);
System.out.println(country);
System.out.println(numberOfScreens);
System.out.println(seatingCapacity);
System.out.println(ticketPriceRange);
System.out.println(soundSystem);
System.out.println(screenType);
System.out.println(foodCourt);
System.out.println(parkingFacility);
System.out.println(onlineBooking);
System.out.println(openingYear);
System.out.println(ownerCompany);
System.out.println(cleanlinessRating);
System.out.println(staffService);
System.out.println(popularity);
System.out.println(weekendRush);
System.out.println(brandTagline);

}

}