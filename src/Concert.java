class Concert extends Facts {

    @Override
    void fyi(){
      System.out.println("Across the board Americans are paying more for event tickets.  ");
    }
  
  
  
  //Top of Concert.java
    
   
      public String event(){
        return "Inflation caused concert ticket prices to increase.";
      }
  
      //overloading
      public String event(int increase){
        return "Fun fact: Concert tickets cost " + increase + "% more now than before the pandemic in 2019.";
      }
  
       public String event(int increase, String fyi){
        return "Global concert magazine Pollstar found that tickets in 1996 costed $" + increase + " to see the likes of KISS and " + fyi;
      }
  
       public String event(int increase, String fyi, int cost){
        return "Now it would cost an average of $" + increase + " to attend " + fyi + "today's top " + cost + " biggest concerts.";
      }
  
    }