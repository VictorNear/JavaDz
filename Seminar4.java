package javaDz;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
// 1. Организовать ввод и хранение данных пользователей. 
// ФИО возраст и пол
// 2. вывод в формате Фамилия И.О. возраст пол
// 3. добавить возможность выхода или вывода списка отсортированного по возрасту!)
// *реализовать сортировку по возрасту с использованием индексов
// *реализовать сортировку по возрасту и полу с использованием индексов
public class Seminar4 {
   public static void main(String[] args) {
 
      Scanner iScanner = new Scanner(System.in);
      ArrayList<String> people = new ArrayList<>();
      System.out.println("How many people?");
      int n = Integer.parseInt(iScanner.nextLine());
      for (int i = 0; i < n; i++) {
         System.out.print("family, name, surname: ");
         String name = iScanner.nextLine();
         System.out.println("age, gender: ");
         String age = iScanner.nextLine();
         people.add(name + " " + age);
      }
      // вывод в формате Иванов И. И. 27 м
      for (int i = 0; i < people.size(); i++) {
         String[] array = people.get(i).split(" ");
         System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
               + array[2].toUpperCase().charAt(0) + ". " + array[3] + " " + array[4]);
      }
      // 3. добавить возможность выхода или вывода списка отсортированного
      // по возрасту!)
      System.out.print("Введите действие(quit - выход, sort - сортировка): ");
      String num = iScanner.nextLine();
      switch (num) {
         case "quit":
            break;
         case "sort":
            people.sort(new Comparator<String>() {
               @Override
               public int compare(String o1, String o2) {
                  return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
               }
            });
            for (int i = 0; i < people.size(); i++) {
               String[] array = people.get(i).split(" ");
               System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
                     + array[2].toUpperCase().charAt(0) + ". " + array[3] + " " + array[4]);
            }
            iScanner.close();
      }
   }
}
   

