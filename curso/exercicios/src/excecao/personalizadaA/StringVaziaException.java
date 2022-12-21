package excecao.personalizadaA;

public class StringVaziaException extends RuntimeException{

    String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atibuto '%s' está vazio", nomeDoAtributo);
    }
}
