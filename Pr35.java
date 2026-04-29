import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Main horizontal container for bars
        HBox root = new HBox(30);
        root.setAlignment(Pos.BOTTOM_CENTER);

        // Scale factor for bar heights
        int scale = 5;

        // Create bars for each category
        VBox projectsBar = createBar("Projects - 20%", 20 * scale, Color.RED);
        VBox quizzesBar = createBar("Quizzes - 10%", 10 * scale, Color.BLUE);
        VBox midtermBar = createBar("Midterm Exams - 30%", 30 * scale, Color.GREEN);
        VBox finalBar = createBar("Final Exam - 40%", 40 * scale, Color.ORANGE);

        // Add bars to root
        root.getChildren().addAll(projectsBar, quizzesBar, midtermBar, finalBar);

        // Scene setup
        Scene scene = new Scene(root, 700, 400);

        primaryStage.setTitle("Overall Grades Bar Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to create individual bar with label
    private VBox createBar(String labelText, double height, Color color) {

        Rectangle bar = new Rectangle(60, height);
        bar.setFill(color);

        Label label = new Label(labelText);
        label.setWrapText(true);
        label.setMaxWidth(100);
        label.setAlignment(Pos.CENTER);

        VBox barContainer = new VBox(10);
        barContainer.setAlignment(Pos.BOTTOM_CENTER);

        // Label below the bar
        barContainer.getChildren().addAll(bar, label);

        return barContainer;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
