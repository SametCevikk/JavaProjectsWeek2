package movieList;

public class Movie {

    private String movieName;
    private int yearOfPublication;
    private String movieType;
    private double ImdbScore;


    public Movie(){

    }

    public Movie(String movieName, int yearOfPublication, String movieType, double imdbScore) {
        this.movieName = movieName;
        this.yearOfPublication = yearOfPublication;
        this.movieType = movieType;
        this.ImdbScore = imdbScore;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public double getImdbScore() {
        return ImdbScore;
    }

    public void setImdbScore(double imdbScore) {
        ImdbScore = imdbScore;
    }


}
