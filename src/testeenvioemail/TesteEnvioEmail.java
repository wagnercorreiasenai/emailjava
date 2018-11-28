package testeenvioemail;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class TesteEnvioEmail {

    public static void main(String[] args) {
       
        EmailWrapper e = new EmailWrapper();
        
        String remetente = "sistema@dextak.com";
        String destinatario = "wagner.correia@edu.sc.senai.br";
        String assunto = "Teste 2";
        String msg = "Hey cara isto é um teste";
        
        if (e.enviar(remetente, destinatario, assunto, msg)) {
            JOptionPane.showMessageDialog(null, "E-mai enviado com sucesso!", "Sucesso!", INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao enviar e-mail!", "Erro!", ERROR_MESSAGE);
        }
        
    }
    
}