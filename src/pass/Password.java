package pass;

public class Password {
    private String password;
    private static final String VALIDAR = "^(?=.*[a-zñ])(?=.*[A-ZÑ])(?=.*[0-9])(?=.*[@$!%*?&]).{12,}$";


    public Password(){
        int longitud = (int)(Math.random()* (4 - 3 + 1) + 3);
        this.password = "";
        char[] simbolos = {'@','$','!','%','*','?','&'}, arrayPass;
        int caracterMayus, caracterMin, caracterNum, sim, posicionSuap = 0, posRandom;
        char car1, car2;
        String pass = "";
        for (int i = 0; i < longitud; i++) {
            caracterMayus = (int)(Math.random()*(90 - 65 + 1) + 65);
            caracterMin = (int)(Math.random()*(122 - 97 + 1) + 97);
            caracterNum = (int)(Math.random()*(57 - 48 + 1) + 48);
            sim = (int)(Math.random()* 7);
            pass += simbolos[sim];
            pass += (char)caracterMayus;
            pass += (char)caracterMin;
            pass += (char)caracterNum;
        }
        arrayPass = pass.toCharArray();

        for (int i = 0; i < (arrayPass.length * longitud); i++){
            posRandom = (int)(Math.random() * arrayPass.length);
            if (posicionSuap < arrayPass.length){
                car1 = arrayPass[posicionSuap];
                car2 = arrayPass[posRandom];
                arrayPass[posicionSuap] = car2;
                arrayPass[posRandom] = car1;
            }else {
                posicionSuap = 0;
            }
            posicionSuap++;
        }
        pass = new String(arrayPass);
        this.password = pass;
    }

    public Password(String password){
        this.password = password;
    }

    public Password(int password){
        String value = String.valueOf(password);
        if (value.length() >= 12) {
            this.password = value;
        } else {
            Password segura = new Password();
            this.password = segura.password;
        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword() {
        Password segura = new Password();
        this.password = segura.password;
    }

    public void seyPassword(int password){
        Password segura = new Password(password);
        this.password = segura.password;
    }

    public boolean esFuerte(){
        boolean fuerte = false;
        if (password.matches(VALIDAR)) {
            fuerte = true;
        }
        return fuerte;
    }
}
