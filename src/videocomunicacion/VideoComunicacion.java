/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videocomunicacion;

/**
 *
 * @author Jesus Zapata
 */
public class VideoComunicacion {

    private static String nombre;
    private static int cantUsuarios;
    private static Integer tiempo;
    private static String nivel;
    private static int estrellas;

    public VideoComunicacion(String nombre, int cantUsuarios, Integer tiempo, String nivel, int estrellas) {
        VideoComunicacion.nombre = nombre;
        VideoComunicacion.cantUsuarios = cantUsuarios;
        VideoComunicacion.tiempo = tiempo;
        VideoComunicacion.nivel = nivel;
        VideoComunicacion.estrellas = estrellas;
    }
    
    public static int calidad(){
        return cantUsuarios*tiempo*estrellas;
    }
    
    
    
    public static void main(String[] args) {
          VideoComunicacion prueba = new   VideoComunicacion("Zoom", 38, 20, "Libre", 4);
          System.out.println(calidad());
    }
    
}
