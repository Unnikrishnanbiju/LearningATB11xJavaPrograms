package ex_13_Construtors; // ✅ Package declaration (optional)

public class ex_174_ex2 { // ✅ Main class
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation(); // ✅ Creating an object
    }
}

class WebAutomation { // ✅ Corrected class definition

    // ✅ Constructor with the same name as the class (No return type)
    WebAutomation() {
        System.out.println("I want to read the file");
        System.out.println("Open the package");
    }
}
