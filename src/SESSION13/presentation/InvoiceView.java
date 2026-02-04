package SESSION13.presentation;

import SESSION13.manager.InvoiceManager;
import SESSION13.model.Invoice;

import java.util.Scanner;

public class InvoiceView {
    private static final InvoiceManager invoiceManager = new InvoiceManager();

    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n**************** MENU QUẢN LÝ HÓA ĐƠN ****************");
            System.out.println("""
                    1. Thêm hóa đơn
                    2. Sửa hóa đơn
                    3. Xóa hóa đơn
                    4. Hiển thị danh sách hóa đơn
                    5. Thoát
                    """);
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addInvoice(scanner);
                    break;
                case 2:
                    updateInvoice(scanner);
                    break;
                case 3:
                    deleteInvoice(scanner);
                    break;
                case 4:
                    invoiceManager.display();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.err.println("Lựa chọn không tồn tại. Vui lòng chọn lại!!!");
            }
        }
    }

    private static void addInvoice(Scanner scanner) {
        Invoice invoice = new Invoice();
        invoice.inputData(scanner);
        invoiceManager.add(invoice);
        System.out.println("Hóa đơn đã được thêm thành công.");
    }

    private static void updateInvoice(Scanner scanner) {
        System.out.print("Nhập id hóa đơn cần sửa: ");
        String id = scanner.nextLine();
        int index = invoiceManager.findIndexById(id);

        if (index != -1) {
            Invoice newInvoice = new Invoice();
            newInvoice.setId(id);

            while (true) {
                System.out.print("Nhập số tiền mới: ");
                double amount = Double.parseDouble(scanner.nextLine());
                if (amount >= 0) {
                    newInvoice.setAmount(amount);
                    break;
                } else {
                    System.err.println("Vui lòng nhập số thực >= 0 !");
                }
            }

            invoiceManager.update(index, newInvoice);
            System.out.println("Hóa đơn đã được sửa thành công.");
        } else {
            System.err.println("Không tìm thấy hóa đơn nào có id = " + id);
        }
    }

    private static void deleteInvoice(Scanner scanner) {
        System.out.print("Nhập id hóa đơn cần xóa: ");
        String id = scanner.nextLine();
        int index = invoiceManager.findIndexById(id);

        if (index != -1) {
            invoiceManager.delete(index);
            System.out.println("Hóa đơn đã được xóa thành công.");
        } else {
            System.err.println("Không tìm thấy hóa đơn nào có id = " + id);
        }
    }
}
