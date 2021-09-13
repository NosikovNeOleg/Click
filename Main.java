package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    int count = 0;
    public void init() throws Exception {
            super.init();
        }
    @Override
    public void start(Stage stage) {
        Button btnxd = new Button("Click!");
        Text counter = new Text("Количество побегов - " + count);
        counter.setTranslateY(-200);
        btnxd.setOnMouseMoved(mouseEvent -> count = randomNum(btnxd,counter,count));
        Scene scene = new Scene(new StackPane(btnxd,counter), 640, 640);
        stage.setScene(scene);
        stage.show();

    }
    @Override
        public void stop() throws Exception {
            super.stop();
        }
    public int randomNum(Button btnxd, Text counter, int count) {
        int x = (-100 + (int) (Math.random() * 240));
        int y = (-100 + (int) (Math.random() * 240));
        while (x > 630 | y > 630) {
            x = (-100 + (int) (Math.random() * 240));
            y = (-100 + (int) (Math.random() * 240));
        }
        count = count + 1;
        counter.setText("Количество побегов - " + count);
        btnxd.setTranslateY(y);
        btnxd.setTranslateX(x);
        return count;
    }


    public static void main(String[] args) {
        launch();
    }}
