package leituratest.demo;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

        public String enviarEmailTexto (String destinatario , String mensagem) {


        }
}
