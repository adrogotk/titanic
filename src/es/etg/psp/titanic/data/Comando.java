package es.etg.psp.titanic.data;

import java.io.*;
import java.lang.*;

import es.etg.psp.titanic.rescate.Titanic;

public class Comando{
   private String nombre;
   private String[] parametros;
   public Comando (String nombre, String[] parametros){
	   this.nombre=nombre;
	   this.parametros=parametros;
   }
   public String ejecutar (){
	   String[] comando=new String[this.parametros.length+1];
       comando[0]=this.nombre;
       System.arraycopy(this.parametros, 0, comando, 1, this.parametros.length);
	   StringBuilder output = new StringBuilder();
       try {

		   Process proceso = Runtime.getRuntime().exec(comando);
           BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
           String line;
           int contadorLineas=0;
           while ((line = reader.readLine()) != null) {
            contadorLineas++;
               output.append(line);
           }

           int exitVal = proceso.waitFor();
           if (exitVal != 0) {
               output.append(Titanic.MSG_ERROR);
               System.exit(1);
		   }
       } catch (IOException | InterruptedException e) {
           output.append(e);
       }
       return output.toString();
   }
}
