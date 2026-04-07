public class Sheep implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String name;
    
    public Sheep() {
        this.legs = 4;
        this.sound = "Baa Baa";
        this.food = "Grass";
        this.name = "Default Sheep";
    }
    
    private Sheep(Sheep source) {
        this.legs = source.legs;
        this.sound = source.sound;
        this.food = source.food;
        this.name = source.name;
    }
    
    @Override
    public Animal clone() {
        return new Sheep(this);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }
    
    @Override
    public String getType() {
        return "Sheep";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSound() {
        return sound;
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
}