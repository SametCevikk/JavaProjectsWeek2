package movieList;

import java.util.*;

public class MovieList {
    public static void main(String[] args) {


        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("The Dark Knight", 2008, "action", 9.0));
        movieList.add(new Movie("The Shawshank Redemption", 1995, "drama", 9.5));
        movieList.add(new Movie("The Godfather", 1972, "crime", 9.2));
        movieList.add(new Movie("The Fight Club", 1999, "drama", 8.8));
        movieList.add(new Movie("The Lord of the Rings: The Return of the King"
                ,2003,"adventure",9.0));

        //Sorted from largest to smallest by IMDb score
        movieList.sort(Comparator.comparing(Movie::getImdbScore).reversed());
        System.out.println("Top IMDB");
        for(Movie movie:movieList){
            System.out.println(movie.getMovieName() + "  " + movie.getImdbScore());
        }
        System.out.println("------------------------------------------------------------------");
        //Sorted from smallest to largest by publication year
        movieList.sort(Comparator.comparing(Movie::getYearOfPublication));
        System.out.println("Top Youngest");
        for(Movie movie : movieList){
            System.out.println(movie.getMovieName() + "  " + movie.getYearOfPublication());
        }
        System.out.println("------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter movie type  ");
        String movieType=scanner.nextLine();
        filterMovie(movieType.toLowerCase(),movieList);



    }

    private static void filterMovie(String movieType,List<Movie> movieList){

        for(Movie movie:movieList){
            if(movie.getMovieType().equals(movieType)){
                System.out.println(movie.getMovieName());
            }
        }
    }
}
