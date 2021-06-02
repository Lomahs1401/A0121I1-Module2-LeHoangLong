import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagerArrayList {
    //Sử dụng lớp ArrayList để lưu danh sách sản phẩm
    ArrayList<Product> productArrayList = new ArrayList<>(10);
    Scanner input = new Scanner(System.in);

    //Constructor
    public ProductManagerArrayList() {
    }

    // Thêm 1 product vào cuối danh sách ArrayList
    public void addProduct(Product product){
        productArrayList.add(product);
    }

    // Thêm tất cả các phần tử của collection vào ArrayList ở cuối danh sách
    public void addAllProduct(ProductManagerArrayList productManagerArrayList) {
        productArrayList.addAll(productManagerArrayList.productArrayList);

    }

    // Chèn 1 product tại 1 vị trí index chỉ định trong ArrayList
    public void insertProduct(int index, Product product) {
        if (index > productArrayList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            productArrayList.add(index, product);
        }
    }

    // Chèn tất cả các phần tử của collection vào ArrayList tại vị trí index
    public void insertAllProduct(int index, ProductManagerArrayList productManagerArrayList) {
        if (index > productArrayList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            productArrayList.addAll(index, productManagerArrayList.productArrayList);
        }
    }

    // Xóa 1 product và không trả về product đó
    public void deleteProduct(Product product) {
        if (productArrayList.contains(product)) {
            productArrayList.remove(product);
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Trả về 1 product được chỉ định
    public Product removeProduct(Product product) {
        if (productArrayList.contains(product)) {
            return productArrayList.remove(productArrayList.indexOf(product));
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Trả về 1 product tại 1 vị trí index được chỉ định
    public Product removeProduct(int index) {
        Product product;
        if (index > productArrayList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            product = productArrayList.remove(index);
        }
        return product;
    }

    // Tìm kiếm 1 product
    public Product searchProduct() {
        Product product = null;
        int id;
        String name;
        boolean check;
        boolean isExist = false;
        do {
            check = false;
            System.out.println("Tìm product theo ID hay theo tên của product?");
            System.out.println("0. ID \n1. Name of product");
            int choose = input.nextInt();
            switch (choose) {
                case 0: {
                    System.out.println("Nhập ID cần tìm: ");
                    id = input.nextInt();
                    for (Product value : productArrayList) {
                        if (value.getId() == id) {
                            product = value;
                            isExist = true;
                            System.out.printf("Product có ID %d có trong danh sách!\n", id);
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.printf("Không tìm thấy product có ID %d cần tìm!\n", id);
                    }
                    break;
                }
                case 1: {
                    System.out.println("Nhập tên Product cần tìm: ");
                    name = input.nextLine();
                    for (Product value : productArrayList) {
                        if (value.getName().equals(name)) {
                            product = value;
                            isExist = true;
                            System.out.printf("Product %s có trong danh sách!\n", name);
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.printf("Không tìm thấy tên product %s cần tìm!\n", name);
                    }
                    break;
                }
                default: {
                    System.out.println("Mời nhập lại");
                    check = true;
                }
            }
        } while (check);
        return product;
    }
    // Tìm kiếm 1 product được chỉ định
    public void searchProduct(Product product) {
        for (int i = 0; i < productArrayList.size(); ++i) {
            if (productArrayList.get(i).equals(product)) {
                System.out.println("Product cần tìm có trong danh sách, ở vị trí index: " + i);
                break;
            }
        }
     }

    // Sắp xếp ID product theo thứ tự tăng dần
    public void sapXepProduct() {
        Collections.sort(productArrayList);
    }

    // Thay đổi thông tin của 1 product tại chỉ mục index truyền vào
    public void changeInforProduct(int index) {
        //trả về phần tử product trong productArrayList và gán vào biến product
        Product product = productArrayList.get(index);
        int choice;
        if (index > productArrayList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            boolean check;
            do {
                check = false;
                System.out.println("Bạn muốn sửa thông tin nào?");
                System.out.println("0. ID \n1. Name Product: ");
                choice = input.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.print("Nhập lại ID của Product: ");
                        product.setId(input.nextInt());
                        System.out.println("Đã thay đổi thành công!");
                        break;
                    }
                    case 1: {
                        System.out.print("Nhập lại tên của Product: ");
                        product.setName(input.nextLine());
                        System.out.println("Đã thay đổi thành công!");
                        break;
                    }
                    default: {
                        System.out.println("Nhập sai tính năng. Mời nhập lại!");
                        check = true;
                    }
                }
            }while(check);
        }
        System.out.printf("Sau khi thay đổi, product tại index %d có thông tin mới là", index);
        System.out.println(product.toString());
    }

    //Hàm thay đổi 1 product được chỉ đinh
    public void changeInforProduct(Product product) {
        boolean check;
        do {
            check = false;
            System.out.println("Bạn muốn sửa thông tin nào?");
            System.out.println("0. ID \n1. Name Product");
            int choose = input.nextInt();
            switch (choose) {
                case 0: {
                    System.out.print("Nhập lại ID của Product: ");
                    product.setId(input.nextInt());
                    System.out.println("Đã thay đổi thành công!");
                    break;
                }
                case 1: {
                    System.out.print("Nhập lại tên của Product: ");
                    product.setName(input.nextLine());
                    System.out.println("Đã thay đổi thành công!");
                    break;
                }
                default: {
                    System.out.println("Nhập sai tính năng. Mời nhập lại!");
                    check = true;
                }
            }
        } while (check);
        System.out.print("Sau khi thay đổi, product có thông tin mới là: ");
        System.out.println(product.toString());
    }

    //Hàm in ra thông tin 1 product
    public void showProduct(Product product) {
        System.out.println(product.toString());
    }

    //Hàm in ra tất cả thông tin của product trong ArrayList
    public void showAllProduct(ProductManagerArrayList productManagerArrayList) {
        for (Product product : productManagerArrayList.productArrayList) {
            System.out.println(product.toString());
        }
    }
}
