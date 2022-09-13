package ru.netology.posters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    private MovieManager manager = new MovieManager();
    MoviesToWatch movie1 = new MoviesToWatch(11, "Бладшот");
    MoviesToWatch movie2 = new MoviesToWatch(22, "Вперед");
    MoviesToWatch movie3 = new MoviesToWatch(33, "Отель Белград");
    MoviesToWatch movie4 = new MoviesToWatch(44, "Джентельмены");
    MoviesToWatch movie5 = new MoviesToWatch(55, "Человек-неведимка");
    MoviesToWatch movie6 = new MoviesToWatch(66, "Тролли.");
    MoviesToWatch movie7 = new MoviesToWatch(77, "Номер один");
    MoviesToWatch movie8 = new MoviesToWatch(88, "Титаник");
    MoviesToWatch movie9 = new MoviesToWatch(99, "Начало");
    MoviesToWatch movie10 = new MoviesToWatch(110, "Крик");
    MoviesToWatch movie11 = new MoviesToWatch(111, "Крик2");

    @BeforeEach
    public void setup() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
    }

    @Test
    public void showLast10() {

        MoviesToWatch[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MoviesToWatch[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastIfMoviesLessThan10() {

        MoviesToWatch[] expected = { movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        MoviesToWatch[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastIfMoviesMoreThan10() {

        MoviesToWatch[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        MoviesToWatch[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
