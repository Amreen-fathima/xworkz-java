class Cell {

String name;
String type;
String shape;
String size;
String structure;
String nucleusPresence;
String cytoplasmType;
String membraneType;
String organelles;
String function;
String energySource;
String reproductionMethod;
String lifespan;
String discovery;
String discoveredBy;
String organismType;
String geneticMaterial;
String metabolismType;
String location;
String importance;

Cell(String name,String type,String shape,String size,String structure,
String nucleusPresence,String cytoplasmType,String membraneType,String organelles,
String function,String energySource,String reproductionMethod,String lifespan,
String discovery,String discoveredBy,String organismType,String geneticMaterial,
String metabolismType,String location,String importance){

this.name=name;
this.type=type;
this.shape=shape;
this.size=size;
this.structure=structure;
this.nucleusPresence=nucleusPresence;
this.cytoplasmType=cytoplasmType;
this.membraneType=membraneType;
this.organelles=organelles;
this.function=function;
this.energySource=energySource;
this.reproductionMethod=reproductionMethod;
this.lifespan=lifespan;
this.discovery=discovery;
this.discoveredBy=discoveredBy;
this.organismType=organismType;
this.geneticMaterial=geneticMaterial;
this.metabolismType=metabolismType;
this.location=location;
this.importance=importance;

}

void display(){

System.out.println(name);
System.out.println(type);
System.out.println(shape);
System.out.println(size);
System.out.println(structure);
System.out.println(nucleusPresence);
System.out.println(cytoplasmType);
System.out.println(membraneType);
System.out.println(organelles);
System.out.println(function);
System.out.println(energySource);
System.out.println(reproductionMethod);
System.out.println(lifespan);
System.out.println(discovery);
System.out.println(discoveredBy);
System.out.println(organismType);
System.out.println(geneticMaterial);
System.out.println(metabolismType);
System.out.println(location);
System.out.println(importance);

}

}