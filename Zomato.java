class Zomato  {

 public static double search (String foodName) {
 
     double price  = 0.0;
	 if(foodName == "Burger") {
	 
	    price = 99.00;
		return price;
	}
	else if(foodName== " Benne Dose") {
		price = 80.00;
		return price;
	}
	else if(foodName == " Idli ") {
		price = 40.00;
		return price;
	}
	else if(foodName == "Pizza ") {
		price =130.00;
		return price;
	}
	else if(foodName == "Juice") {
		price= 60.00;
		return price;
	}
	else {
	System.out.println();
	
	}
	return price;
	
}
}