package es.etg.psp.titanic.data;

public class Informe implements Imprimible{
   private String titulo;
   //private String contenido;
   private byte[] contenido;
   public Informe(String titulo, byte[] contenido){
	   this.titulo=titulo;
	   this.contenido=contenido;
   }
   public String getTitulo(){
	   return this.titulo;
   }
   public byte[] getContenido(){
      return this.contenido;
   }

   public String getContenidoString(){
      String contenidoString=new String(this.contenido);
	   return contenidoString;
   }
}
