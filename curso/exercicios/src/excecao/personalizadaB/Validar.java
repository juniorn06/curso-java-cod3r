package excecao.personalizadaB;

import excecao.Aluno;

public class Validar {

    private Validar(){

    }

    public static void aluno(Aluno aluno) throws IllegalAccessException, StringVaziaException {
        if (aluno == null){
            throw new IllegalAccessException("O aluno está nulo!");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaDeIntervaloException("nota");
        }
    }
}
