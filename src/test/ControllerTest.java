import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import sample.Controller;
import sample.Korisnik;
import sample.KorisnikModel;

import javax.print.DocFlavor;
import java.io.File;

@ExtendWith(ApplicationExtension.class)
class ControllerTest {
    Stage stage;
    @Start
    public void start (Stage stage) throws Exception {
        KorisnikModel model = new KorisnikModel();
        model.napuni();

        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("src/resources/sample.fxml"));
        loader.setController(new Controller(model));
        java.net.URL url = new File("src/resources/sample.fxml").toURL();
        loader.setLocation(url);
        Parent root = loader.load();
        stage.setTitle("Korisnici");
        stage.setScene(new Scene(root, 800, 600));
        stage.show();
        stage.toFront();
        this.stage = stage;
    }

    @Test
    void dodajKorisnika(FxRobot robot) {//addNewUser
        TextField imeKorisnikaField = robot.lookup("#unosImena").queryAs(TextField.class);
        var noviKorisnik = new Korisnik("Test", "Test", "test.test@gmail.com", "test", "123456");
        robot.clickOn("#addNewUser");
        robot.clickOn("#unosImena");
        robot.write(noviKorisnik.getImeProperty().getName());
        assertEquals(noviKorisnik.getImeProperty().getName(), imeKorisnikaField.getText());
    }

    @Test
    void zavrsiProgram(FxRobot robot) {
        Button btnZavrsi = robot.lookup("#closeButton").queryAs(Button.class);
        robot.clickOn("#closeButton");
        assertFalse(stage.getScene().getWindow().isShowing());
    }
}