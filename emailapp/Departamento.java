package emailapp;

import java.util.Scanner;

public class Departamento{

    private String departamento;
    protected String CAPACIDADEEMAIL;

    public String getDepartamento() {
        return departamento;
    }

    public void setCAPACIDADEEMAIL(String CAPACIDADEEMAIL) {
        this.CAPACIDADEEMAIL = CAPACIDADEEMAIL;
    }
    public String setDepartamento(String primeiroNome, String sobrenome) {

        System.out.print("\n\nNOVO TRABALHADOR: " + primeiroNome + " " + sobrenome + ", CODIGOS DE DEPARTAMENTOS:" +
                "\n 1 - Vendas" +
                "\n 2 - Desenvolvimento" +
                "\n 3 - Contabilidade " +
                "\n 0 - Nenhum" +
                "\n Escolha o Departamento:");
        Scanner scanner = new Scanner(System.in);
        int escolhaDep = scanner.nextInt();
        scanner.close();

        switch (escolhaDep){
            case 1:
                setCAPACIDADEEMAIL("1Tb");
                return this.departamento = "vendas";
            case 2:
                setCAPACIDADEEMAIL("350Gb");
                return this.departamento = "desenvolvimento";
            case 3:
                setCAPACIDADEEMAIL("400Gb");
                return this.departamento = "contabil";
            default:
                setCAPACIDADEEMAIL("100GB");
                return this.departamento = "geral";
        }
    }
}
