package es.etg.psp.titanic.data;


public class Comando{
   public static final int salidaBarca
   private String nombre;
   private String[] parametros;
   public Comando (String nombre, String[] parametros){
	   this.nombre=nombre;
	   this.parametros=parametros;
   }
   public String ejecutar (){
	   String[] comando={nombre, parametros};
	   StringBuilder output = new StringBuilder();
       try {

		   Process proceso1 = Runtime.getRuntime().exec(comando);
           BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
           String line;
           while ((line = reader.readLine()) != null) {
               output.append(line).append("\n");
           }

           int exitVal = process.waitFor();
           if (exitVal != 0) {
               output.append(MSG_ERROR);
		   }
       } catch (IOException | InterruptedException e) {
           output.append(e);
       }
       return output.toString();
   }
}
