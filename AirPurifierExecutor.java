class AirPurifierExecutor{

public static void main(String[] args){

AirPurifier a=new AirPurifier("Philips",30,"HEPA",5.5,12000,"White",true,3,"Low","Netherlands",2,true);

System.out.println(a.brand);
System.out.println(a.coverageArea);
System.out.println(a.filterType);
System.out.println(a.weight);
System.out.println(a.price);
System.out.println(a.color);
System.out.println(a.humidifier);
System.out.println(a.fanSpeedLevels);
System.out.println(a.noiseLevel);
System.out.println(a.country);
System.out.println(a.warranty);
System.out.println(a.smartEnabled);

}

}