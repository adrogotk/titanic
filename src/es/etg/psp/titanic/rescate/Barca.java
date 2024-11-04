package es.etg.psp.titanic.rescate;
import java.io.*;
import java.lang.*;



public class Barca{
    public static void main(String[] args) {
		int numeroAleatorio=generarNumeroAleatorio();
		int tiempoAleatorio=generarTiempoAleatorio();
		Thread.sleep(tiempoAleatorio);
		System.out.println(numeroAleatorio);
	}
	private int generarNumeroAleatorio(){
		return (int) (Math.random() * 100);
	}
	private int generarTiempoAleatorio(){
		return (int) ((Math.random() * 4000)+2000);
	}
}
