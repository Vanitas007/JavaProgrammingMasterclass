package s11_InnerAndAbstractClassesAndInterfaces.a148_Interfaces;

public class Main {
    public static void main(String[] args) {

        ITelephone timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123455);
        timsPhone.answer();
    }
}
