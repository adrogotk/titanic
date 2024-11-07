package es.etg.psp.titanic.impresion;
import es.etg.psp.titanic.data.*;


public abstract class Impresora {
   public Imprimible imprimir(byte[] data){
      ImpresoraPantalla impresora=new ImpresoraPantalla();
      return impresora.imprimir(data);
   }
}
