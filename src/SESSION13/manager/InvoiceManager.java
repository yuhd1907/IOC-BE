package SESSION13.manager;

import SESSION13.model.Invoice;

import java.util.ArrayList;

public class InvoiceManager implements Manage<Invoice> {
    private ArrayList<Invoice> invoices;

    public InvoiceManager() {
        invoices = new ArrayList<>();
        invoices.add(new Invoice("HD0001", 100000));
    }

    @Override
    public void add(Invoice item) {
        invoices.add(item);
    }

    @Override
    public void update(int index, Invoice item) {
        if (index >= 0 && index < invoices.size()) {
            invoices.set(index, item);
        } else {
            System.err.println("Không tồn tại hóa đơn!");
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < invoices.size()) {
            invoices.remove(index);
        } else {
            System.err.println("Không tồn tại hóa đơn!");
        }
    }

    @Override
    public void display() {
        if (invoices.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            System.out.println("+------------+-----------------+");
            System.out.printf("| %-10s | %-15s |\n", "Mã hóa đơn", "Số tiền");
            System.out.println("+------------+-----------------+");
            for (Invoice invoice : invoices) {
                invoice.displayData();
            }
        }
    }

    public int findIndexById(String id) {
        for (int i = 0; i < invoices.size(); i++) {
            if (invoices.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
