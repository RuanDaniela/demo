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

    // Setter para el nombre del restaurante
    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    // Getter para la contraseña
    public String getContraseña() {
        return contraseña;
    }

    // Setter para la contraseña
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método para verificar las credenciales del restaurante
    public boolean iniciarSesion(String nombreRestauranteIngresado, String contraseñaIngresada) {
        return this.nombreRestaurante.equals(nombreRestauranteIngresado) && this.contraseña.equals(contraseñaIngresada);
    }

    // Método para actualizar las credenciales del restaurante
    public void actualizarCredenciales(String nuevoNombre, String nuevaContraseña) {
        setNombreRestaurante(nuevoNombre);
        setContraseña(nuevaContraseña);
    }
}
