package es.etg.psp.titanic.impresion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import es.etg.psp.titanic.data.*;
import es.etg.psp.titanic.rescate.*;

public class ImpresoraPantalla extends Impresora{

	public Imprimible imprimir(byte[] data){
		LocalDateTime ahora = LocalDateTime.now();
      Informe informe=new Informe(String.format(Titanic.HEADER, String.valueOf(ahora.getDayOfMonth()), String.valueOf(ahora.getMonthValue()), 
	   String.valueOf(ahora.getYear()), String.valueOf(ahora.getHour()), String.valueOf(ahora.getMinute()), String.valueOf(ahora.getSecond())), data);
	   return informe;
    }

}
