public class Akun{
    private String username;
    private String password;
    private String email;
    private int pinAngka;

    // Setter
    public void setUsername(String userName){
        this.username = userName;
    }


    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPin(int pin){
        this.pinAngka = pin;
    }

    // getter
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPin(){
        return this.pinAngka;
    }

    // method
    public boolean isPasswordValid(){
        int len = this.password.length();
        return (len >= 8);
    }

    public boolean isEmailValid(){
        boolean a = this.email.contains("@");
        boolean b = this.email.contains(".");
        return (a && b);
    }

    // detail
    public void detailAkun(){
        String id = this.username.concat(this.password);
        System.out.println("--- Detail Akun ---");
        System.out.println("Username (Lowercase)   :" + this.username.toLowerCase());
        System.out.println("Email (Uppercase)      :" + this.email.toUpperCase());
        System.out.println("Id Pengguna (Gabungan) :" + id);
    }
}