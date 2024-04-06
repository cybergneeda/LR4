public class Demo {
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        Apple apple=new Apple();       
        GenericBox<Apple> appleBox=new GenericBox<>(apple,12);
        System.out.println(appleBox);    
        Persimmon persimmon=new Persimmon();
        GenericBox<Persimmon> persimmonBox=new GenericBox<>(persimmon,20);
        System.out.println(persimmonBox);
        appleBox.compareTo(persimmonBox);
        persimmonBox.transferFruits(7, appleBox);
        appleBox.compareTo(persimmonBox);
    }
}
