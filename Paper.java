class Paper {

String type;
String color;
String size;
String thickness;
String texture;
String usage;
String brand;
String material;
String finish;
String durability;
String recycling;
String weight;
String packaging;
String origin;
String quality;
String printCompatibility;
String storage;
String ecoFriendly;
String availability;
String priceRange;

Paper(String type,String color,String size,String thickness,String texture,
String usage,String brand,String material,String finish,String durability,
String recycling,String weight,String packaging,String origin,String quality,
String printCompatibility,String storage,String ecoFriendly,String availability,String priceRange){

this.type=type;
this.color=color;
this.size=size;
this.thickness=thickness;
this.texture=texture;
this.usage=usage;
this.brand=brand;
this.material=material;
this.finish=finish;
this.durability=durability;
this.recycling=recycling;
this.weight=weight;
this.packaging=packaging;
this.origin=origin;
this.quality=quality;
this.printCompatibility=printCompatibility;
this.storage=storage;
this.ecoFriendly=ecoFriendly;
this.availability=availability;
this.priceRange=priceRange;

}

void display(){

System.out.println(type);
System.out.println(color);
System.out.println(size);
System.out.println(thickness);
System.out.println(texture);
System.out.println(usage);
System.out.println(brand);
System.out.println(material);
System.out.println(finish);
System.out.println(durability);
System.out.println(recycling);
System.out.println(weight);
System.out.println(packaging);
System.out.println(origin);
System.out.println(quality);
System.out.println(printCompatibility);
System.out.println(storage);
System.out.println(ecoFriendly);
System.out.println(availability);
System.out.println(priceRange);

}

}