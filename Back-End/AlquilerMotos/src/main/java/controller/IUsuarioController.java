package controller;

import java.util.Map;

public interface IUsuarioController{
        
        public String login(String username, String contrasena);
        public String register (String Username, String contrasena, 
                String nombre, String apellidos, String email, double saldo, boolean calificacion, boolean tipo_calificacion);
        
        public String pedir(String username);
        
        }