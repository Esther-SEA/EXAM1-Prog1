import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private ArrayList<Bird> zooBird;
    
    public Zoo(){
        zooBird = new ArrayList<Bird>();
        zooBird.add(new Bird("blue", "parrot", 2));
        zooBird.add(new Bird("blue", "parrot", 2));
        zooBird.add(new Bird("blue", "parrot", 2));
        zooBird.add(new Bird("blue", "parrot", 2));
    }
    
    public int countBlueBirdsZoo(){
        int i = 0;
            for (Bird bird: zooBird){
                if (bird.color().equals("blue")){
                        i++;
                }
            }
            return i;
        }
}
