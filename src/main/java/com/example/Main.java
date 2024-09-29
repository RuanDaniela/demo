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

    // Instancias de Usuario y Restaurante predefinidos
    User usuarioRegistrado = new User("usuario1", "contraseña1");
    Restaurant restauranteRegistrado = new Restaurant("Panitos", "Panitos1");

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("UVGustitos - Selección de Usuario");

        // Crear los botones iniciales
        Button restauranteButton = new Button("Soy un Restaurante");
        Button usuarioButton = new Button("Soy un Usuario");

        // Crear un layout vertical (VBox) para la escena inicial
        VBox initialVBox = new VBox(10);
        initialVBox.setPadding(new Insets(20));
        initialVBox.setAlignment(Pos.CENTER);
        initialVBox.setStyle("-fx-background-color: #CEDF9F;");

        Label welcomeLabel = new Label("¿Quién eres?");
        welcomeLabel.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 16px;");

        initialVBox.getChildren().addAll(welcomeLabel, restauranteButton, usuarioButton);

        // Crear la escena inicial
        Scene initialScene = new Scene(initialVBox, 500, 300);
        primaryStage.setScene(initialScene);
        primaryStage.show();

        // Configurar la acción del botón de "Usuario"
        usuarioButton.setOnAction(e -> showLoginForm(primaryStage));

        // Configurar la acción del botón de "Restaurante"
        restauranteButton.setOnAction(e -> showRestauranteLoginForm(primaryStage));
    }

    // Método para mostrar el formulario de login para usuarios
    private void showLoginForm(Stage primaryStage) {
        primaryStage.setTitle("Login UVGustitos - Usuario");

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
        Image logoImage = new Image("https://png.pngtree.com/png-clipart/20231109/original/pngtree-burger-fast-food-cartoon-png-image_13520052.png");
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
            String usuarioIngresado = userField.getText().trim();
            String contraseñaIngresada = passField.getText().trim();

            // Validar las credenciales usando la clase Usuario
            if (usuarioRegistrado.iniciarSesion(usuarioIngresado, contraseñaIngresada)) {
                messageLabel.setText("Inicio de sesión exitoso!");
            } else {
                messageLabel.setText("Usuario o contraseña incorrectos.");
            }
        });

        // Crear la escena y ajustar el tamaño del stage
        Scene loginScene = new Scene(vbox, 500, 400);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    // Método para mostrar el formulario de login para restaurantes
    private void showRestauranteLoginForm(Stage primaryStage) {
        primaryStage.setTitle("Login UVGustitos - Restaurante");

        // Crear los elementos de la GUI
        Label restLabel = new Label("Nombre del Restaurante:");
        TextField restField = new TextField();
        Label passLabel = new Label("Contraseña:");
        PasswordField passField = new PasswordField();
        Button loginButton = new Button("Iniciar Sesión");
        Label messageLabel = new Label();

        // Cambiar la fuente y el tamaño del texto del messageLabel
        messageLabel.setStyle("-fx-font-family: 'Arial'; -fx-font-size: 16px;");
        messageLabel.setText(""); // Asegurarse de que el label esté vacío al inicio

        // Cargar la imagen
        Image logoImage = new Image("https://img.freepik.com/vector-gratis/restaurante-plano-farolas_23-2147539585.jpg?size=338&ext=jpg&ga=GA1.1.2008272138.1727481600&semt=ais_hybrid");
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
        vbox.getChildren().addAll(logoView, restLabel, restField, passLabel, passField, loginButton, messageLabel);

        // Configurar la acción del botón de inicio de sesión
        loginButton.setOnAction(e -> {
            String restauranteIngresado = restField.getText().trim();
            String contraseñaIngresada = passField.getText().trim();

            // Validar las credenciales usando la clase Restaurante
            if (restauranteRegistrado.iniciarSesion(restauranteIngresado, contraseñaIngresada)) {
                messageLabel.setText("Inicio de sesión exitoso!");
            } else {
                messageLabel.setText("Nombre del restaurante o contraseña incorrectos.");
            }
        });

        // Crear la escena y ajustar el tamaño del stage
        Scene loginScene = new Scene(vbox, 500, 400);
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
