
public class Movie
{
    private int releaseYear = 0;
    private String title; 
    
    // Ex 5) add a director field to movie
    // note that director can be null as there is a constructor not 
    // setting it. This is a different design decision from the one we
    // made for the field title
    private String director;

    public Movie(int releaseYear, String title){
        this.releaseYear = releaseYear;
        this.title = title;
    }

    public Movie(int releaseYear, String title, String director){
        this(releaseYear, title);
        this.director = director;
    }

    public int getReleaseYear(){return releaseYear;}

    public String getTitle(){
        return title;
    }

    public String toString(){
        return ""+title+", released in: "+releaseYear+" director: "+director; 
    }

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
}
