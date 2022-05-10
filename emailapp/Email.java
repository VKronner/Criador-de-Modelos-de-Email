package emailapp;

import java.util.Scanner;

public class Email {
    private String primeiroNome;
    private String sobrenome;
    private String senha;

    private String departamento;
    private final String CAPACIDADEEMAIL;

    private String email;
    private String emailAlternativo;
    private final String SUFIXOCOMPANIA = "BITCASTLE";

    //CONSTRUTOR
    public Email (String primeiroNome, String sobrenome){

        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;

        Departamento departamento = new Departamento();
        this.departamento = departamento.setDepartamento(primeiroNome, sobrenome);
        this.CAPACIDADEEMAIL = departamento.CAPACIDADEEMAIL;

        Senha senha = new Senha();
        this.senha = senha.setSenha();

        this.email = CriaEmail(primeiroNome, sobrenome, departamento);
    }

    //SETTERS

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }



    //GETTERS

    public String getEmailAlternativo() { return emailAlternativo;}

    public String getPrimeiroNome() { return primeiroNome; }

    public String getSobrenome() { return sobrenome; }

    public String getSenha() { return senha; }

    //METODOS

    private String CriaEmail(String primeiroNome, String sobrenome, Departamento departamento) {
        return email =
                primeiroNome.toLowerCase() + "." +
                sobrenome.toLowerCase() + "@" +
                departamento.getDepartamento() + "." +
                SUFIXOCOMPANIA.toLowerCase() + ".com.br";
    }
    public String MostrarInfo(){
        return "\nNOME COMPLETO: " + primeiroNome + " " + sobrenome +
                "\nNOME DA EMPRESA: " + SUFIXOCOMPANIA +
                "\nCAPACIDADE DO EMAIL: " + CAPACIDADEEMAIL +
                "\nEMAIL: " + email +
                "\nSENHA: " + senha;
    }
}
