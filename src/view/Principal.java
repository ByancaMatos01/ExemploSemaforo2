package view;

import java.util.concurrent.Semaphore;

import Controller.ThreadOperacao;

public class Principal {

	public static void main(String[] args) {
			int permissoes = 1;
			Semaphore semaforo = new Semaphore(permissoes);
			for (int semestre = 1; semestre <= 6 ; semestre++) {
				Thread t = new ThreadOperacao(semestre, semaforo);
				t.start();
			}
			
		}
	}


