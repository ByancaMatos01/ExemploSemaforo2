package Controller;

import java.util.concurrent.Semaphore;

public class ThreadOperacao extends Thread {

	private int idThread;
	private Semaphore semaforo;
	
	
	public ThreadOperacao(int idThread, Semaphore semaforo) {
		this.idThread = idThread;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
			semaforo.acquire();
			saudacao();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();	
		}
		
	}

	private void saudacao() {
		System.out.println("Boa tarde ");
		System.out.println("alunos do ");
		System.out.println(idThread + "o.");
		System.out.println("semestre do ");
		System.out.println("curso de ADS");
	}

}