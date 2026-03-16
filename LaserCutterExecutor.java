class LaserCutterExecutor{

public static void main(String[] args){

LaserCutter l=new LaserCutter("Glowforge","Plus",45,50,30,350000,"Wood/Plastic/Leather","White","USA",2,true,"Air");

System.out.println(l.brand);
System.out.println(l.model);
System.out.println(l.power);
System.out.println(l.bedSize);
System.out.println(l.weight);
System.out.println(l.price);
System.out.println(l.materialCompatibility);
System.out.println(l.color);
System.out.println(l.country);
System.out.println(l.warranty);
System.out.println(l.wifiEnabled);
System.out.println(l.coolingType);

}

}