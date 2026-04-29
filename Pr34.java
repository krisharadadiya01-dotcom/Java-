import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Labels
        Label rollLabel = new Label("Roll No:");
        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");
        Label emailLabel = new Label("Email:");

        // TextFields
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        // Submit Button
        Button submitButton = new Button("Submit");

        // GridPane Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitButton, 1, 4);

        // Submit Button Action
        submitButton.setOnAction(e -> {
            String rollText = rollField.getText();
            String name = nameField.getText();
            String ageText = ageField.getText();
            String email = emailField.getText();

            // Validation
            int rollNo, age;

            try {
                rollNo = Integer.parseInt(rollText);
            } catch (NumberFormatException ex) {
                showError("Roll No must be an integer.");
                return;
            }

            try {
                age = Integer.parseInt(ageText);
            } catch (NumberFormatException ex) {
                showError("Age must be an integer.");
                return;
            }

            if (!email.contains("@") || !email.contains(".")) {
                showError("Invalid email format.");
                return;
            }

            // Success Alert
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setTitle("Registration Successful");
            successAlert.setHeaderText("User Registered Successfully");
            successAlert.setContentText(
                    "Roll No: " + rollNo +
                    "\nName: " + name +
                    "\nAge: " + age +
                    "\nEmail: " + email
            );
            successAlert.showAndWait();

            // Save to file
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Registration Details");
            fileChooser.setInitialFileName("registration.txt");

            File file = fileChooser.showSaveDialog(primaryStage);

            if (file != null) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    writer.write("Roll No: " + rollNo);
                    writer.newLine();
                    writer.write("Name: " + name);
                    writer.newLine();
                    writer.write("Age: " + age);
                    writer.newLine();
                    writer.write("Email: " + email);
                    writer.newLine();
                    writer.write("-------------------------");
                    writer.newLine();
                } catch (IOException ex) {
                    showError("Error saving file.");
                }
            }
        });

        // Scene
        Scene scene = new Scene(grid, 400, 300);

        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Error Alert Method
    private void showError(String message) {
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("Validation Error");
        errorAlert.setHeaderText("Invalid Input");
        errorAlert.setContentText(message);
        errorAlert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
          }
