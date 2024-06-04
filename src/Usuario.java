import java.util.ArrayList;

public class Usuario{
    String login, nome, senha;
    Localidade cidade;

    ArrayList < Usuario > seguindo = new ArrayList < >();
    ArrayList < Usuario > seguidores = new ArrayList < >() ;
    ArrayList < Pessoa > interessados = new ArrayList < >() ;
    ArrayList < Postagem > posts = new ArrayList < >() ;

    //boolean validarAcesso(String pwd){
        //return true;
        //return false;
    //}

    public String toString(){
        return this.nome + this.login;
    }

    void postar(String foto, String legenda, Data hoje, String senha) {

        // criar postagem //
        Postagem p = new Postagem();
        foto = foto;
        legenda = legenda;
        Data d = hoje;

        if (senha == this.senha) {

            // inserir na lista de posts //
            posts.add(p);


        }
    }

        void seguir(String[] args){
            seguindo.add(this);
        };

        void mostrarPosts(String[] args){
            for (int i = 0; i < posts.size() ; i ++) {
                System.out.println(posts.get(i));
            }
        }

        void feed(String[] args){
            // O método feed exibe todos os posts de todos os usuário que ele segue //
            return;
        }
    }
}