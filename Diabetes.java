class Diabetes {

String name;
String type;
String cause;
String symptom;
String riskFactor;
String diagnosis;
String treatment;
String medication;
String insulinRequirement;
String dietPlan;
String exerciseAdvice;
String monitoringMethod;
String prevention;
String complication;
String ageGroup;
String doctorSpecialist;
String hospitalCare;
String lifestyleChange;
String researchStatus;
String awarenessLevel;

Diabetes(String name,String type,String cause,String symptom,String riskFactor,
String diagnosis,String treatment,String medication,String insulinRequirement,
String dietPlan,String exerciseAdvice,String monitoringMethod,String prevention,
String complication,String ageGroup,String doctorSpecialist,String hospitalCare,
String lifestyleChange,String researchStatus,String awarenessLevel){

this.name=name;
this.type=type;
this.cause=cause;
this.symptom=symptom;
this.riskFactor=riskFactor;
this.diagnosis=diagnosis;
this.treatment=treatment;
this.medication=medication;
this.insulinRequirement=insulinRequirement;
this.dietPlan=dietPlan;
this.exerciseAdvice=exerciseAdvice;
this.monitoringMethod=monitoringMethod;
this.prevention=prevention;
this.complication=complication;
this.ageGroup=ageGroup;
this.doctorSpecialist=doctorSpecialist;
this.hospitalCare=hospitalCare;
this.lifestyleChange=lifestyleChange;
this.researchStatus=researchStatus;
this.awarenessLevel=awarenessLevel;

}

void display(){

System.out.println(name);
System.out.println(type);
System.out.println(cause);
System.out.println(symptom);
System.out.println(riskFactor);
System.out.println(diagnosis);
System.out.println(treatment);
System.out.println(medication);
System.out.println(insulinRequirement);
System.out.println(dietPlan);
System.out.println(exerciseAdvice);
System.out.println(monitoringMethod);
System.out.println(prevention);
System.out.println(complication);
System.out.println(ageGroup);
System.out.println(doctorSpecialist);
System.out.println(hospitalCare);
System.out.println(lifestyleChange);
System.out.println(researchStatus);
System.out.println(awarenessLevel);

}

}