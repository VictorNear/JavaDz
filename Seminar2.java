// Дана строка sql-запроса "select * from students where ". Сформируйте часть 
// WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены 
// ниже в виде json-строки.Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Дополнительные задания
// Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":
// "4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки
//  вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
// *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
// *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.

package javaDz;

import java.lang.module.ModuleDescriptor.Builder;

public class Seminar2 {
   public static void main(String[] args) {
    
   String str1 = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
   String str2 = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}]";
   
   String[] res1 = str1
      .replaceAll("\\p{P}", "")
      .replace("=", "")
      .split(" ");

   StringBuilder res2 = new StringBuilder();
   String [] arrayData = str2
      .replace(":",",")
      .split(",");

      res2.append("Студент ");
      res2.append(arrayData[1]);
      res2.append(" получил ");
      res2.append(arrayData[3]);
      res2.append(" по предмету ");
      res2.append(arrayData[5]);
   
   String result = res2.toString();
   System.out.println(result.replaceAll("\\p{P}", ""));
      
   StringBuilder summ = new StringBuilder(".3 + 1.56 = ");
      summ.append(.3 + 1.56);
   System.out.println(summ);
   }
}
//Если я правильно понял задание то как то так.