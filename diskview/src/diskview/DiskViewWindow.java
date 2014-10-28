package diskview;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

public class DiskViewWindow implements IDiskViewObserver {
	
	private JProgressBar progress;
	private JLabel label;

	static {
		try {
			// configurando a aparencia para parecer-se com as janelas do
			// sistema operacional
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public DiskViewWindow() {
		JFrame frame = new JFrame();
		frame.setTitle("Espaco em disco");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setAlwaysOnTop(true);
		
		progress = new JProgressBar();
		
		label = new JLabel();
		
		frame.getContentPane().add(BorderLayout.CENTER,progress);			
		frame.getContentPane().add(BorderLayout.NORTH, label);
		progress.setStringPainted(true);
		
		frame.setSize(400, 40);
		frame.setVisible(true);
	}
	

	@Override
	public void atualiza(long espacoUsado, long espacoTotal, String unidade) {
		label.setText("Espaco usado em " + unidade);
		progress.setMaximum((int) espacoTotal);
		progress.setValue((int) espacoUsado);
	}
}
