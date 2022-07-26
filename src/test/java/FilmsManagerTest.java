import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsManager repo = new FilmsManager();
    PurchaseFilm film = new PurchaseFilm(1, "Number one");
    PurchaseFilm film2 = new PurchaseFilm(2, "Hotel Belgrade");
    PurchaseFilm film3 = new PurchaseFilm(3, "Maska");
    PurchaseFilm film4 = new PurchaseFilm(4, "Up!");
    PurchaseFilm film5 = new PurchaseFilm(5, "Friends");
    PurchaseFilm film6 = new PurchaseFilm(6, "Doctor House");
    PurchaseFilm film7 = new PurchaseFilm(7, "Avatar");
    PurchaseFilm film8 = new PurchaseFilm(8, "Blandshop");
    PurchaseFilm film9 = new PurchaseFilm(9, "Trolls");
    PurchaseFilm film10 = new PurchaseFilm(10, "Humans");
    PurchaseFilm film11 = new PurchaseFilm(11, "Office");


    @BeforeEach
    public void setup() {
        repo.addFilms(film);
        repo.addFilms(film2);
        repo.addFilms(film3);
        repo.addFilms(film4);
        repo.addFilms(film5);
        repo.addFilms(film6);
        repo.addFilms(film7);
        repo.addFilms(film8);
        repo.addFilms(film9);
        repo.addFilms(film10);
        repo.addFilms(film11);
    }

    @Test
    public void shouldReverseAllFilms() {
        PurchaseFilm[] expected = {film, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        PurchaseFilm[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastTen() {
        repo.findLast();
        PurchaseFilm[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        PurchaseFilm[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastTwo() {
        FilmsManager repo = new FilmsManager(2);
        repo.addFilms(film);
        repo.addFilms(film2);
        repo.addFilms(film3);
        repo.findLast();
        PurchaseFilm[] expected = {film3, film2};
        PurchaseFilm[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

}
