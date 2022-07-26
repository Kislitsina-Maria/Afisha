public class FilmsManager {

    PurchaseFilm[] films = new PurchaseFilm[0];


    public void addFilms(PurchaseFilm film) {
        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }


    private int countLastFilms = 10;

    public FilmsManager(int countLastFilms) {
        this.countLastFilms = countLastFilms;
    }

    public FilmsManager() {
    }

    public void findLast() {
        PurchaseFilm[] tmp = new PurchaseFilm[countLastFilms];
        for (int i = 0; i < countLastFilms; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        films = tmp;
    }


    public PurchaseFilm[] findAll() {
        return films;
    }
}
