package emailapp;

public class Senha{
    private String senha;
    private final int TAMANHOSENHA = 8;

    public String getSenha() {
        return senha;
    }

    public String setSenha() {

        String criadorSenha = "ABCDEFGHIJKLMNOPQRSTUVWYXZabcdefghijklmnopqrstuvwyxz1234567890!@#$%^&*";
        char[] minhaSenha = new char[TAMANHOSENHA];

        for (int i = 0; i < TAMANHOSENHA; i++) {
            int aleatorio = (int) (Math.random() * criadorSenha.length());
            minhaSenha[i] = criadorSenha.charAt(aleatorio);
        }
        this.senha = new String(minhaSenha);
        return this.senha;
    }
}
