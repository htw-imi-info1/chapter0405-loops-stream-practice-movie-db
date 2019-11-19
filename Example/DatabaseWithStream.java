
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.function.Predicate;
public class DatabaseWithStream
{
    ArrayList<Movie> collection = new ArrayList<>();

    public DatabaseWithStream(){
        generateSomeTestData();
    }

    /**
     * you can just use this method.
     */
    public void printAll(){
        System.out.println(collection.stream()
            .map(e -> e.toString())
            .collect(Collectors.joining("\n")));
    }

    // Ex 13) Print all Movies with a number using a for loop.
    public void printAllWithNumbers(){

    }

    private void generateSomeTestData(){
        // if you have a constructor accepting all your 
        // fields, it's easy to create the test data
        // in one row like this:
        collection.add(new Movie(1972,"The Godfather","Francis Ford Coppola"));
        collection.add(new Movie(2001,"Lord of the rings","Peter Jackson"));
        collection.add(new Movie(2012,"Avengers","Joss Whedon"));
        collection.add(new Movie(2019,"Film without director","",90));
        collection.add(new Movie(2019,"Another Film in 2019","",55));
        collection.add(new Movie(2019,"Third Film in 2019","",80));
        collection.add(new Movie(1999,"The Matrix","Lana Wachowski"));
        collection.add(new Movie(1994,"Pulp Fiction","Quentin Tarantino",80));
        collection.add(new Movie(1995,"Pulp Fiction II","Quentin Tarantino",80));
    }

    public void printWatchedInYear(int year){
        collection.stream()
        .filter(movie -> movie.getReleaseYear() == year)
        .forEach(movie -> System.out.println(movie.toString()));
    }

    public String getWatchedInYear(int year){
        return collection.stream()
        .filter(movie -> movie.getReleaseYear() == year)
        .map(movie -> movie.toString())
        .collect(Collectors.joining("\n"));
    }

    public void removeWatchedInYear(int year){
        // see last slide chapter 5
        // Removal from a Collection Using a Predicate Lambda
        collection
        .removeIf(movie -> movie.getReleaseYear() == year);
    }

    public void demo1(){
        System.out.println(getWatchedInYear(1950));
    }

    /*
    Ex 15) how long would it take to watch all movies
    - in a given year
    - from a certain director
     */
    public int getDurationForYear(int year){
        return getDurationForFilter(movie -> movie.getReleaseYear() == year);
    }

    public int getDurationForDirector(String director){
        return getDurationForFilter(movie -> director.equals(movie.getDirector()));
    }

    public int getDurationForFilter(Predicate<Movie> filter){
        return collection.stream()
        .filter(filter)
        .map(movie -> movie.getDuration())
        .reduce(0, (sum, duration) -> sum + duration);
    }
}
