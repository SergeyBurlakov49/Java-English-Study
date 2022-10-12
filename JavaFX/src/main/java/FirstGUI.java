import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FirstGUI extends Application {
    public static void main(String[] args) {
        System.out.println("Запуск приложения");

    }
    public void start(Stage stage) throws Exception {
        System.out.println("В теле метода start()");
        stage.setTitle("Каркас приложения JavaFX");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 1920, 1080);
        stage.setScene(myScene);
        stage.show();
    }
    public void stop(){
        System.out.println("В теле метода stop()");
    }
}
