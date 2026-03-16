class Map {

String name;
String type;
String scale;
String region;
String language;
String publisher;
String material;
String colorScheme;
String projection;
String edition;
String size;
String foldingType;
String durability;
String waterproof;
String usage;
String printingQuality;
String legendType;
String gridType;
String availability;
String priceRange;

Map(String name,String type,String scale,String region,String language,
String publisher,String material,String colorScheme,String projection,
String edition,String size,String foldingType,String durability,
String waterproof,String usage,String printingQuality,String legendType,
String gridType,String availability,String priceRange){

this.name=name;
this.type=type;
this.scale=scale;
this.region=region;
this.language=language;
this.publisher=publisher;
this.material=material;
this.colorScheme=colorScheme;
this.projection=projection;
this.edition=edition;
this.size=size;
this.foldingType=foldingType;
this.durability=durability;
this.waterproof=waterproof;
this.usage=usage;
this.printingQuality=printingQuality;
this.legendType=legendType;
this.gridType=gridType;
this.availability=availability;
this.priceRange=priceRange;

}

void display(){

System.out.println(name);
System.out.println(type);
System.out.println(scale);
System.out.println(region);
System.out.println(language);
System.out.println(publisher);
System.out.println(material);
System.out.println(colorScheme);
System.out.println(projection);
System.out.println(edition);
System.out.println(size);
System.out.println(foldingType);
System.out.println(durability);
System.out.println(waterproof);
System.out.println(usage);
System.out.println(printingQuality);
System.out.println(legendType);
System.out.println(gridType);
System.out.println(availability);
System.out.println(priceRange);

}

}