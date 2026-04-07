public class Horse implements Animal {
    private Integer legs;
    private String sound;
    private String food;
    private String color;
    
    public Horse() {
        this.legs = 4;
        this.sound = "Neigh Neigh";
        this.food = "Hay";
        this.color = "Default Color";
    }
    
    private Horse(Horse source) {
        this.legs = source.legs;
        this.sound = source.sound;
        this.food = source.food;
        this.color = source.color;
    }
    
    @Override
    public Animal clone() {
        return new Horse(this);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Horse says: " + sound);
    }
    
    @Override
    public String getType() {
        return "Horse";
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getSound() {
        return sound;
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
}