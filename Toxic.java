class Toxic {

String name;
String type;
String chemicalFormula;
String color;
String odor;
String source;
String state;
String toxicityLevel;
String exposureType;
String healthEffect;
String environmentalImpact;
String usage;
String storageMethod;
String safetyMeasure;
String firstAid;
String regulation;
String detectionMethod;
String disposalMethod;
String researchStatus;
String hazardClass;

Toxic(String name,String type,String chemicalFormula,String color,String odor,
String source,String state,String toxicityLevel,String exposureType,
String healthEffect,String environmentalImpact,String usage,
String storageMethod,String safetyMeasure,String firstAid,String regulation,
String detectionMethod,String disposalMethod,String researchStatus,String hazardClass){

this.name=name;
this.type=type;
this.chemicalFormula=chemicalFormula;
this.color=color;
this.odor=odor;
this.source=source;
this.state=state;
this.toxicityLevel=toxicityLevel;
this.exposureType=exposureType;
this.healthEffect=healthEffect;
this.environmentalImpact=environmentalImpact;
this.usage=usage;
this.storageMethod=storageMethod;
this.safetyMeasure=safetyMeasure;
this.firstAid=firstAid;
this.regulation=regulation;
this.detectionMethod=detectionMethod;
this.disposalMethod=disposalMethod;
this.researchStatus=researchStatus;
this.hazardClass=hazardClass;

}

void display(){

System.out.println(name);
System.out.println(type);
System.out.println(chemicalFormula);
System.out.println(color);
System.out.println(odor);
System.out.println(source);
System.out.println(state);
System.out.println(toxicityLevel);
System.out.println(exposureType);
System.out.println(healthEffect);
System.out.println(environmentalImpact);
System.out.println(usage);
System.out.println(storageMethod);
System.out.println(safetyMeasure);
System.out.println(firstAid);
System.out.println(regulation);
System.out.println(detectionMethod);
System.out.println(disposalMethod);
System.out.println(researchStatus);
System.out.println(hazardClass);

}

}