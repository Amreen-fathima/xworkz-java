class HydroponicKitExecutor{

public static void main(String[] args){

HydroponicKit h=new HydroponicKit("AeroGarden",6,4.5,12000,"Plastic","White",true,"Submersible","USA",2,true,"Plastic");

System.out.println(h.brand);
System.out.println(h.plantCapacity);
System.out.println(h.weight);
System.out.println(h.price);
System.out.println(h.material);
System.out.println(h.color);
System.out.println(h.ledLights);
System.out.println(h.pumpType);
System.out.println(h.country);
System.out.println(h.warranty);
System.out.println(h.smartApp);
System.out.println(h.waterTankMaterial);

}

}