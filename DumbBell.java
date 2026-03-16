class DumbBell {

String name;
String weight;
String material;
String color;
String gripType;
String usage;
String brand;
String origin;
String shape;
String durability;
String coating;
String handleLength;
String diameter;
String texture;
String storageType;
String maintenance;
String priceRange;
String warranty;
String availability;
String model;

DumbBell(String name,String weight,String material,String color,String gripType,
String usage,String brand,String origin,String shape,String durability,
String coating,String handleLength,String diameter,String texture,
String storageType,String maintenance,String priceRange,String warranty,
String availability,String model){

this.name=name;
this.weight=weight;
this.material=material;
this.color=color;
this.gripType=gripType;
this.usage=usage;
this.brand=brand;
this.origin=origin;
this.shape=shape;
this.durability=durability;
this.coating=coating;
this.handleLength=handleLength;
this.diameter=diameter;
this.texture=texture;
this.storageType=storageType;
this.maintenance=maintenance;
this.priceRange=priceRange;
this.warranty=warranty;
this.availability=availability;
this.model=model;

}

void display(){

System.out.println(name);
System.out.println(weight);
System.out.println(material);
System.out.println(color);
System.out.println(gripType);
System.out.println(usage);
System.out.println(brand);
System.out.println(origin);
System.out.println(shape);
System.out.println(durability);
System.out.println(coating);
System.out.println(handleLength);
System.out.println(diameter);
System.out.println(texture);
System.out.println(storageType);
System.out.println(maintenance);
System.out.println(priceRange);
System.out.println(warranty);
System.out.println(availability);
System.out.println(model);

}

}