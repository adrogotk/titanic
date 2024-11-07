package es.etg.psp.titanic.rescate;
import java.io.*;
import java.lang.*;



public class Barca{
    public static void main(String[] args) {
		int numeroAleatorio=generarNumeroAleatorio();
		int tiempoAleatorio=generarTiempoAleatorio();
		try {
			Thread.sleep(tiempoAleatorio);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(numeroAleatorio);
	}
	private static int generarNumeroAleatorio(){
		return (int) (Math.random() * 100);
	}
	private static int generarTiempoAleatorio(){
		return (int) ((Math.random() * 4000)+2000);
	}
}
