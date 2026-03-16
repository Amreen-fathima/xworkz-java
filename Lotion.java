class Lotion {

String name;
String brand;
String type;
String fragrance;
String color;
String texture;
String skinType;
String mainIngredient;
String packagingType;
String bottleSize;
String priceRange;
String originCountry;
String manufacturer;
String usage;
String shelfLife;
String chemicalFree;
String skinBenefit;
String availability;
String popularity;
String model;

Lotion(String name,String brand,String type,String fragrance,String color,
String texture,String skinType,String mainIngredient,String packagingType,
String bottleSize,String priceRange,String originCountry,String manufacturer,
String usage,String shelfLife,String chemicalFree,String skinBenefit,
String availability,String popularity,String model){

this.name=name;
this.brand=brand;
this.type=type;
this.fragrance=fragrance;
this.color=color;
this.texture=texture;
this.skinType=skinType;
this.mainIngredient=mainIngredient;
this.packagingType=packagingType;
this.bottleSize=bottleSize;
this.priceRange=priceRange;
this.originCountry=originCountry;
this.manufacturer=manufacturer;
this.usage=usage;
this.shelfLife=shelfLife;
this.chemicalFree=chemicalFree;
this.skinBenefit=skinBenefit;
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
System.out.println(skinType);
System.out.println(mainIngredient);
System.out.println(packagingType);
System.out.println(bottleSize);
System.out.println(priceRange);
System.out.println(originCountry);
System.out.println(manufacturer);
System.out.println(usage);
System.out.println(shelfLife);
System.out.println(chemicalFree);
System.out.println(skinBenefit);
System.out.println(availability);
System.out.println(popularity);
System.out.println(model);

}

}