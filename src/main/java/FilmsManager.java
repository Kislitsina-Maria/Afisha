public class FilmsManager {

    private FilmsRepository repo;

    public FilmsManager(FilmsRepository repo) {
        this.repo = repo;
    }

    private int countLastFilms = 10;

    public FilmsManager(FilmsRepository repo, int countLastFilms) {
        this.countLastFilms = countLastFilms;
        this.repo = repo;
    }

    public void addFilms(PurchaseFilm film) {
        repo.save(film);
    }


    public PurchaseFilm[] findLast() {
        PurchaseFilm[] all = repo.findAll();
        PurchaseFilm[] reverse = new PurchaseFilm[countLastFilms];
        for (int i = 0; i < countLastFilms; i++) {
            reverse[i] = all[all.length - 1 - i];
        }
        return reverse;
    }



}
