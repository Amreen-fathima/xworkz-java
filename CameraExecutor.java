class CameraExecutor  {
    public static void main (String[] args)  {
	 
	    boolean result = Camera.createCamera("Canon","EOS 1500D",24,10,true,true,4000,55000,"Black",2);
		 
		if (result) {
		 
		    Camera.getCameraDetails();
		}
	}
}