package SESSION05;

public class so_sanh_hieu_xuat {
    public static void main(String[] args) {
        final int LOOP = 1000000;

        // ===== 1. String =====
        String str = "Hello";
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < LOOP; i++) {
            str += "World";
        }

        long endTime = System.currentTimeMillis();
        long stringTime = endTime - startTime;

        // ===== 2. StringBuilder =====
        StringBuilder sb = new StringBuilder("Hello");
        startTime = System.currentTimeMillis();

        for (int i = 0; i < LOOP; i++) {
            sb.append("World");
        }

        endTime = System.currentTimeMillis();
        long builderTime = endTime - startTime;

        // ===== 3. StringBuffer =====
        StringBuffer sbf = new StringBuffer("Hello");
        startTime = System.currentTimeMillis();

        for (int i = 0; i < LOOP; i++) {
            sbf.append("World");
        }

        endTime = System.currentTimeMillis();
        long bufferTime = endTime - startTime;

        // ===== Kết quả =====
        System.out.println("===== KẾT QUẢ SO SÁNH =====");
        System.out.println("String        : " + stringTime + " ms");
        System.out.println("StringBuilder : " + builderTime + " ms");
        System.out.println("StringBuffer  : " + bufferTime + " ms");

        // ===== Nhận xét =====
        System.out.println("\n===== NHẬN XÉT =====");
        System.out.println("- String chậm nhất do tạo object mới mỗi lần nối.");
        System.out.println("- StringBuilder nhanh nhất, phù hợp môi trường đơn luồng.");
        System.out.println("- StringBuffer chậm hơn StringBuilder do đồng bộ (thread-safe).");
    }
}
