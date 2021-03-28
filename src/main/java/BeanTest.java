import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;
import java.util.List;


public class BeanTest {

    public static void main(String[] args) {

        Album myAlbum = new Album(1,"Billy Idle", "White Wedding", 1985, 28.7f,"rock and new wave");

        Author someone = new Author();
        someone.setFirstName("Charles");
        someone.setLastName("Xavier");

        Quote quote1 = new Quote(1,"I believe that true focus lies somewhere between rage and serenity",someone);

        Quote aQuote = new Quote(1, "Life is about the journey, not the destination", new Author(1,"Bruce", "Lee"));

        Quote anotherQuote = new Quote(1, "Time takes everybody out. Time is undefeated", new Author(1, "Rocky", "Balboa"));

        List<Quote> quotes = new ArrayList<>();

        quotes.add(quote1);
        quotes.add(aQuote);
        quotes.add(anotherQuote);

        for (Quote quote : quotes)
        {
            System.out.println(quote.getContent());
            System.out.println("~ " + quote.getAuthor().getFirstName() + ", " + quote.getAuthor().getLastName() + "\n");
        }




    }
}
