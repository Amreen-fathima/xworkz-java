class RobotVacuumExecutor{

public static void main(String[] args){

RobotVacuum r=new RobotVacuum("iRobot","Roomba i3",2.5,3.5,25000,"Black","Plastic",true,true,"USA",0.6,2);

System.out.println(r.brand);
System.out.println(r.model);
System.out.println(r.batteryLife);
System.out.println(r.weight);
System.out.println(r.price);
System.out.println(r.color);
System.out.println(r.material);
System.out.println(r.wifiEnabled);
System.out.println(r.smartSensor);
System.out.println(r.country);
System.out.println(r.dustbinCapacity);
System.out.println(r.warranty);

}

}