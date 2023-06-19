package javaDz;
import static java.util.Collections.max;
import static java.util.Collections.min;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;

public class Seminar3 {
   public static void main(String[] args) {
            Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>(100);
        for (int i = 0; i < 100; i++) {
            int value = rnd.nextInt(-100, 100);
            list1.add(value);
        }
       
        Iterator <Integer> iterator = list1.iterator();
        while(iterator.hasNext()) {
            int number = iterator.next();
            if(number % 2 == 0){
                iterator.remove();
            }
        }
    
        System.out.println(list1);

        int sum = 0;
        for (int item : list1) {
            sum += item;
        }
        System.out.printf("Максимальный элемент: %s\n", max(list1));
        System.out.printf("Минимальный элемент: %s\n", min(list1));
        System.out.printf("Среднее арифметическое: %s\n", (float)sum/list1.size());
   }
}
