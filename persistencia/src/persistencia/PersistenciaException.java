package persistencia;

public class PersistenciaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PersistenciaException(String mensagem, Exception e) {
		super(mensagem, e);
	}

	public PersistenciaException(String mensagem) {
		super(mensagem);
	}
	
}
