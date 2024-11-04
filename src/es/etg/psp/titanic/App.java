package es.etg.psp.titanic;

import java.io.*;
import java.lang.*;

import es.etg.psp.dam.io.FicheroRead;
import es.etg.psp.dam.io.FicheroWrite;
import es.etg.psp.recursos.io.FicheroWriterMD;

public class App {

    public static void main(String[] args) {
			Titanic t=new Titanic();
			String contenido= t.ejecutar();
			Imprimible informe= t.imprimir(contenido);
			System.out.println(informe.getTitulo());
			System.out.println(informe.getContenido());
	}


