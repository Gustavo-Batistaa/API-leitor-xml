package leiturateste.Service;

import java.io.File;
import java.util.Scanner;

public class Leitor {
    Scanner scanner = new Scanner(System.in);
    private EmailService emailService;


    public File LerXml () {
        System.out.println("Digite o caminho dos arquivos para percorrer");
       String  caminho = scanner.nextLine();
        File pasta = new File(caminho);
        if (pasta.exists()) {
            System.out.println("Caminho encontrado , Digite o numero do mes que deseja retirar os arquivos xml");
            int mes = scanner.nextInt();
                if (mes >12 || mes <1) {
                    System.out.println("Mês invalido , tente entre 1 e 12");
                }
            String mesFormatado = String.format("%02d", mes);

            // Caminho da pasta que sera criada em documentos

             var nomeUsuario=System.getProperty("user.home");
             String caminhoPastaCriada = nomeUsuario +"Documentos";
            File pastaCriadaFechamentos = new File(caminhoPastaCriada , mesFormatado +"-fechamentos");
            System.out.println("Pasta criada com sucesso!");
            scanner.close();


            }

            return pasta;
        }


    }

