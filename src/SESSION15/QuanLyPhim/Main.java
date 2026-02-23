package SESSION15.QuanLyPhim;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static MovieManager<Movie> manager = new MovieManager<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Thêm phim");
            System.out.println("2. Xóa phim");
            System.out.println("3. Sửa phim");
            System.out.println("4. Hiển thị phim");
            System.out.println("5. Tìm kiếm phim theo tên");
            System.out.println("6. Lọc phim theo rating");
            System.out.println("7. Thoát");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addMovie();
                case 2 -> deleteMovie();
                case 3 -> updateMovie();
                case 4 -> displayMovies();
                case 5 -> searchMovie();
                case 6 -> filterMovie();
                case 7 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Chức năng không hợp lệ!");
            }
        }
    }

    static void addMovie() {
        try {
            System.out.print("Nhập ID phim: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập tiêu đề phim: ");
            String title = sc.nextLine();

            System.out.print("Nhập đạo diễn: ");
            String director = sc.nextLine();

            System.out.print("Nhập ngày phát hành (yyyy-MM-dd): ");
            LocalDate date = LocalDate.parse(sc.nextLine());

            System.out.print("Nhập rating: ");
            double rating = Double.parseDouble(sc.nextLine());

            manager.addMovie(new Movie(id, title, director, date, rating));
            System.out.println("Phim đã được thêm thành công.");

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: ID hoặc Rating phải là số!");
        } catch (DateTimeParseException e) {
            System.out.println("Lỗi: Sai định dạng ngày (yyyy-MM-dd)!");
        }
    }

    static void deleteMovie() {
        System.out.print("Nhập ID phim cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        if (manager.deleteMovie(id))
            System.out.println("Phim đã được xóa thành công.");
        else
            System.out.println("Không tìm thấy phim muốn xóa!");
    }

    static void updateMovie() {
        System.out.print("Nhập ID phim muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());

        Movie movie = manager.findById(id);
        if (movie == null) {
            System.out.println("Không tìm thấy phim với id = " + id);
            return;
        }

        try {
            System.out.print("Nhập tiêu đề mới: ");
            movie.setTitle(sc.nextLine());

            System.out.print("Nhập đạo diễn mới: ");
            movie.setDirector(sc.nextLine());

            System.out.print("Nhập ngày phát hành mới (yyyy-MM-dd): ");
            movie.setReleaseDate(LocalDate.parse(sc.nextLine()));

            System.out.print("Nhập rating mới: ");
            movie.setRating(Double.parseDouble(sc.nextLine()));

            System.out.println("Cập nhật phim thành công!");

        } catch (Exception e) {
            System.out.println("Lỗi nhập dữ liệu!");
        }
    }

    static void displayMovies() {
        List<Movie> list = manager.getAll();
        if (list.isEmpty()) {
            System.out.println("Danh sách phim trống.");
            return;
        }
        list.forEach(System.out::println);
    }

    static void searchMovie() {
        System.out.print("Nhập tiêu đề phim để tìm kiếm: ");
        String keyword = sc.nextLine();

        List<Movie> result = manager.findByTitle(keyword);
        if (result.isEmpty())
            System.out.println("Không tìm thấy phim");
        else
            result.forEach(System.out::println);
    }

    static void filterMovie() {
        System.out.print("Nhập rating tối thiểu để lọc: ");
        double minRating = Double.parseDouble(sc.nextLine());

        List<Movie> result = manager.filterByRating(minRating);
        if (result.isEmpty())
            System.out.println("Không có phim nào thỏa điều kiện.");
        else
            result.forEach(System.out::println);
    }
}
