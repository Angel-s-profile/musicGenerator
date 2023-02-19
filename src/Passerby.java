class Passerby extends Protester {

    String support;
  
    public Passerby (String name, String support){
      super(name);
      this.support = support;
    }
  
    @Override
    public void walk(){
      System.out.println(this.name + " nodded during the protest with " + this.support + " support.");
    }
  
  }