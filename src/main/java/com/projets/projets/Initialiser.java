package com.projets.projets;
import com.projets.projets.Principal.StageReadyEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Component
public class Initialiser implements ApplicationListener<StageReadyEvent> {
    @Value("classpath:/chart.fxml")
    private Resource chartRessource;
    private String applicationTitle;
    private ApplicationContext applicationContext;

    public Initialiser(@Value("${spring.application.ui.title}") String applicationTitle, ApplicationContext applicationContext) {
        this.applicationTitle = applicationTitle;
        this.applicationContext = applicationContext;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(chartRessource.getURL());
            fxmlLoader.setControllerFactory(aClass -> applicationContext.getBean(aClass));
            Stage stage = event.getStage();
            Parent parent = fxmlLoader.load();
            stage.setScene(new Scene(parent,800,600));

            stage.setTitle(applicationTitle);
            stage.show();
        //
        //Stage stage = event.getStage();
       // stage.setScene(new Scene(parent,800,600));
      //
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException();
        }

    }
}
