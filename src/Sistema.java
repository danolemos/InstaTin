import java.util.ArrayList;

public class Sistema(){

    private ArrayList <Pessoa> pessoas = new ArrayList <Pessoa>() ;
    private ArrayList <Empresa> empresas = new ArrayList <Empresa>() ;

    public Empresa buscarUsuario(String login) {
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).login == login) {
                return empresas.get(i);
            }
        }

        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).login == login) {
                return empresas.get(i);
            };
        };
        return null;
    }

    public void novaPessoa(Pessoa p){
        pessoas.add(new Pessoa (p) );
    };

    public void novaEmpresa(Empresa e){
        empresas.add(new Empresa (e) );
    };

    public void listarUsuarios(){
        for (int i = 0; i < pessoas.size(); i++){
            System.out.println("Lista de pessoas: ");
            System.out.println(pessoas.get(i).nome + "\n");
            System.out.println(pessoas.get(i).cidade + "\n");
        };

        for (int i = 0; i < empresas.size(); i++){
            System.out.println("Lista de empresas: ");
            System.out.println(empresas.get(i).nome + "\n");
            System.out.println(empresas.get(i).cidade + "\n");
        };
    };
}