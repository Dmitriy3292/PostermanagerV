package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.netology.domain.Film;

@AllArgsConstructor


public class AfishaManager {

    private Film[] films = new Film[0];
    private int countMovies = 10;

    public AfishaManager() {
    }

    public AfishaManager(Film[] films) {
        this.films = films;
    }

    public AfishaManager(int Film) {
    }


    public void add(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] getLastFilms() {
        int resultlenght;
        if (films.length > countMovies) {
            resultlenght = countMovies;
        } else {
            resultlenght = films.length;
        }
        Film[] result = new Film[resultlenght];
        for (int i = 0; i < resultlenght; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}




