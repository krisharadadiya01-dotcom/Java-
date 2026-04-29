import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class RandomTextDisplay extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        // VBox layout for vertical stacking
        VBox vbox = new VBox(15); // spacing between texts
        vbox.setAlignment(Pos.CENTER); // center horizontally

        Random random = new Random();

        // Create 5 Text nodes
        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            // Set font style
            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22));

            // Random color
            Color randomColor = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble()
            );

            // Random opacity between 0.3 and 1.0
            double opacity = 0.3 + (random.nextDouble() * 0.7);

            text.setFill(randomColor);
            text.setOpacity(opacity);

            // Add text to VBox
            vbox.getChildren().add(text);
        }

        // Scene setup
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Random Text Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
