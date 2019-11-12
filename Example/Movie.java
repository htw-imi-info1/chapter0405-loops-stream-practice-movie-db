
public class Movie
{
    private int releaseYear = 0;

    public Movie(int releaseYear){
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear(){return releaseYear;}

    public String toString(){
        return "I'm an Movie object and my fields are: ...."+releaseYear; 
    }
}
