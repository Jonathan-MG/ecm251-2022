public abstract class Membro implements PostarMensagem {
    private final String usuario;
    private final String email;
    private String funcao;
    
    public Membro(String usuario, String email, String funcao) {
        this.usuario = usuario;
        this.email = email;
        this.funcao = funcao;
    }


    @Override
    public String toString() {
        return "Membro [Usuario= " + usuario + ", email= " + email + ", Funcao= " + funcao + "]";
    }
}
