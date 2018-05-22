// rename to your class name
public class Movie
{
    // add fields...
    //e.g. 
    private int releaseYear = 0;

    // add Constructor. You can set the fields with 
    public Movie(int releaseYear){
        this.releaseYear = releaseYear;
    }
    // add getters, eg.
    public int getReleaseYear(){return releaseYear;}

    // add a to String method for printing / generating a string
    public String toString(){
        return "I'm an Movie object and my fields are: ...."+releaseYear; 
    }
}
