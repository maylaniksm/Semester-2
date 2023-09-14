package praktikum3;

import java.util.Scanner;

public class User {
    private String namaUser;
    private String passwordUser;
    private int roleUser;
    private boolean statusUser;



    private boolean admin;
    private int userIndex;
    private Object[][] userDB = {
            { "admin", "admin", 0, true },
            { "202110370311147", "UMM_a2021", 1, true },
            { "202110370311145", "UMM_a2021", 1, false }
    };

    public User(String namaUser, String passwordUser, int roleUser, boolean statusUser) {
        this.namaUser = namaUser;
        this.passwordUser = passwordUser;
        this.roleUser = roleUser;
        this.statusUser = statusUser;
        
    }

    
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silakan login terlebih dahulu:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < userDB.length; i++) {
            if (username.equals(userDB[i][0]) && password.equals(userDB[i][1])) {
                found = true;
                setUserIndex(i);
                if ((int) userDB[i][2] == 0) {
                    setAdmin(true);
                }
                dashboard();
                break;
            }
        }

        if (!found) {
            System.out.println("Username atau password salah!");
        }
        
    }

    public void dashboard() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selamat datang, " + userDB[getUserIndex()][0] + "!");
            System.out.println("Pilih menu: ");
            if (isAdmin()) {
                System.out.println("1. Update status mahasiswa");
                System.out.println("2. Update password mahasiswa");
                System.out.println("3. Logout");
            } else {
                System.out.println("1. Lihat informasi akun");
                System.out.println("2. Update password");
                System.out.println("3. Logout");
            }
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (isAdmin()) {
                        updateStatus();
                    } else {
                        System.out.println("Anda tidak memiliki hak akses untuk menu ini.");
                    }
                    break;
                case 2:
                    if (isAdmin()) {
                        updatePasswordMahasiswa();
                    } else {
                        updatePassword();
                    }
                    break;
                case 3:
                    System.out.println("Anda berhasil logout.");
                    scanner.close();
                    login();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    
    public void updateStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < userDB.length; i++) {
            if (nim.equals(userDB[i][0])) {
                found = true;
                userDB[i][3] = !((boolean) userDB[i][3]);
                System.out.println("Status mahasiswa berhasil diupdate.");
                break;
            }
        }
        
        if (!found) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
        
    }
    
    public void updatePasswordMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < userDB.length; i++) {
            if (nim.equals(userDB[i][0])) {
                found = true;
                boolean isLower, isUpper, isNumbers, isSymbols;
                do {
                    System.out.println("Masukkan password baru (minimal 8 karakter dengan setidaknya 1 huruf besar, 1 huruf kecil, 1 angka, dan 1 simbol): ");
                    String newPassword = scanner.nextLine();
                    isLower = isPassLower(newPassword);
                    isUpper = isPassUpper(newPassword);
                    isNumbers = isPassNumbers(newPassword);
                    isSymbols = isPassSymbols(newPassword);
                    if (newPassword.length() < 8 || !isLower || !isUpper || !isNumbers || !isSymbols) {
                        System.out.println("Password tidak memenuhi syarat.");
                    } else {
                        userDB[i][1] = newPassword;
                        System.out.println("Password mahasiswa berhasil diupdate.");
                        break;
                    }
                } while (true);
                break;
            }
        }
    
        if (!found) {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
        
    }
    
    

    
    
    public void updatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan password lama: ");
        String oldPassword = scanner.nextLine();
        if (oldPassword.equals(userDB[getUserIndex()][1])) {
            boolean isLower, isUpper, isNumber, isSymbol;
            do {
                System.out.println("Masukkan password baru: ");
                String newPassword = scanner.nextLine();
                isLower = isPassLower(newPassword);
                isUpper = isPassUpper(newPassword);
                isNumber = isPassNumbers(newPassword);
                isSymbol = isPassSymbols(newPassword);
                if (!(isLower && isUpper && isNumber && isSymbol)) {
                    System.out.println("Password harus terdiri dari setidaknya satu huruf kecil, satu huruf besar, satu angka, dan satu simbol. Silakan coba lagi.");
                } else {
                    userDB[getUserIndex()][1] = newPassword;
                    System.out.println("Password berhasil diupdate.");
                }
            } while (!(isLower && isUpper && isNumber && isSymbol));
        } else {
            System.out.println("Password lama yang dimasukkan salah.");
        }
        
    }
    


    public boolean isPassSymbols(String password) {
        String symbols = "~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
        for (int i = 0; i < password.length(); i++) {
            if (symbols.indexOf(password.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isPassNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean isPassUpper(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    
    public static boolean isPassLower(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    



    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public int getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(int roleUser) {
        this.roleUser = roleUser;
    }

    public boolean getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(boolean statusUser) {
        this.statusUser = statusUser;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }

    public Object[][] getUserDB() {
        return userDB;
    }

    public void setUserDB(Object[][] userDB) {
        this.userDB = userDB;
    }
    public static void main(String[] args) {
        User User = new User("", "", -1, false);
        User.login();
    }
}