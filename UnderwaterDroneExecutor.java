class UnderwaterDroneExecutor{

public static void main(String[] args){

UnderwaterDrone u=new UnderwaterDrone("PowerVision",100,3.5,75000,"Blue",true,2.5,"Aluminum","China",2,true,"Propeller");

System.out.println(u.brand);
System.out.println(u.maxDepth);
System.out.println(u.weight);
System.out.println(u.price);
System.out.println(u.color);
System.out.println(u.cameraEnabled);
System.out.println(u.batteryLife);
System.out.println(u.material);
System.out.println(u.country);
System.out.println(u.warranty);
System.out.println(u.wifiEnabled);
System.out.println(u.propulsionType);

}

}