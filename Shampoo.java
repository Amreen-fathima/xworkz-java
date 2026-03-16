class Shampoo {

String name;
String brand;
String type;
String fragrance;
String color;
String texture;
String hairType;
String mainIngredient;
String packagingType;
String bottleSize;
String priceRange;
String originCountry;
String manufacturer;
String usage;
String shelfLife;
String chemicalFree;
String scalpBenefit;
String availability;
String popularity;
String model;

Shampoo(String name,String brand,String type,String fragrance,String color,
String texture,String hairType,String mainIngredient,String packagingType,
String bottleSize,String priceRange,String originCountry,String manufacturer,
String usage,String shelfLife,String chemicalFree,String scalpBenefit,
String availability,String popularity,String model){

this.name=name;
this.brand=brand;
this.type=type;
this.fragrance=fragrance;
this.color=color;
this.texture=texture;
this.hairType=hairType;
this.mainIngredient=mainIngredient;
this.packagingType=packagingType;
this.bottleSize=bottleSize;
this.priceRange=priceRange;
this.originCountry=originCountry;
this.manufacturer=manufacturer;
this.usage=usage;
this.shelfLife=shelfLife;
this.chemicalFree=chemicalFree;
this.scalpBenefit=scalpBenefit;
this.availability=availability;
this.popularity=popularity;
this.model=model;

}

void display(){

System.out.println(name);
System.out.println(brand);
System.out.println(type);
System.out.println(fragrance);
System.out.println(color);
System.out.println(texture);
System.out.println(hairType);
System.out.println(mainIngredient);
System.out.println(packagingType);
System.out.println(bottleSize);
System.out.println(priceRange);
System.out.println(originCountry);
System.out.println(manufacturer);
System.out.println(usage);
System.out.println(shelfLife);
System.out.println(chemicalFree);
System.out.println(scalpBenefit);
System.out.println(availability);
System.out.println(popularity);
System.out.println(model);

}

}