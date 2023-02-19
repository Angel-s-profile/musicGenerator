class Protester extends Person {

    String name;
  
    public Protester(String name){
      this.name = name;
    }
  
  
    @Override
    public void walk(){
      System.out.println(this.name + " protested Spotify in 2022 due to pay cuts.");
    }
  
  
  }