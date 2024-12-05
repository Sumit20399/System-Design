package designs.bookmyshow;

public class Movie {
    private String movieId;
    private String title;
    private String genre;
    private int duration; // in minutes

    public Movie(String movieId, String title, String genre, int duration) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getMovieId() {
        return movieId;
    }
}

