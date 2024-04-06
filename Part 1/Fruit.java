public abstract class Fruit {
    private static int i=0;
    private int id;
    public abstract double getWeight();
    public Fruit()
    {
        id=i;
        i+=1;
    }
    public int getId() {
        return id;
    }
    
}