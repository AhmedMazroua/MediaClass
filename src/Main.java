import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Director filmDirector = new Director("N/A");

        ArrayList casted2 = new ArrayList<>();
        casted2.add("Atreyu");
        casted2.add("Bastian");

        ArrayList casted1 = new ArrayList<>();
        casted1.add("Chucky");
        casted1.add("Extra");

    Media film = new Media("Never Ending Story","PG",filmDirector, casted2);
    Movie film2 = new Movie("Chucky",
            "R",
            filmDirector, casted1, 2,
            "scary movie",
            43.500);


        Director director2 = new Director("N/A");
        ArrayList casted= new ArrayList<>();
        casted.add("Zuko");
        casted.add("Aang");

        TvShow tvShow = new TvShow("Avatar The Last Airbender", "tv-13", director2, casted, 5, 90);

        System.out.println("Movie Title: " + film2.getTitle());
        System.out.println("Movie Director: " + film2.getDirector().getName());

        System.out.println("\nMovie Rating: " + film.getRating());
        System.out.println("Movie Grossing: $" + film.getCast());

        System.out.println("\nTV Show Title: " + tvShow.getTitle());
        System.out.println("TV Show Director: " + tvShow.getDirector().getName());
        System.out.println("TV Show Seasons: " + tvShow.getSeasons());
        System.out.println("TV Show Episodes: " + tvShow.getEpisodes() +"+" );


    }


}