import java.util.*;

class Defendant {

  private String name;
  private String damages;

    private ArrayList<Ruling> decision = new ArrayList<>();
  
 public Defendant(String name, ArrayList<Ruling> decision) {
    this.name = name;
    this.decision = decision;
  }

  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
  }
  public String getDamages() {
		return damages;
	}
  	public void setDamages(String damages) {
		this.damages = damages;
  }

  public void addRuling(Ruling ruling) {
    decision.add(ruling);
  }

   @Override
  public String toString() {
    return "[Defendant's name = " + name + ", Defendant's responsibility = " + damages + "]";
  }

   public void printDecision() {
     
    double total = 0;
     
    for (Ruling currentRuling: decision) {
     System.out.println(currentRuling);
     total  = currentRuling.getRoyalty()  + total;
    }

        
     
  }
  
}