package br.edu.iff.teste.heranca;

/**
 *
 * @author luizcanf
 */
public class AlunoConcomitante extends Aluno {
    
    long matriculaEM;
    String escolaEM;
    boolean apresentouCertificadoEM;
    boolean acabouomateria;
    boolean apresentoutudo; 
    
    public boolean podeSolicitarDiploma() {
        if (apresentouCertificadoEM && acabouomateria && apresentoutudo ) {
            return true;
        } else {
            return false;
        }
    }

}
