package SESSION14;

public class InvalidPhoneNumberLengthException extends Exception {

    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }

    // Phương thức kiểm tra số điện thoại
    public static void validatePhoneNumber(String phone)
            throws InvalidPhoneNumberLengthException {

        // Kiểm tra độ dài
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberLengthException("Sai độ dài (phải đủ 10 chữ số)");
        }

        // Kiểm tra ký tự không hợp lệ
        if (!phone.matches("\\d+")) {
            throw new InvalidPhoneNumberLengthException("Chứa ký tự không hợp lệ");
        }
    }
}
