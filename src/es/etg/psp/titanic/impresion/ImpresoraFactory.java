package es.etg.psp.titanic.impresion;


public class ImpresoraFactory{
	 public static Impresora imprimir(byte[], TipoImpresion tipoImpresion){
		 if (tipoImpresion==PANTALLA){
			 return new ImpresoraPantalla();
		 }
		 else {
			 return new ImpresoraPantalla();
		 }
   }
   
}
