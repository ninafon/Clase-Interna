
package eclaseinterna;

public class EClaseInterna {

    public static void main(String[] args) {
      AlumnoInt.Enderezo in = new AlumnoInt().new Enderezo(" bbb",8);  
      AlumnoInt a = new AlumnoInt("nnn",5,in);
      a.amosar();
      a.mudarEnderezo();
      a.amosar();
    }
    
}
