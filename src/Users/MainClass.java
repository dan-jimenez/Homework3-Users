package Users;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainClass {


    public static void main(String[] args) {
        Calendar bornDate = new GregorianCalendar(2002,Calendar.AUGUST, 21);

        User myData = new User("Danny Jiménez", "dJimenez", "djimenez02");
        User friendData = new User("Leticia Calderón","lCalderon","lcalderon27");

        myData.setState(States.UNACTIVE);
        myData.setAge(bornDate);
        myData.setPhone("8408-5460");
        myData.setEmail("dannyjimenez118@gmail.com");
        System.out.print(myData);


        friendData.setState(States.SUSPENDED);
        friendData.setAge(27, 8, 1997);
        friendData.setPhone("8888-8l88");
        friendData.setEmail("2l@eti@gmail.net");
        System.out.println(friendData);




    }
}
