class AquariumExecutor{

public static void main(String[] args){

Aquarium a=new Aquarium("Rectangle",120,"Glass","Freshwater",10,"BioFilter","LED",26.5,8500,"AquaWorld",18.2,2);

System.out.println(a.shape);
System.out.println(a.capacity);
System.out.println(a.material);
System.out.println(a.waterType);
System.out.println(a.fishCount);
System.out.println(a.filterType);
System.out.println(a.lightType);
System.out.println(a.temperature);
System.out.println(a.price);
System.out.println(a.brand);
System.out.println(a.weight);
System.out.println(a.warranty);

}

}