package excecao;

public class Causa {

    public static void main(String[] args) {
        try {
            medotoA(null);
        } catch (IllegalAccessException e) {
            if (e.getCause() != null){
                System.out.println(e.getCause().getMessage());
            }
        }

    }

    static void medotoA(Aluno aluno) throws IllegalAccessException {
        try {
            metodoB(aluno);
        } catch (Exception causa) {
            throw new IllegalArgumentException();
        }
    }

    static void metodoB(Aluno aluno){
        if (aluno == null){
            throw new NullPointerException("Aluno está nulo!");
        }
        System.out.println(aluno.nome);
    }
}
