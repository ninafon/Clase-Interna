

package eclaseinterna;

public class AlumnoInt {
    private String nome ;
    private int nota;
    private Enderezo enderezo;

    public AlumnoInt(String nome, int nota, Enderezo enderezo) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }
    public AlumnoInt(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Enderezo getEnderezo() {
        return enderezo;
    }

    public void setEnderezo(Enderezo enderezo) {
        this.enderezo = enderezo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo + '}';
    }
    
    public void mudarEnderezo(){
        enderezo.setRua(" cambio rua ");
    }
    public void amosar(){
        System.out.println(toString());
    }
  /*  public void menuInterna(){
        Enderezo e = new Enderezo("xxx",2);
        System.out.println(e.rua);
    }*/
    
    
    
    class Enderezo{
         private String  rua;
    private int numero;

    public Enderezo(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Enderezo{" + "rua=" + rua + ", numero=" + numero + '}';
    }
 /*   public void menuExterna(){
        System.out.println( nome);
    }*/

   }

}
