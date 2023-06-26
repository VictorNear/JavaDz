package javaDz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Object;

public class Seminar6 {
   public static void main(String[] args) {
      // создать класс,изображающий хешсет для хранения
      // стрингов(хешсет не использовать)
      Set<Integer> set1 = new Set();

      System.out.println(set1.add(555));
      System.out.println(set1.add(555));
      System.out.println(set1.remove(123));
      System.out.println(set1.size());
      System.out.println(set1.isEmpty());

      // Iterator<Integer> it = set1.iterator();
      // while (it.hasNext()) {
      //    System.out.println(it.next());

      }
   }

   class Set<E> {
      private HashMap<E, Object> set = new HashMap<>();
      private static final Object VALL = new Object();

      public boolean add(E tel) {

         return set.put(tel, VALL) == null;
      }

      // проверка удалили или нет данные
      public boolean remove(E tel) {
         return set.remove(tel) == VALL;
      }

      //
      public int size() {
         return set.size();
      }

      //
      public boolean isEmpty() {
         return set.isEmpty();
      }

      // как из сетов достать данные
      // public Iterator<E> iterator() {
      //    return set.keySet().iterator();
      // }

   // }
}

