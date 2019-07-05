public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public void powerOn() {
        System.out.println("No action ,desk phone does not have power button");
    }

    public void dail(int phoneNumber) {
        System.out.println("Now Ringing" + phoneNumber + "on deskphone");
    }

    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Desk phone");
            isRinging = false;
        }
    }

    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    public boolean isRinging() {
        return isRinging;
    }
}