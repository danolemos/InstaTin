import java.util.ArrayList;

public class Pessoa extends Usuario{
        String cpf, bio;
        char sexo;
        Data nasc;

        ArrayList <Usuario> interesses = new ArrayList <>();

        public String toString(){
            return nome + " (" + login + " - " + cpf + ")";
        };
}