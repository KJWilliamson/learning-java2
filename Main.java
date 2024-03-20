class IfElseIf {
    public static void main(String[] args) {
    
    // You got a 
      int grade = 85;
      if(grade > 95) {
        System.out.println("You got an A");
      }
      else if(grade >= 85) {
        System.out.println("You got a B");
      }
      else if(grade >= 75) {
        System.out.println("You got a C");
      }
      else if(grade >= 65) {
        System.out.println("You got a D");
      }
      else if(grade <= 64) {
        System.out.println("You got a F");  
      }
      
      
      // Temperature is
      float ftemperature = 88.0f;
      if(ftemperature > 0) 
        // Note that the line below is indented further even without 
        // curly brackets.
        System.out.println("Temperature is positive.");
    
      
    
      
      // Temperature is
      int temperature = -1;
      if(temperature > 0) {
        System.out.println("Temperature is positive.");
      }
      else if(temperature == 0) {
        System.out.println("Temperature is 0.");
      }
      else {
        System.out.println("Temperature is negative.");
        
      }
      
      
      
      // true or false
      int number = 5;
      // == will return true or false
      System.out.println(number == 1);
      
      
      // true or false
      int fnumber = 8;
      System.out.println(fnumber != 8);
    
    
       
      
    }
  } 

  