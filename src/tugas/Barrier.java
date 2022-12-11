package tugas;

public class Barrier implements Destroyable {
    protected int strength;
  
    public Barrier(int strength) {
      this.strength = strength;
    }
  
    public void setStrength(int strength) {
      this.strength = strength;
    }
  
    public int getStrength() {
      return this.strength;
    }
  
    @Override
    public void destroyed() {
        double minStrength = 0.1 * strength ;
        strength -= minStrength;
    }
  
    public String getBarrierInfo() {
      return "Barrier Strength = " + strength + "\n";
    }
}
