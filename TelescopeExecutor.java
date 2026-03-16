class TelescopeExecutor{

public static void main(String[] args){

Telescope t=new Telescope("Celestron","Reflector",130,650,"Altazimuth",5.5,"Aluminum",22000,"Convex","Black",2,"USA");

System.out.println(t.brand);
System.out.println(t.type);
System.out.println(t.aperture);
System.out.println(t.focalLength);
System.out.println(t.mountType);
System.out.println(t.weight);
System.out.println(t.tripodMaterial);
System.out.println(t.price);
System.out.println(t.lensType);
System.out.println(t.color);
System.out.println(t.warranty);
System.out.println(t.country);

}

}