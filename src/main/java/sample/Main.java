package sample;

import controller.IController;
import controller.states.ActiveState;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.IModel;
import model.Model;
import view.IView;

public class Main extends Application implements IView {

    public static void main(String[] args) {
        launch(args);
    }

    private IController controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        startMVC();
    }

    private void startMVC() {
        IModel model = new Model();
        IController controller = new ActiveState(this, model);
        model.setController(controller);
    }
}
