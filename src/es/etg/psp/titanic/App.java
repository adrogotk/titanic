package es.etg.psp.titanic;

import java.io.*;
import java.lang.*;

import es.etg.psp.titanic.data.*;
import es.etg.psp.titanic.rescate.*;


public class App {

    public static void main(String[] args) {
			Titanic t=new Titanic();
			String contenido= t.ejecutar();
			Imprimible informe= t.imprimir(contenido);
			String titulo=informe.getTitulo();
			System.out.println(titulo);
			String contenidoPantalla=informe.getContenidoString();
			System.out.println(contenidoPantalla);
			System.exit(0);
	}
	}


