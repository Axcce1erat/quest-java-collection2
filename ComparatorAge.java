import java.util.Comparator;

public class ComparatorAge implements Comparator<Hero>{

   public int compare(Hero heroOne, Hero heroTwo) {

       if (heroOne.getAge() == heroTwo.getAge()){
           return 0;
       }
       else if (heroOne.getAge() > heroTwo.getAge()){
           return -1;
       }
       else{
           return 1;
       }
    }
}
