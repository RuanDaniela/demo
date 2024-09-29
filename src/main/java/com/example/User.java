package com.example;

public class User {
    private String nombreUsuario;
    private String contraseña;

    // Constructor
    public User(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    // Getter para el nombre de usuario
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    // Método para verificar las credenciales del usuario
    public boolean iniciarSesion(String usuarioIngresado, String contraseñaIngresada) {
        return this.nombreUsuario.equals(usuarioIngresado) && this.contraseña.equals(contraseñaIngresada);
    }
}

