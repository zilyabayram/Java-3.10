package ru.netology.posters;

public class MovieManager {

    private MoviesToWatch[] movies = new MoviesToWatch[0];
    int resultLength;
    int limit;

    public MovieManager () {
        limit = 10;
    }

    public MovieManager (int limit) {
        limit = limit;
    }


    public void add(MoviesToWatch newMovie) {

        MoviesToWatch[] tmp = new MoviesToWatch[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public MoviesToWatch[] findAll() {
        return movies;
    }

    public MoviesToWatch[] findLast() {
        if (movies.length > limit ) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        MoviesToWatch[] tmp = new MoviesToWatch[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}
