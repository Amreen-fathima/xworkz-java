class Stand {

String name;
String material;
String color;
String height;
String width;
String weight;
String usage;
String brand;
String origin;
String durability;
String design;
String portability;
String stability;
String finish;
String storageCapacity;
String maintenance;
String priceRange;
String warranty;
String availability;
String model;

Stand(String name,String material,String color,String height,String width,
String weight,String usage,String brand,String origin,String durability,
String design,String portability,String stability,String finish,
String storageCapacity,String maintenance,String priceRange,String warranty,
String availability,String model){

this.name=name;
this.material=material;
this.color=color;
this.height=height;
this.width=width;
this.weight=weight;
this.usage=usage;
this.brand=brand;
this.origin=origin;
this.durability=durability;
this.design=design;
this.portability=portability;
this.stability=stability;
this.finish=finish;
this.storageCapacity=storageCapacity;
this.maintenance=maintenance;
this.priceRange=priceRange;
this.warranty=warranty;
this.availability=availability;
this.model=model;

}

void display(){

System.out.println(name);
System.out.println(material);
System.out.println(color);
System.out.println(height);
System.out.println(width);
System.out.println(weight);
System.out.println(usage);
System.out.println(brand);
System.out.println(origin);
System.out.println(durability);
System.out.println(design);
System.out.println(portability);
System.out.println(stability);
System.out.println(finish);
System.out.println(storageCapacity);
System.out.println(maintenance);
System.out.println(priceRange);
System.out.println(warranty);
System.out.println(availability);
System.out.println(model);

}

}