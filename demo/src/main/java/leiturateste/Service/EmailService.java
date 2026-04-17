package leiturateste.Service;


import org.springframework.beans.PropertyMatches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;


public class EmailService {
    Scanner scanner = new Scanner(System.in);
    String rementente;
    File caminho;


    public  void EnviarEmail (String remetente) {

        System.out.println("Digite o email para qual vai ser enviado");
        rementente = scanner.nextLine();
        scanner.close();
        if (Pattern.matches(".+@.+\\..+", remetente)) {
            System.out.println("Email Válido , Deixe os arquivos em que deseja enviar");
            caminho = new File(scanner.nextLine());
            scanner.close();
            caminho.exists();


        }

    }
    
};