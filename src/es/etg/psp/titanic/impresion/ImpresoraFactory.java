package es.etg.psp.titanic.impresion;


public class ImpresoraFactory{
	 public static Impresora imprimir(byte[] data, TipoImpresion tipoImpresion){
		 if (tipoImpresion==TipoImpresion.PANTALLA){
			 return new ImpresoraPantalla();
		 }
		 else {
			 return new ImpresoraPantalla();
		 }
   }
   
}
