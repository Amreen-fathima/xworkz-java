class SmartDoorbellExecutor{

public static void main(String[] args){

SmartDoorbell s=new SmartDoorbell("Ring","VideoDoor",0.6,12000,"White",true,true,"Digital","USA",2,true,"Plastic");

System.out.println(s.brand);
System.out.println(s.model);
System.out.println(s.weight);
System.out.println(s.price);
System.out.println(s.color);
System.out.println(s.wifiEnabled);
System.out.println(s.motionDetection);
System.out.println(s.chimeType);
System.out.println(s.country);
System.out.println(s.warranty);
System.out.println(s.nightVision);
System.out.println(s.material);

}

}