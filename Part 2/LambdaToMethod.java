import java.util.Arrays;
import java.util.Random;
import java.util.function.Function;

public class LambdaToMethod {

    public static int arraySum(Integer[] array)
    {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    public double arrayAverage(Integer[] array)
    {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return (double)sum/array.length;
    }

    Function<Integer[],Integer> findMin = array ->
    {
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min)
            {
                min = array[i];
            }
        }
        return min;
    };

    public static <T> T lambdaMethod(Function<Integer[],T> function,Integer[] array)
    {
        return function.apply(array);
    }
    
    public static void main(String[] args)
    {   
        System.out.print("\033[H\033[2J");
        Integer[] array =new Integer[8];
        Random r= new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        System.out.println("Исходный массив: "+Arrays.toString(array));
        LambdaToMethod lambdaToMethod= new LambdaToMethod();
        System.out.println("Сумма элементов массива: "+ lambdaMethod(LambdaToMethod::arraySum ,array));
        System.out.println("Среднее значение элементов массива: "+lambdaMethod(lambdaToMethod::arrayAverage,array ));
        System.out.println("Наименьший элемент массива: "+lambdaMethod(lambdaToMethod.findMin,array));
    }
}