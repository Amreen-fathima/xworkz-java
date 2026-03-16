class Brain {

String name;
String location;
String weight;
String color;
String structure;
String function;
String nervousSystemType;
String protection;
String bloodSupply;
String oxygenRequirement;
String neuronCount;
String memoryFunction;
String thinkingAbility;
String coordinationRole;
String sensoryControl;
String motorControl;
String healthCondition;
String researchField;
String awarenessLevel;
String importance;

Brain(String name,String location,String weight,String color,String structure,
String function,String nervousSystemType,String protection,String bloodSupply,
String oxygenRequirement,String neuronCount,String memoryFunction,
String thinkingAbility,String coordinationRole,String sensoryControl,
String motorControl,String healthCondition,String researchField,
String awarenessLevel,String importance){

this.name=name;
this.location=location;
this.weight=weight;
this.color=color;
this.structure=structure;
this.function=function;
this.nervousSystemType=nervousSystemType;
this.protection=protection;
this.bloodSupply=bloodSupply;
this.oxygenRequirement=oxygenRequirement;
this.neuronCount=neuronCount;
this.memoryFunction=memoryFunction;
this.thinkingAbility=thinkingAbility;
this.coordinationRole=coordinationRole;
this.sensoryControl=sensoryControl;
this.motorControl=motorControl;
this.healthCondition=healthCondition;
this.researchField=researchField;
this.awarenessLevel=awarenessLevel;
this.importance=importance;

}

void display(){

System.out.println(name);
System.out.println(location);
System.out.println(weight);
System.out.println(color);
System.out.println(structure);
System.out.println(function);
System.out.println(nervousSystemType);
System.out.println(protection);
System.out.println(bloodSupply);
System.out.println(oxygenRequirement);
System.out.println(neuronCount);
System.out.println(memoryFunction);
System.out.println(thinkingAbility);
System.out.println(coordinationRole);
System.out.println(sensoryControl);
System.out.println(motorControl);
System.out.println(healthCondition);
System.out.println(researchField);
System.out.println(awarenessLevel);
System.out.println(importance);

}

}