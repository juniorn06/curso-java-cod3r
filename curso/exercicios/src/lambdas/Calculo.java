package lambdas;

public interface Calculo {

    double executar(double a, double b);

    public default String legal(){
        return "legal";
    }

    public static String muitoLegal(){
        return "muito legal";
    }


}
