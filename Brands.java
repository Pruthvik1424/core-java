public class Brands
{
 public static void main(String[]args)
  {
	  
   // Literals  
	  
   String brandName = "Nike"; 
   System.out.println(brandName);
   
   String brandProduct = "Shoes";
   System.out.println(brandProduct);

   String nameOfProduct = "Shoes";
   System.out.println(nameOfProduct);
   
   String mobileNum = "xxxxxxxxxx";
   mobileNum = "yyyyyyyyyy";                                     // re_assigning
   System.out.println(mobileNum);
   
   String month = "october";
   month = "december";
   System.out.println(month);
   
   String busType = "KSRTC";
   busType = "BMTC";
   System.out.println(busType);
   
   String city = "Mysore";
   city = "Banglore";
   System.out.println(city);
   
   String collegeName = "PES college of engineering";
   collegeName = "Govt college of engineering";
   System.out.println(collegeName);
   
   String season = "winter";
   season = "summer";
   System.out.println(season);
   
   String classMode = "Online";
   classMode = "Offline";
   System.out.println(classMode);
   
   String age = "fifty";
   age = "sixty";
   System.out.println(age);
   
   String software = "android";
   software = "IOS";
   System.out.println(software);
   
   
   
   //using new keyword
   
   String languageKnown = new String("kannada"); 
   season = "english";                           // re_assigning
   System.out.println(languageKnown);
   
   String foodType = new String("veg");
   foodType = "non veg";
   System.out.println(foodType);
   
   String vehicleType = new String("twoWheeler");
   vehicleType = "four wheeler";
   System.out.println(vehicleType);
   
   String location = new String("BTM");
   location = "rajajinagar";
   System.out.println(location);
   
   String state  = new String("tamilnadu");
   state = "karnataka";
   System.out.println(state);
   
   String nation = new String("pakistan");
   nation = "india";
   System.out.println(nation);
   
   String language = new String("hindi");
   
   String weatherCondition = new String("Winter");
   weatherCondition = "Summer";
   System.out.println(weatherCondition);
   
   String college = new String("PES college of engineering");
   System.out.println(college);
   
   String ageOfPerson= new String("sixty");
   System.out.println(ageOfPerson);
   

  
   
                                                                  // Comparision
   
   System.out.println(brandProduct== nameOfProduct);
   
   System.out.println(languageKnown==language);
   
   System.out.println(collegeName==college);
   
   System.out.println(season==weatherCondition);
   
   System.out.println(age==ageOfPerson);
   }
}