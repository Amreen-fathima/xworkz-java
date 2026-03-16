class Organizer {

String name;
String type;
String material;
String color;
String size;
String compartments;
String usage;
String brand;
String weight;
String priceRange;
String availability;
String durability;
String shape;
String portability;
String design;
String originCountry;
String manufacturer;
String storageCapacity;
String popularity;
String model;

Organizer(String name,String type,String material,String color,String size,
String compartments,String usage,String brand,String weight,String priceRange,
String availability,String durability,String shape,String portability,
String design,String originCountry,String manufacturer,String storageCapacity,
String popularity,String model){

this.name=name;
this.type=type;
this.material=material;
this.color=color;
this.size=size;
this.compartments=compartments;
this.usage=usage;
this.brand=brand;
this.weight=weight;
this.priceRange=priceRange;
this.availability=availability;
this.durability=durability;
this.shape=shape;
this.portability=portability;
this.design=design;
this.originCountry=originCountry;
this.manufacturer=manufacturer;
this.storageCapacity=storageCapacity;
this.popularity=popularity;
this.model=model;

}

void display(){

System.out.println(name);
System.out.println(type);
System.out.println(material);
System.out.println(color);
System.out.println(size);
System.out.println(compartments);
System.out.println(usage);
System.out.println(brand);
System.out.println(weight);
System.out.println(priceRange);
System.out.println(availability);
System.out.println(durability);
System.out.println(shape);
System.out.println(portability);
System.out.println(design);
System.out.println(originCountry);
System.out.println(manufacturer);
System.out.println(storageCapacity);
System.out.println(popularity);
System.out.println(model);

}

}