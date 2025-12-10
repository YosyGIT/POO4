package pass;

public class MainPassword {
    public static void main(String[] args) {
        Password pass1 = new Password();
        Password pass2 = new Password(34);
        Password pass3 = new Password("dslsdfh fdsifdsf 1234");
        System.out.println(pass1.getPassword());
        System.out.println(pass2.getPassword());
        System.out.println(pass3.getPassword());

        System.out.println("Pass1 es fuerte? "+pass1.esFuerte());
        System.out.println("Pass2 es fuerte? "+pass2.esFuerte());
        System.out.println("Pass3 es fuerte? "+pass3.esFuerte());

        pass3.setPassword();
        System.out.println(pass3.getPassword());
    }
}
