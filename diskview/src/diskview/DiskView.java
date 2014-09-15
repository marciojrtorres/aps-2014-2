package diskview;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

public class DiskView extends Thread {

	// unidade de disco monitorada
	private final File un;
	
	static {
		try {
			// configurando a aparencia para parecer-se com as janelas do sistema operacional
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// construtor com o caminho da unidade
	public DiskView(String c) {
		this.un = new File(c);
	}
	
	@Override
	public void run() {		
		super.run();
		try {
			
			JFrame frame = new JFrame();
			frame.setTitle("Espaco em disco");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setAlwaysOnTop(true);
			
			JProgressBar progress = new JProgressBar();
			long t = un.getTotalSpace() / 1024;
			progress.setMaximum((int) t); // espaço total em kb
			
			frame.getContentPane().add(BorderLayout.CENTER,progress);			
			frame.getContentPane().add(BorderLayout.NORTH, 
					new JLabel("Espaco usado em " + un.toString()));
			progress.setStringPainted(true);
			
			frame.setSize(400, 40);
			frame.setVisible(true);
			
			long f = 0;
			while (true) {
				// monitorar de meio em meio segundo
				Thread.sleep(500);
				if (f != un.getFreeSpace()) {
					// obtendo espaco livre e calculando o ocupado
					f = un.getFreeSpace();
					long us = (un.getTotalSpace() - f) / 1024; // espaço usado em kb
					
					// apresentacao visual do uso
					progress.setValue((int) us);
					// --- fim apresentacao visual
					
					// registro do uso do disco
					System.out.println(new java.util.Date());
					System.out.println(us + "KB usados de " + t + "KB totais");
					// --- fim registro
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
