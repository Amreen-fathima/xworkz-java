class WeatherStationExecutor{

public static void main(String[] args){

WeatherStation w=new WeatherStation("Ambient","WS100", -20,100,true,1.2,15000,"Gray","USA",2,true,"Digital");

System.out.println(w.brand);
System.out.println(w.model);
System.out.println(w.temperatureRange);
System.out.println(w.humidityRange);
System.out.println(w.wifiEnabled);
System.out.println(w.weight);
System.out.println(w.price);
System.out.println(w.color);
System.out.println(w.country);
System.out.println(w.warranty);
System.out.println(w.solarPowered);
System.out.println(w.sensorType);

}

}