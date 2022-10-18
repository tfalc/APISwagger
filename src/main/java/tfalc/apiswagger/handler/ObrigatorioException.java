package tfalc.apiswagger.handler;

public class ObrigatorioException extends BusinessException{

    public ObrigatorioException(String campo) {
        super("O campo %s é obrigatório", campo);
    }
}
