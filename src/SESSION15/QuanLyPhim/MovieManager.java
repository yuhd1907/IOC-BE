package SESSION15.QuanLyPhim;

import java.util.ArrayList;
import java.util.List;

public class MovieManager<T extends  Movie> {
    private ArrayList<T> movies = new ArrayList<>();;

    public void addMovie(T movie) {
        movies.add(movie);
    }

    public boolean deleteMovie(int id) {
        return movies.removeIf(movie -> movie.getId() == id);
    }

    public T findById(int id) {
        for (T movie : movies) {
            if (movie.getId() == id) return movie;
        }
        return null;
    }

    public List<T> findByTitle(String keyword) {
        List<T> result = new ArrayList<>();
        for (T movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public List<T> filterByRating(double minRating) {
        List<T> result = new ArrayList<>();
        for (T movie : movies) {
            if (movie.getRating() > minRating) {
                result.add(movie);
            }
        }
        return result;
    }

    public List<T> getAll() {
        return movies;
    }
}
