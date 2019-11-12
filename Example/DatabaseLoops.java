
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
        for (Movie movie: collection){
            System.out.println(movie);
        }
    }

    private void generateSomeTestData(){
        // if you have a constructor accepting all your 
        // fields, it's easy to create the test data
        // in one row like this:
        collection.add(new Movie(1972,"The Godfather","Francis Ford Coppola"));
        collection.add(new Movie(2001,"Lord of the rings","Peter Jackson"));
        collection.add(new Movie(2012,"Avengers","Joss Whedon"));
        collection.add(new Movie(2019,"Film without director"));
        collection.add(new Movie(1999,"The Matrix","Lana Wachowski"));
        collection.add(new Movie(1994,"Pulp Fiction","Quentin Tarantino"));
    }
    // Ex 3) print all movies with titles containing a searchString
    public void printAllContainingTitle(String searchString){
        for(Movie movie: collection){
            if (movie.getTitle().contains(searchString)){
                System.out.println(movie);
            }
        }
    }
    // Ex 4) delete all movies with an exact given title
    public void deleteWithTitle(String searchString){
        Iterator<Movie> iterator = collection.iterator();

        while(iterator.hasNext()){    
            Movie movie = iterator.next();
            if (searchString.equals(movie.getTitle())){
                iterator.remove();
            }
        }

    }
    // Ex 6) print all movies directed by a certain director
    // it just looks for a name containing the string
    // and checks for null
    public void printForDirector(String director){
        for (Movie movie: collection){
            if ((movie.getDirector() != null) && 
            movie.getDirector().contains(director))
                System.out.println(movie);
        }
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
