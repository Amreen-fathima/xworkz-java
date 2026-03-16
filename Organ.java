class Organ {

String name;
String bodySystem;
String location;
String function;
String weight;
String color;
String structure;
String bloodSupply;
String oxygenRequirement;
String importance;
String protection;
String size;
String tissueType;
String healthCondition;
String researchField;
String medicalSpecialty;
String diseaseRisk;
String developmentStage;
String regenerationAbility;
String survivalImportance;

Organ(String name,String bodySystem,String location,String function,String weight,
String color,String structure,String bloodSupply,String oxygenRequirement,
String importance,String protection,String size,String tissueType,
String healthCondition,String researchField,String medicalSpecialty,
String diseaseRisk,String developmentStage,String regenerationAbility,
String survivalImportance){

this.name=name;
this.bodySystem=bodySystem;
this.location=location;
this.function=function;
this.weight=weight;
this.color=color;
this.structure=structure;
this.bloodSupply=bloodSupply;
this.oxygenRequirement=oxygenRequirement;
this.importance=importance;
this.protection=protection;
this.size=size;
this.tissueType=tissueType;
this.healthCondition=healthCondition;
this.researchField=researchField;
this.medicalSpecialty=medicalSpecialty;
this.diseaseRisk=diseaseRisk;
this.developmentStage=developmentStage;
this.regenerationAbility=regenerationAbility;
this.survivalImportance=survivalImportance;

}

void display(){

System.out.println(name);
System.out.println(bodySystem);
System.out.println(location);
System.out.println(function);
System.out.println(weight);
System.out.println(color);
System.out.println(structure);
System.out.println(bloodSupply);
System.out.println(oxygenRequirement);
System.out.println(importance);
System.out.println(protection);
System.out.println(size);
System.out.println(tissueType);
System.out.println(healthCondition);
System.out.println(researchField);
System.out.println(medicalSpecialty);
System.out.println(diseaseRisk);
System.out.println(developmentStage);
System.out.println(regenerationAbility);
System.out.println(survivalImportance);

}

}