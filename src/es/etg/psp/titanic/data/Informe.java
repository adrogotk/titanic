package es.etg.psp.titanic.data;


public class Informe implements Imprimible{
   private String titulo;
   private String contenido;
   public Informe(String titulo, String contenido){
	   this.titulo=nombre;
	   this.contenido=contenido;
   }
   public String getTitulo(){
	   return this.titulo;
   }
   public String getContenido(){
	   return this.contenido;
   }
}
