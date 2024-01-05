public class mechanicalEngineering{

       public static void main (String[] args){

         String str1 = "";              //for isEmpty()
        String str2 = "mechanical Engineering";

        boolean isEmptyStr1 = str1.isEmpty(); 
        boolean isEmptyStr2 = str2.isEmpty(); 

        System.out.println("Is str2 empty? " + isEmptyStr2); 
        System.out.println("---------------------------------");


        String strWithSpaces = "   mechacnical Engineering   ";        //for Trim()
        String strWithoutSpaces = strWithSpaces.trim();

        System.out.println("Original string with spaces: '" + strWithSpaces + "'");
        System.out.println("String after trim: '" + strWithoutSpaces + "'");
        System.out.println("--------------------------------------------------");
        
        String substring1 = str2.substring(10); // for subString ---> it will start from index 10 till end
        String substring2 = str2.substring(0, 10);  //  it will start from 0 and end at index 10

        
        System.out.println("Substring 1: " + substring1); 
        System.out.println("Substring 2: " + substring2); 
        System.out.println("---------------------------------------------");

        

        







    }
}
