package product_manager_linkedlist;

import product.Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList {
    Scanner input = new Scanner(System.in);
    //Sử dụng lớp LinkedList để lưu danh sách sản phẩm
    LinkedList<Product> productLinkedList = new LinkedList<>();

    //Constructor
    public ProductManagerLinkedList() {
    }

    // Thêm 1 product chỉ đinh vào đầu danh sách liên kết
    public void addFirstProduct(Product product) {
        productLinkedList.addFirst(product);
    }

    // Thêm 1 product chỉ định vào cuối danh sách liên kết
    public void addLastProduct(Product product) {
        productLinkedList.addLast(product);
    }

    // Thêm tất cả các phần tử của Collection chỉ đinh vào cuối danh sách liên kết của Collection hiện tại
    public void addAllProduct(ProductManagerLinkedList collection) {
        productLinkedList.addAll(collection.productLinkedList);
    }

    // Chèn 1 product chỉ định vào 1 vị trí index chỉ định
    public void insertProduct(int index, Product product) {
        if (index > productLinkedList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            productLinkedList.add(index, product);
        }
    }

    // Chèn tất cả các phần tử của Collection chỉ định bắt đầu từ vị trí index của Collection hiện tại
    public void insertAllProduct(int index, ProductManagerLinkedList collection) {
        if (index > productLinkedList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            productLinkedList.addAll(index, collection.productLinkedList);
        }
    }

    // Xóa 1 product và không trả về product đó
    public void deleteProduct(Product product) {
        if (productLinkedList.contains(product)) {
            productLinkedList.remove(product);
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Xóa 1 product được chỉ định và trả về 1 product đó
    public Product removeProduct(Product product) {
        if (productLinkedList.contains(product)) {
            return productLinkedList.remove(productLinkedList.indexOf(product));
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Xóa 1 product tại vị trí index chỉ định và trả về product đó
    public Product removeProduct(int index) {
        if (index > productLinkedList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            return productLinkedList.remove(index);
        }
    }

    // Trả về product tại vị trí index chỉ định trong danh sách
    public Product getProduct(int index) {
        if (index > productLinkedList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            return productLinkedList.get(index);
        }
    }

    // Trả về product đầu tiên trong danh sách liên kết
    public Product getFirstProduct() {
        return productLinkedList.getFirst();
    }

    // Trả về product cuối cùng trong danh sách liên kết
    public Product getLastProduct() {
        return productLinkedList.getLast();
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
                    for (Product value : productLinkedList) {
                        if (value.getId() == id) {
                            product = value;
                            isExist = true;
                            System.out.printf("product có ID %d có trong danh sách!\n", id);
                            break;
                        }
                    }
                    if (!isExist) {
                        System.out.printf("Không tìm thấy product có ID %d cần tìm!\n", id);
                    }
                    break;
                }
                case 1: {
                    System.out.println("Nhập tên product cần tìm: ");
                    name = input.nextLine();
                    for (Product value : productLinkedList) {
                        if (value.getName().equals(name)) {
                            product = value;
                            isExist = true;
                            System.out.printf("product %s có trong danh sách!\n", name);
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
        boolean flag = false;
        for (int i = 0; i < productLinkedList.size(); ++i) {
            if (productLinkedList.get(i).equals(product)) {
                System.out.println("product cần tìm có trong danh sách, ở vị trí index: " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy product cần tìm!\n");
        }
    }

    // Sắp xếp ID product theo thứ tự tăng dần
    public void sapXepProduct() {
        Collections.sort(productLinkedList);
    }

    // Thay đổi thông tin của 1 product tại chỉ mục index chỉ định
    public void changeInfoProduct(int index) {
        //trả về phần tử product trong productArrayList và gán vào biến product
        Product product = productLinkedList.get(index);
        int choice;
        if (index > productLinkedList.size() - 1 || index < 0) {
            throw new IllegalArgumentException();
        } else {
            boolean check;
            do {
                check = false;
                System.out.println("Bạn muốn sửa thông tin nào?");
                System.out.println("0. ID \n1. Name product.Product: ");
                choice = input.nextInt();
                switch (choice) {
                    case 0: {
                        System.out.print("Nhập lại ID của product: ");
                        product.setId(input.nextInt());
                        System.out.println("Đã thay đổi thành công!");
                        break;
                    }
                    case 1: {
                        System.out.print("Nhập lại tên của product: ");
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

    // Thay đổi thông tin của 1 product được chỉ định
    public void changeInfoProduct(Product product) {
        boolean check;
        do {
            check = false;
            System.out.println("Bạn muốn sửa thông tin nào?");
            System.out.println("0. ID \n1. Name product.Product");
            int choose = input.nextInt();
            switch (choose) {
                case 0: {
                    System.out.print("Nhập lại ID của product.Product: ");
                    product.setId(input.nextInt());
                    System.out.println("Đã thay đổi thành công!");
                    break;
                }
                case 1: {
                    System.out.print("Nhập lại tên của product.Product: ");
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

    // In ra thông tin của 1 product trong danh sách liên kết
    public void showProduct(Product product) {
        System.out.println(product.toString());
    }

    // In ra thông tin của tất cả product trong danh sách liên kết
    public void showAllProduct(ProductManagerLinkedList managerLinkedList) {
        for (Product product : managerLinkedList.productLinkedList) {
            System.out.println(product.toString());
        }
    }
}
