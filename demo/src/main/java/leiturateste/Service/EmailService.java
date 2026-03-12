package leiturateste.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String remetente;

        public ResponseEntity<String> enviarEmailTexto (String destinatario , String mensagem , String assunto) {

            try {
                SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
                simpleMailMessage.setFrom(remetente);
                simpleMailMessage.setFrom(destinatario);
                simpleMailMessage.setFrom(mensagem);
                return ResponseEntity.ok("Email enviado");

            } catch (Exception e) {
                e.printStackTrace();
            }

            return ResponseEntity.status(400).body("Não enviado");
            }



        }
