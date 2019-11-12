
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
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

    private void generateSomeTestData(){
        // if you have a constructor accepting all your 
        // fields, it's easy to create the test data
        // in one row like this:
        collection.add(new Movie(1950,"The Godfather"));
        collection.add(new Movie(1951,"Lord of the rings"));
        collection.add(new Movie(1950,"Avengers"));
        collection.add(new Movie(1951,"Matrix"));
        collection.add(new Movie(1952,"Pulp Fiction"));
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

}
