class Trophy {

String name;
String material;
String color;
String height;
String weight;
String shape;
String event;
String category;
String brand;
String manufacturer;
String origin;
String finish;
String engraving;
String durability;
String priceRange;
String packaging;
String storage;
String presentation;
String popularity;
String edition;

Trophy(String name,String material,String color,String height,String weight,
String shape,String event,String category,String brand,String manufacturer,
String origin,String finish,String engraving,String durability,String priceRange,
String packaging,String storage,String presentation,String popularity,String edition){

this.name=name;
this.material=material;
this.color=color;
this.height=height;
this.weight=weight;
this.shape=shape;
this.event=event;
this.category=category;
this.brand=brand;
this.manufacturer=manufacturer;
this.origin=origin;
this.finish=finish;
this.engraving=engraving;
this.durability=durability;
this.priceRange=priceRange;
this.packaging=packaging;
this.storage=storage;
this.presentation=presentation;
this.popularity=popularity;
this.edition=edition;

}

void display(){

System.out.println(name);
System.out.println(material);
System.out.println(color);
System.out.println(height);
System.out.println(weight);
System.out.println(shape);
System.out.println(event);
System.out.println(category);
System.out.println(brand);
System.out.println(manufacturer);
System.out.println(origin);
System.out.println(finish);
System.out.println(engraving);
System.out.println(durability);
System.out.println(priceRange);
System.out.println(packaging);
System.out.println(storage);
System.out.println(presentation);
System.out.println(popularity);
System.out.println(edition);

}

}