package es.etg.psp.titanic.impresion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ImpresoraPantalla extends Impresora{

	public Imprimible imprimir(byte[] data){
      Informe informe=new Informe(String.Format(HEADER, ahora.getDayOfMonth(), ahora.getMonthValue(), 
	   ahora.getYear(), ahora.getHour(), ahora.getMinute(), ahora.getSecond()), data.toString());
	   return informe;
    }

}
