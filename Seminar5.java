// Реализуйте структуру телефонной книги с помощью HashMap.Программа 
// также должна учитывать, что во входной структуре будут повторяющиеся 
// имена с разными телефонами, их необходимо считать, как одного человека 
// с разными телефонами. Вывод должен быть отсортирован по убыванию 
// числа телефонов.
package javaDz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Collections;

public class Seminar5 {
   public static void main(String[] args) {

      HashMap<String, String> phoneBook = new HashMap<>();
      // addContact(phoneBook, "Petrov V.", "1 32 4545554");
      // addContact(phoneBook, "Petrov V.", "1 367 4545554");
      // addContact(phoneBook, "Petrov V.", "45 455 54");
      // addContact(phoneBook, "Ivanov O.", "23 454 55 54");
      // addContact(phoneBook, "Ivanov O.", "132 45 455");
      // addContact(phoneBook, "Stepanov P.", "32 45 55 54");
      // addContact(phoneBook, "Stepanova E.", "32 45 55 54");
      // addContact(phoneBook, "Sidorov S.", "1 32 4545554");

      phoneBook.merge("Petrov V.", "13245455", (o, n) -> o == null ? n : o + " " + n);
      phoneBook.merge("Petrov V.", "136745455", (o, n) -> o == null ? n : o + " " + n);
      phoneBook.merge("Petrov V.", "454555", (o, n) -> o == null ? n : o + " " + n);
      phoneBook.merge("Ivanov O.", "23454555", (o, n) -> o == null ? n : o + " " + n);
      phoneBook.merge("Ivanov O.", "13245455", (o, n) -> o == null ? n : o + " " + n);
      phoneBook.merge("Stepanov P.", "3245555", (o, n) -> o == null ? n : o + " " + n);
      phoneBook.merge("Stepanova E.", "3245555", (o, n) -> o == null ? n : o + " " + n);
      phoneBook.merge("Sidorov S.", "132454555", (o, n) -> o == null ? n : o + " " + n);

      ArrayList<String> phoneList = new ArrayList<>();
      for (String s : phoneBook.keySet()) {
         phoneList.add(s);
      }

      // Collection.sort(phoneList, (o1, o2) -> phoneBook.get(o1).size() -
      // phoneBook.get(o2).size());
      
      Collections.sort(phoneList, (o1, o2) -> phoneBook.get(o1).split(" ").length - phoneBook.get(o2).split(" ").length);
      System.out.println(phoneBook);
      
      // phoneList.forEach(n -> System.out.println(n + "=" + phoneBook.get(n).size()));
      
      phoneList.forEach(n -> System.out.println(n + " = " + phoneBook.get(n).split(" ").length));
      
   }

   // private static void addContact(HashMap<String, ArrayList<String>> phoneBook,
   // String name, String phone) {
   // phoneBook.putIfAbsent(name, new ArrayList<>());
   // phoneBook.get(name).add(phone);
   // }

}