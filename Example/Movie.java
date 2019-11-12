
public class Movie
{
    private int releaseYear = 0;
    private String title; 

    public Movie(int releaseYear){
        this.releaseYear = releaseYear;
    }

    public Movie(int releaseYear, String title){
        this(releaseYear);
        this.title = title;
    }

    public int getReleaseYear(){return releaseYear;}

    public String getTitle(){
        return title;
    }

    public String toString(){
        return "I'm an Movie object and my fields are: ...."+releaseYear; 
    }
}
