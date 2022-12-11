package tugas;

public class JumpingZombie extends Zombie {
    private Double healthDouble;
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
        healthDouble = Double.valueOf(health);
    }
  
    @Override
    public void heal() {
        Double plusHealth;
        if(level == 1){
            plusHealth = 0.3 * health;
            health += plusHealth;
        }
        else if(level == 2){
            plusHealth = 0.4 * health;
            health += plusHealth;
        }
        else if(level == 3){
            plusHealth = 0.5 * health;
            health += plusHealth;
        }
    }
  
    @Override
    public void destroyed() {
        double minHealth = 0.1 * healthDouble;
        healthDouble -= minHealth;
        health = (int) Math.round(healthDouble);
    }
  
    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \nHealth = " + health +"\nLevel = " + level + "\n";
    }
}  
