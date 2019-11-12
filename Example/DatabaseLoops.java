
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
public class DatabaseLoops
{
    ArrayList<Movie> collection = new ArrayList<>();

    public DatabaseLoops(){
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
        collection.add(new Movie(1951));
        collection.add(new Movie(1950));
        collection.add(new Movie(1951));
        collection.add(new Movie(1952));
    }

    public void printWatchedInYear(int year){
        for (Movie movie: collection){
            if (movie.getReleaseYear() == year)
                System.out.println(movie.toString());
        }
    }

    public String getWatchedInYear(int year){
        String result ="";
        for (Movie movie: collection){
            if (movie.getReleaseYear() == year)
                result = movie.toString()+"\n";
        }
        return result;
    }

    public void removeWatchedInYear(int year){    
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
