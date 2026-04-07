public class Cow implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    
    public Cow() {
        this.legs = 4;
        this.sound = "Moo Moo";
        this.food = "Grass";
    }
    
    private Cow(Cow source) {
        this.legs = source.legs;
        this.sound = source.sound;
        this.food = source.food;
    }
    
    @Override
    public Animal clone() {
        return new Cow(this);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }
    
    @Override
    public String getType() {
        return "Cow";
    }
    
    public String getSound() {
        return sound;
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
}