package FirstGUI;

import javafx.scene.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.layout.*;

public class JavaFXGUI extends Application {                    // имплементировав класс Application, можно создать GUI


    public static void main(String[] args) {
        System.out.println("Запуск приложения");
        launch(args);                                           /* метод launch запускает GUI приложение: сперва идет
                                                                   метод init, затем start */
    }
    public void init(){                                         /* метод, инициализирующий необходимую логику перед
                                                                   запуском программы, здесь он переопределен, по
                                                                   умолчанию он пуст */
        System.out.println("В теле метода init()");
    }

    @Override
    public void start(Stage stage) throws Exception {           /* переопределение метода start,
                                                                   запускающего программу */
        System.out.println("В теле метода start()");
        stage.setTitle("JavaFX");                               /* центральная метафора, на которой построена
                                                                   библиотека JavaFX - подмостки (stage), на которых
                                                                   разыгрываются сцены (scene). Метод setTitle
                                                                   необходим для создания заголовка окна программы.*/
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 1600, 900);
        stage.setScene(myScene);
        stage.show();
    }

    public void stop(){
        System.out.println("В теле метода stop()");
    }
}
