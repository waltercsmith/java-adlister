import models.Album;
import models.Author;
import models.Quote;


public class BeanTest {

    public static void main(String[] args) {

        Album myAlbum = new Album(1,"Billy Idle", "White Wedding", 1985, 28.7f,"rock and new wave");

        Author someone = new Author();
        someone.setFirstName("Dean");
        someone.setLastName("Koontz");

        Quote quote = new Quote(1,"Be as water my friend",someone);





    }
}
