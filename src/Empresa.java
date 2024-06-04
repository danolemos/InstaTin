public class Empresa extends Usuario{
        String cnpj, site, descricao, endereco;
        Area area;

        public String toString(){
            return nome + " (" + login + " - " + cnpj + ")";
        };
}