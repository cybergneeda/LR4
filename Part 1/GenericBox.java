import java.util.Objects;

public class GenericBox<T extends Fruit> {
    private T fruit;
    private int number;
    
    public GenericBox(T fruit, int number) {
        this.fruit = fruit;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }
    public double calculateWeight()
    {
        return this.number*fruit.getWeight();
    }

    public void transferFruits(int number,GenericBox<?> box)
    {
        if (this.getFruit().getId()==box.getFruit().getId())
        {
            System.out.println("Нельзя перенести фрукты в ту же самую коробку");
        }
        else
        {
        if (number>this.number)
    {
        number=this.number;
    }
    this.number-=number;
    box.number+=number;
    if(this.getFruit().getId()==0)
    {
        System.out.println("Перенесли "+ number+ " фруктов во вторую коробку");
    }
    else
    {
        System.out.println("Перенесли "+ number+ " фруктов в первую коробку");
    }
    }
    }
    public void compareTo(GenericBox<?> o) {
        if (this.calculateWeight()-o.calculateWeight()>0)
        {
            System.out.println("Первая коробка тяжелее");
        }
        else if (this.calculateWeight()-o.calculateWeight()<0)
        {
            System.out.println("Вторая коробка тяжелее");
        }
        else
        {
            System.out.println("Коробки весят одинаково");
        }
        
    }

    @Override
    public int hashCode() {
       
        return Objects.hash(fruit,number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GenericBox<?> other = (GenericBox<?>) obj;
        if (fruit == null) {
            if (other.fruit != null)
                return false;
        } else if (!fruit.equals(other.fruit))
            return false;
        if (number != other.number)
            return false;
        return true;
    }

    @Override
    public String toString() {    
            return "В первой коробке лежит " + number + this.fruit;
        
    }

}
