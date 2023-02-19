class Ruling {

    private double royalty;
    private String date;
  
    public Ruling(double royalty, String date) {
      this.royalty = royalty;
      this.date = date;
    }
      
      public double getRoyalty() {
          return royalty;
      }
      public void setRoyalty(double royalty) {
          this.royalty = royalty;
    }
  
    @Override
    public String toString() {
      return "Ruling date: " + this.date + ". Royalty % increase: " + this.royalty;
    }
    
  }