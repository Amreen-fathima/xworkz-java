class Speaker {

 //ref
 
   static boolean isConnected ;
     static boolean onOrOff()  {
	 
	   if(isConnected == false )  {
	 
	   isConnected =true ;
	   System.out.println("The Speaker is turned On...");
	 }
	 else if (isConnected ==true)  {
	 
	 isConnected =false;
	 System.out.println("The Speakeris turned Off...");
	 
	}
	
	return isConnected;
	}
}