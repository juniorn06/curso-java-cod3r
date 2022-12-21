package excecao.personalizadaA;

public class NumeroForaDeIntervaloException extends RuntimeException{

    String nomeDoAtributo;

    public NumeroForaDeIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atibuto '%s' está fora do intervalo", nomeDoAtributo);
    }
}
