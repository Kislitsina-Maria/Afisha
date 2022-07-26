public class FilmsRepository {
    PurchaseFilm[] films = new PurchaseFilm[0];
    public FilmsRepository() {
    }

    public PurchaseFilm[] findAll() {
        return films;
    }

    public void save(PurchaseFilm film) {
        PurchaseFilm[] tmp = new PurchaseFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[films.length] = film;
        films = tmp;
    }

    public void findByID(int id) {
        PurchaseFilm[] tmp = new PurchaseFilm[1];
        for (PurchaseFilm film : films) {
            if (film.getId() == id) {
                tmp[0] = film;
                break;
            } else{
                tmp[0] = null;
            }
        }
        films = tmp;
    }

    public void removeById(int id) {
        PurchaseFilm[] tmp = new PurchaseFilm[films.length - 1];
        int numberOfFilm = 0;
        for (PurchaseFilm film : films) {
            if (film.getId() != id) {
                tmp[numberOfFilm] = film;
                numberOfFilm++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        PurchaseFilm[] tmp = new PurchaseFilm[0];
        films = tmp;
    }

}
