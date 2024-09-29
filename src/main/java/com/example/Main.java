package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login UVGustitos");

        // Crear los elementos de la GUI
        Label userLabel = new Label("Usuario:");
        TextField userField = new TextField();
        Label passLabel = new Label("Contraseña:");
        PasswordField passField = new PasswordField();
        Button loginButton = new Button("Iniciar Sesión");
        Label messageLabel = new Label();

        // Cambiar la fuente y el tamaño del texto del messageLabel
        messageLabel.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 16px;");
        messageLabel.setText(""); // Asegurarse de que el label esté vacío al inicio

        // Cargar la imagen
        Image logoImage = new Image("https://static.fundacion-affinity.org/cdn/farfuture/PVbbIC-0M9y4fPbbCsdvAD8bcjjtbFc0NSP3lRwlWcE/mtime:1643275542/sites/default/files/los-10-sonidos-principales-del-perro.jpg");
        ImageView logoView = new ImageView(logoImage);

        // Ajustar el tamaño de la imagen
        logoView.setFitHeight(100);
        logoView.setFitWidth(100);
        logoView.setPreserveRatio(true);

        // Crear un layout vertical (VBox)
        VBox vbox = new VBox(10); // Espacio vertical entre elementos
        vbox.setPadding(new Insets(20)); // Añadir padding
        vbox.setAlignment(Pos.CENTER); // Centrar los elementos en el VBox
        vbox.setStyle("-fx-background-color: #CEDF9F;"); // Fondo verde claro

        // Añadir los elementos al VBox (primero la imagen, luego el resto de controles)
        vbox.getChildren().addAll(logoView, userLabel, userField, passLabel, passField, loginButton, messageLabel);

        // Configurar la acción del botón de inicio de sesión
        loginButton.setOnAction(e -> {
            String usuario = userField.getText().trim();
            String contraseña = passField.getText().trim();

            // Validar las credenciales
            if (iniciarSesion(usuario, contraseña)) {
                messageLabel.setText("Inicio de sesión exitoso!");
            } else {
                messageLabel.setText("Usuario o contraseña incorrectos.");
            }
        });

        // Crear la escena y ajustar el tamaño del stage
        Scene scene = new Scene(vbox, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para simular el inicio de sesión
    private boolean iniciarSesion(String usuario, String contraseña) {
        // Simulación de un usuario válido
        return usuario.equals("usuario1") && contraseña.equals("contraseña1");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
