package com.example;

public class Restaurant {
    private String nombreRestaurante;
    private String contraseña;

    // Constructor
    public Restaurant(String nombreRestaurante, String contraseña) {
        this.nombreRestaurante = nombreRestaurante;
        this.contraseña = contraseña;
    }

    // Getter para el nombre del restaurante
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    // Método para verificar las credenciales del restaurante
    public boolean iniciarSesion(String nombreRestauranteIngresado, String contraseñaIngresada) {
        return this.nombreRestaurante.equals(nombreRestauranteIngresado) && this.contraseña.equals(contraseñaIngresada);
    }
}
