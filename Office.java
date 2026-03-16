class Office {

String name;
String location;
String company;
String buildingType;
String floorCount;
String employeeCount;
String department;
String workingHours;
String internetAvailability;
String airConditioning;
String meetingRooms;
String cafeteria;
String parkingFacility;
String securitySystem;
String officeType;
String furnitureType;
String computerSystems;
String officeArea;
String establishedYear;
String managerName;

Office(String name,String location,String company,String buildingType,String floorCount,
String employeeCount,String department,String workingHours,String internetAvailability,
String airConditioning,String meetingRooms,String cafeteria,String parkingFacility,
String securitySystem,String officeType,String furnitureType,String computerSystems,
String officeArea,String establishedYear,String managerName){

this.name=name;
this.location=location;
this.company=company;
this.buildingType=buildingType;
this.floorCount=floorCount;
this.employeeCount=employeeCount;
this.department=department;
this.workingHours=workingHours;
this.internetAvailability=internetAvailability;
this.airConditioning=airConditioning;
this.meetingRooms=meetingRooms;
this.cafeteria=cafeteria;
this.parkingFacility=parkingFacility;
this.securitySystem=securitySystem;
this.officeType=officeType;
this.furnitureType=furnitureType;
this.computerSystems=computerSystems;
this.officeArea=officeArea;
this.establishedYear=establishedYear;
this.managerName=managerName;

}

void display(){

System.out.println(name);
System.out.println(location);
System.out.println(company);
System.out.println(buildingType);
System.out.println(floorCount);
System.out.println(employeeCount);
System.out.println(department);
System.out.println(workingHours);
System.out.println(internetAvailability);
System.out.println(airConditioning);
System.out.println(meetingRooms);
System.out.println(cafeteria);
System.out.println(parkingFacility);
System.out.println(securitySystem);
System.out.println(officeType);
System.out.println(furnitureType);
System.out.println(computerSystems);
System.out.println(officeArea);
System.out.println(establishedYear);
System.out.println(managerName);

}

}