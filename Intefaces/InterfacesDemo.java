class InterfacesDemo {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(12345);
        timsPhone.powerOn();
        timsPhone.callPhone(12345);
        timsPhone.dail(12345);
        timsPhone.answer();
    }
}