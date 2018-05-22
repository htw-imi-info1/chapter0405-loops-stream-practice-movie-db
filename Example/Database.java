
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
// rename accordingly, eg. MermaidDatabase
public class Database
{
    // you need to adapt the type parameter (Movie)!
    ArrayList<Movie> collection = new ArrayList<>();

    public Database(){
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
        collection.add(new Movie(1950));
        collection.add(new Movie(1951));
        collection.add(new Movie(1950));
        collection.add(new Movie(1951));
        collection.add(new Movie(1952));
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

    public void printWatchedInYearLoop(int year){
        for (Movie movie: collection){
            if (movie.getReleaseYear() == year)
                System.out.println(movie.toString());
        }
    }

    public String getWatchedInYearLoop(int year){
        String result ="";
        for (Movie movie: collection){
            if (movie.getReleaseYear() == year)
                result = movie.toString()+"\n";
        }
        return result;
    }

    public void removeWatchedInYear(int year){
        // see last slide chapter 5
        // Removal from a Collection Using a Predicate Lambda
        collection
        .removeIf(movie -> movie.getReleaseYear() == year);
    }

    public void removeWatchedInYearLoop(int year){    
        Iterator<Movie> it = collection.iterator();
        while (it.hasNext()){
            Movie m = it.next();
            if(m.getReleaseYear() == year)
                it.remove();         
        }
    }

    public void demo1(){
        System.out.println(getWatchedInYear(1950));
    }

}
