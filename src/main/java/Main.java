import javafx.scene.shape.Path;

import java.lang.annotation.Annotation;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Sergey
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Одомашненность");

        Domesticated path = Dog.class.getAnnotation(Domesticated.class);

        Calendar calendar = new GregorianCalendar();
        calendar.set(2019, Calendar.JANUARY, 22);
        int date =calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("До конца недели осталось="+ (8-date));


        System.out.println(path);
        String breedCatFirst = "Домашний";
        String nameCatFirst = "Борис";
        String breedCatSecond = "Домашний";
        String nameCatSecond = "Борис";

        Cat catHome = new Cat(breedCatFirst, nameCatFirst);
        Cat catPers = new Cat(breedCatSecond, nameCatSecond);
        String firstCat = catHome.toString(breedCatFirst, nameCatFirst);
        System.out.println(firstCat);
        catHome.talk(breedCatFirst, nameCatFirst);
        String secondCat = catPers.toString(breedCatSecond, nameCatSecond);
        System.out.println(secondCat);
        if (catHome.equals(catPers) && catHome.hashCode() == catHome.hashCode()) {
            System.out.println("Один и тот же кот");
        } else {
            System.out.println("Разные коты");
            catHome.talk(breedCatSecond, nameCatSecond);


        }

        System.out.println(Condition.AWAKEN);
        System.out.println(Condition.DEAD);
        System.out.println(Condition.SLEEPING);
        System.out.println(Condition.AWAKEN.getSleeping());
        System.out.println(Condition.DEAD.isLive()); //жив?
    }
}
