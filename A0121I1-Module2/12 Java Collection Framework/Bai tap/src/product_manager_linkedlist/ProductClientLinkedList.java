package product_manager_linkedlist;

import product.Product;
import java.util.Scanner;

public class ProductClientLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product product1 = new Product();
        System.out.print("Name product.Product? ");
        product1.setName(input.nextLine());
        System.out.print("ID? ");
        product1.setId(input.nextInt());
        Product product2 = new Product(102200345, "Samsung Galaxy S21 Ultra");
        Product product3 = new Product(102200450, "Vivo Y19");
        Product product4 = new Product(302298310, "Iphone 12 Pro Max");
        Product product5 = new Product(240122400, "Lenovo Z6 Pro");
        Product product6 = new Product(583829510, "Sony Xperia XZ");
        Product product7 = new Product(742957139, "Realme 8 Pro");
        Product product8 = new Product(493952031, "Oppo A12");
        Product product9 = new Product(240012977, "Xiaomi Note 10");
        Product product10 = new Product(692502539, "Huawei P30 Pro");

        /*
        khai báo và khởi tạo đối tượng productManagerLinkedList của lớp ProductManagerLinkedList
        Lớp ProductManagerLinkedList sử dụng 1 mảng LinkedList để lưu trữ các phần tử
        Lớp ProductManagerLinkedList cung cấp 1 số phương thức để thao tác dữ liệu product
         */

        ProductManagerLinkedList productManagerLinkedList1 = new ProductManagerLinkedList();
        ProductManagerLinkedList productManagerLinkedList2 = new ProductManagerLinkedList();
        ProductManagerLinkedList productManagerLinkedList3 = new ProductManagerLinkedList();
        ProductManagerLinkedList productManagerLinkedList4 = new ProductManagerLinkedList();

        /*
        Phương thức showProduct(Product product) giúp hiển thị thông tin của 1 product.Product
         */

        System.out.println("Sử dụng phương thức showProduct: showProduct1");
        productManagerLinkedList1.showProduct(product1);
        System.out.println("---------------------------------------------------------------------------------");

         /*
        Phương thức addProduct(Product product) giúp thêm 1 phần tử vào cuối danh sách, và hàm trả về kiểu boolean
         */

        System.out.println("Sử dụng phương thức addFirstProduct: thêm product1 vào đầu danh sách liên kết");
        productManagerLinkedList1.addFirstProduct(product1);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Sử dụng phương thức addLastProduct: thêm product2 -> product5 vào cuối danh sách liên kết");
        productManagerLinkedList1.addLastProduct(product2);
        productManagerLinkedList1.addLastProduct(product3);
        productManagerLinkedList1.addLastProduct(product4);
        productManagerLinkedList1.addLastProduct(product5);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức showAllProduct(ProductManager productManager)
        giúp hiển thị tất cả thông tin của product trong ArrayList
         */
        System.out.println("Sử dụng phương thức showAllProduct: show product1 -> product5");
        productManagerLinkedList1.showAllProduct(productManagerLinkedList1);
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Sử dụng phương thức addFirstProduct: thêm product6 vào productManager2");
        productManagerLinkedList2.addFirstProduct(product6);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Sử dụng phương thức addLastProduct: thêm các product 7, 9, 10 vào danh sách");
        productManagerLinkedList2.addLastProduct(product7);
        productManagerLinkedList2.addLastProduct(product9);
        productManagerLinkedList2.addLastProduct(product10);
        productManagerLinkedList2.showAllProduct(productManagerLinkedList2);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức insertProduct(int index, Product product) giúp chèn 1 product được chỉ định vào ArrayList
         */
        System.out.println("Sử dụng phương thức insertProduct: insertProduct(product8)");
        productManagerLinkedList2.insertProduct(2, product8);
        System.out.println("Sau khi insert:");
        productManagerLinkedList2.showAllProduct(productManagerLinkedList2);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức addAllProduct(int index, ProductManagerLinkedList Collection)
        giúp thêm tất cả product của 1 Collection chỉ định vào Collection gọi đến phương thức này
         */
        System.out.println("Sử dụng phương thức addAllProduct:" +
                " add tất cả phần tử product ở Collection productManager2 vào Collection productManager1 ");
        productManagerLinkedList1.addAllProduct(productManagerLinkedList2);
        System.out.println("Sau khi add Collection productManager2 vào collection productManager1: ");
        productManagerLinkedList1.showAllProduct(productManagerLinkedList1);
        System.out.println("---------------------------------------------------------------------------------");
        productManagerLinkedList3.addFirstProduct(product3);
        productManagerLinkedList3.addLastProduct(product4);
        productManagerLinkedList3.addLastProduct(product5);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức getFirstProduct() lấy product đầu tiên trong danh sách và trả về product đó
         */
        System.out.println("Sử dụng phương thức getFirst() với productManager1: ");
        Product getProductFirst = productManagerLinkedList1.getFirstProduct();
        System.out.println("Product đầu tiên là " + getProductFirst.toString());
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức getLastProduct() lấy product cuối cùng trong danh sách và trả về product đó
         */
        System.out.println("Sử dụng phương thức getLast() với productManagerLinkedList1: ");
        Product getLastProduct = productManagerLinkedList1.getLastProduct();
        System.out.println("Product cuối cùng là " + getLastProduct.toString());
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức getProduct(int index) giúp lấy 1 product trong danh sách liên kết tại vị trí index chỉ định
         */
        System.out.println("Sử dụng phương thức getProduct(int index): lấy product tại vị trí index = 4");
        Product getProduct = productManagerLinkedList1.getProduct(4);
        System.out.println("Product tại index = 4 là " + getProduct.toString());
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức insertAllProduct(int index, ProductManagerLinkedList Collection) giúp chèn
        tất cả product của 1 Collection chỉ định vào Collection gọi đến phương thức này, bắt đầu tại vị trí index
         */
        System.out.println("Sử dụng phương thức insertAllProduct: insert Collection productManager3" +
                " vào Collection productManager2");
        System.out.println("Trước khi insert Collection: ");
        productManagerLinkedList2.showAllProduct(productManagerLinkedList2);
        System.out.println("Sau khi insert Collection");
        productManagerLinkedList2.insertAllProduct(1, productManagerLinkedList3);
        productManagerLinkedList2.showAllProduct(productManagerLinkedList2);
        System.out.println("---------------------------------------------------------------------------------");
        productManagerLinkedList4.addFirstProduct(product1);
        productManagerLinkedList4.addLastProduct(product2);
        productManagerLinkedList4.addLastProduct(product3);
        productManagerLinkedList4.addLastProduct(product4);
        productManagerLinkedList4.addLastProduct(product5);

        /*
        Phương thức deleteProduct(Product product) giúp xóa 1 product.Product khỏi danh sách ArrayList
         */
        System.out.println("Sử dụng phương thức deleteProduct: delete product4 trong productManager4");
        System.out.println("Trước khi xóa product4: ");
        productManagerLinkedList4.showAllProduct(productManagerLinkedList4);
        System.out.println("Sau khi xóa product4: ");
        productManagerLinkedList4.deleteProduct(product4);
        productManagerLinkedList4.showAllProduct(productManagerLinkedList4);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức removeProduct(Product product) giúp xóa 1 phần tử khỏi danh sách và trả về phần tử (product) đó
         */
        System.out.println("Sử dụng phương thức removeProduct(product.Product product): " +
                "remove product1 trong productManager4");
        System.out.println("Trước khi remove product1: ");
        productManagerLinkedList4.showAllProduct(productManagerLinkedList4);
        Product receiveProduct1;
        receiveProduct1 = productManagerLinkedList4.removeProduct(product1);
        System.out.println("Sau khi remove product1: ");
        productManagerLinkedList4.showAllProduct(productManagerLinkedList4);
        System.out.print("Product được trả về là: ");
        System.out.print(receiveProduct1);
        System.out.println("\n---------------------------------------------------------------------------------");

        /*
        Phương thức removeProduct(int index) giúp xóa 1 product khỏi danh sách tại vị trí index và trả về product đó
         */
        System.out.println("Sử dụng phương thức removeProduct(int index): remove product tại index = 1");
        System.out.println("Trước khi remove: ");
        productManagerLinkedList4.showAllProduct(productManagerLinkedList4);
        Product receiveProduct2;
        receiveProduct2 = productManagerLinkedList4.removeProduct(1);
        System.out.println("Sau khi remove: ");
        productManagerLinkedList4.showAllProduct(productManagerLinkedList4);
        System.out.print("Product được trả về là: ");
        System.out.print(receiveProduct2);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức searchProduct() giúp tìm kiếm 1 product trong danh sách
         */
        productManagerLinkedList1.showAllProduct(productManagerLinkedList1);
        System.out.println("Sử dụng phương thức searchProduct(): ");
        Product searchProduct = productManagerLinkedList1.searchProduct();
        System.out.println("Giá trị trả về là: " + searchProduct.toString());
        System.out.println("Tìm product8 trong productManagerLinkedList1: ");
        productManagerLinkedList1.searchProduct(product8);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức searchProduct(Product product) giúp tìm kiếm 1 product chỉ định trong danh sách
         */
        System.out.println("Sử dụng phương thức sapXepProduct() với Collection productManager1: ");
        System.out.println("Trước khi sắp xếp ID: ");
        productManagerLinkedList1.showAllProduct(productManagerLinkedList1);
        System.out.println("Sau khi sắp xếp ID: ");
        productManagerLinkedList1.sapXepProduct();
        productManagerLinkedList1.showAllProduct(productManagerLinkedList1);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức changeInfoProduct(Product product) giúp thay đổi product được chỉ định
         */
        System.out.println("Sử dụng phương thức changeInfoProduct(product.Product product)" +
                " thay đổi product3 với Collection productManager1: ");
        productManagerLinkedList1.changeInfoProduct(product3);

        /*
        Phương thức changeInfoProduct(int index) giúp thay đổi product tại vị trí index chỉ định
         */
        System.out.println("Sử dụng phương thức changeInfoProduct(int index) thay đổi" +
                " product tại vị trí index = 5 với Collection productManager1: ");
        productManagerLinkedList1.changeInfoProduct(5);
    }
}
