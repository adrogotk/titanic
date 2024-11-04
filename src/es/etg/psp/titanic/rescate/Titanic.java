package es.etg.psp.titanic.rescate;
import es.etg.psp.titanic.impresion;
import es.etg.psp.titanic.data;
import java.io.*;
import java.lang.*;

public class Titanic{
   public static final String MSG_ERROR = "Se ha producido un error al ejecutar el comando";
   public static final int NUMERO_BARCAS=10;
   public static final String COMANDO ="java";
   public static final String PARAMETROS={"es.etg.psp.titanic.rescate.Barca"}; 
   public static final String HEADER="Ejecución realizada el día %s/%s/%s a las %s:%s:%s";
   public String ejecutar(){
	   LocalDateTime ahora = LocalDateTime.now();
	   String contenido="";
	   int supervivientesTotal=0;
      for (int i=0; i<NUMERO_BARCAS; i++){
		  Comando rescateBarca=New Comando(COMANDO, PARAMETROS)
		   contenido+="\n";
		   int supervivientesBarca=(int) rescateBarca.ejecutar();
		   supervivientesTotal+=supervivientesBarca;
		  contenido+=String.Format("Barca B%s: %s supervivientes", i+1, supervivientesBarca);
	  }
	  contenido+=String.Format("\nTotal de supervivientes: %s supervivientes", supervivientesTotal);
	  return contenido;
   }
   public Imprimible imprimir (String contenido){
	   byte[] data=contenido.getBytes();
	   Impresora impresora = ImpresoraFactory.imprimir(data, TipoImpresion.PANTALLA);
	   Imprimible informe = impresora.imprimir(data);
	   return informe;
   }
}
