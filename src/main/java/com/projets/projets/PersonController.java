package com.projets.projets;
import com.projets.projets.models.Personnes;
import com.projets.projets.repository.PersoRepos;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
@Component
public class ChartController {
    @Autowired
    public PersoRepos persoRepos;

    @FXML
    private TextField adresse;

    @FXML
    private Button claire;

    @FXML
    private Button delete;

    @FXML
    private TextField noms;

    @FXML
    private Button save;

    @FXML
    private TableView<?> table;

    @FXML
    private Button update;

    @FXML
    void clearPersonne(MouseEvent event) {
       clear();

    }

    @FXML
    void deletePersonne(MouseEvent event) {

    }

    @FXML
    void savePsersone(MouseEvent event) {
        Personnes p = new Personnes(noms.getText(),adresse.getText());
        persoRepos.save(p);
        clear();

    }

    @FXML
    void updatePersonne(MouseEvent event) {

    }

    void clear(){
        noms.setText(null);
        adresse.setText(null);
        noms.requestFocus();
    }

}

