class Education {

String courseName;
String field;
String level;
String duration;
String university;
String college;
String location;
String mode;
String medium;
String eligibility;
String syllabusType;
String examPattern;
String gradingSystem;
String certification;
String internship;
String placementSupport;
String researchOpportunity;
String libraryFacility;
String laboratoryFacility;
String importance;

Education(String courseName,String field,String level,String duration,String university,
String college,String location,String mode,String medium,String eligibility,
String syllabusType,String examPattern,String gradingSystem,String certification,
String internship,String placementSupport,String researchOpportunity,
String libraryFacility,String laboratoryFacility,String importance){

this.courseName=courseName;
this.field=field;
this.level=level;
this.duration=duration;
this.university=university;
this.college=college;
this.location=location;
this.mode=mode;
this.medium=medium;
this.eligibility=eligibility;
this.syllabusType=syllabusType;
this.examPattern=examPattern;
this.gradingSystem=gradingSystem;
this.certification=certification;
this.internship=internship;
this.placementSupport=placementSupport;
this.researchOpportunity=researchOpportunity;
this.libraryFacility=libraryFacility;
this.laboratoryFacility=laboratoryFacility;
this.importance=importance;

}

void display(){

System.out.println(courseName);
System.out.println(field);
System.out.println(level);
System.out.println(duration);
System.out.println(university);
System.out.println(college);
System.out.println(location);
System.out.println(mode);
System.out.println(medium);
System.out.println(eligibility);
System.out.println(syllabusType);
System.out.println(examPattern);
System.out.println(gradingSystem);
System.out.println(certification);
System.out.println(internship);
System.out.println(placementSupport);
System.out.println(researchOpportunity);
System.out.println(libraryFacility);
System.out.println(laboratoryFacility);
System.out.println(importance);

}

}