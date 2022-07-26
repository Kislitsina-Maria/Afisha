import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.doReturn;


<<<<<<< HEAD:src/test/java/FilmsRepositoryTest.java
public class FilmsRepositoryTest {
    FilmsManager repo = new FilmsManager();
=======
public class FilmsManagerTest {

>>>>>>> 39814d6... Added Mockito:src/test/java/FilmsManagerTest.java
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

    @Test
    public void shouldReverseLastTen() {

        FilmsRepository repo = Mockito.mock(FilmsRepository.class);
        FilmsManager manage = new FilmsManager(repo);

        PurchaseFilm[] films = {film, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        doReturn(films).when(repo).findAll();
        PurchaseFilm[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film};
        PurchaseFilm[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseLastTwo() {
        FilmsRepository repo = Mockito.mock(FilmsRepository.class);
        FilmsManager manage = new FilmsManager(repo, 2);
        PurchaseFilm[] films = {film, film2, film6};
        doReturn(films).when(repo).findAll();
        PurchaseFilm[] expected = {film6, film2};
        PurchaseFilm[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
