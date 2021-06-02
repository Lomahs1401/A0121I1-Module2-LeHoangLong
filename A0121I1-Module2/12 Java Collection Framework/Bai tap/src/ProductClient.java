import java.util.Scanner;

public class ProductClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product product1 = new Product();
        System.out.print("Name Product? ");
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
        khai báo và khởi tạo đối tượng productManager của lớp ProductManager
        Lớp ProductManager sử dụng 1 mảng ArrayList để lưu trữ các phần tử
        Lớp ProductManager cung cấp 1 số phương thức để thao tác dữ liệu product
         */

        ProductManagerArrayList productManagerArrayList1 = new ProductManagerArrayList();
        ProductManagerArrayList productManagerArrayList2 = new ProductManagerArrayList();
        ProductManagerArrayList productManagerArrayList3 = new ProductManagerArrayList();
        ProductManagerArrayList productManagerArrayList4 = new ProductManagerArrayList();

        /*
        Phương thức showProduct(Product product) giúp hiển thị thông tin của 1 Product
         */

        System.out.println("Sử dụng phương thức showProduct: showProduct1");
        productManagerArrayList1.showProduct(product1);
        System.out.println("---------------------------------------------------------------------------------");

         /*
        Phương thức addProduct(Product product) giúp thêm 1 phần tử vào cuối danh sách, và hàm trả về kiểu boolean
         */

        System.out.println("Sử dụng phương thức addProduct: thêm các product1 -> product5 vào productManager1");
        productManagerArrayList1.addProduct(product1);
        productManagerArrayList1.addProduct(product2);
        productManagerArrayList1.addProduct(product3);
        productManagerArrayList1.addProduct(product4);
        productManagerArrayList1.addProduct(product5);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức showAllProduct(ProductManager productManager)
        giúp hiển thị tất cả thông tin của Product trong ArrayList
         */
        System.out.println("Sử dụng phương thức showAllProduct: show product1 -> product5");
        productManagerArrayList1.showAllProduct(productManagerArrayList1);
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Sử dụng phương thức addProduct: thêm các product vào productManager2");
        productManagerArrayList2.addProduct(product6);
        productManagerArrayList2.addProduct(product7);
        productManagerArrayList2.addProduct(product9);
        productManagerArrayList2.addProduct(product10);
        productManagerArrayList2.showAllProduct(productManagerArrayList2);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức insertProduct(int index, Product product) giúp chèn 1 product được chỉ định vào ArrayList
         */
        System.out.println("Sử dụng phương thức insertProduct: insertProduct(product8)");
        productManagerArrayList2.insertProduct(2, product8);
        System.out.println("Sau khi insert:");
        productManagerArrayList2.showAllProduct(productManagerArrayList2);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức addAllProduct(int index, ProductManager productManager)
        giúp thêm tất cả product của 1 Collection chỉ định vào Collection gọi đến phương thức này
         */
        System.out.println("Sử dụng phương thức addAllProduct:" +
                " add tất cả phần tử product ở Collection productManager2 vào Collection productManager1 ");
        productManagerArrayList1.addAllProduct(productManagerArrayList2);
        System.out.println("Sau khi add Collection productManager2 vào collection productManager1: ");
        productManagerArrayList1.showAllProduct(productManagerArrayList1);
        System.out.println("---------------------------------------------------------------------------------");
        productManagerArrayList3.addProduct(product3);
        productManagerArrayList3.addProduct(product4);
        productManagerArrayList3.addProduct(product5);

        /*
        Phương thức insertAllProduct(int index, ProductManager productManager) giúp chèn tất cả product của 1 Collection
        chỉ định vào Collection gọi đến phương thức này, bắt đầu tại vị trí index
         */
        System.out.println("Sử dụng phương thức insertAllProduct: insert Collection productManager3" +
                " vào Collection productManager2");
        System.out.println("Trước khi insert Collection: ");
        productManagerArrayList2.showAllProduct(productManagerArrayList2);
        System.out.println("Sau khi insert Collection");
        productManagerArrayList2.insertAllProduct(1, productManagerArrayList3);
        productManagerArrayList2.showAllProduct(productManagerArrayList2);
        System.out.println("---------------------------------------------------------------------------------");
        productManagerArrayList4.addProduct(product1);
        productManagerArrayList4.addProduct(product2);
        productManagerArrayList4.addProduct(product3);
        productManagerArrayList4.addProduct(product4);
        productManagerArrayList4.addProduct(product5);

        /*
        Phương thức deleteProduct(Product product) giúp xóa 1 Product khỏi danh sách ArrayList
         */
        System.out.println("Sử dụng phương thức deleteProduct: delete product4 trong productManager3");
        System.out.println("Trước khi xóa product4: ");
        productManagerArrayList3.showAllProduct(productManagerArrayList3);
        System.out.println("Sau khi xóa product4: ");
        productManagerArrayList3.deleteProduct(product4);
        productManagerArrayList3.showAllProduct(productManagerArrayList3);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức removeProduct(Product product) giúp xóa 1 phần tử khỏi danh sách và trả về phần tử (product) đó
         */
        System.out.println("Sử dụng phương thức removeProduct(Product product): remove product1 trong productManager4");
        System.out.println("Trước khi remove product1: ");
        productManagerArrayList4.showAllProduct(productManagerArrayList4);
        Product receiveProduct1;
        receiveProduct1 = productManagerArrayList4.removeProduct(product1);
        System.out.println("Sau khi remove product1: ");
        productManagerArrayList4.showAllProduct(productManagerArrayList4);
        System.out.print("Product được trả về là: ");
        System.out.print(receiveProduct1);
        System.out.println("\n---------------------------------------------------------------------------------");

        /*
        Phương thức removeProduct(int index) giúp xóa 1 product khỏi danh sách tại vị trí index và trả về product đó
         */
        System.out.println("Sử dụng phương thức removeProduct(int index): remove product tại index = 1");
        System.out.println("Trước khi remove: ");
        productManagerArrayList4.showAllProduct(productManagerArrayList4);
        Product receiveProduct2;
        receiveProduct2 = productManagerArrayList4.removeProduct(1);
        System.out.println("Sau khi remove: ");
        productManagerArrayList4.showAllProduct(productManagerArrayList4);
        System.out.print("Product được trả về là: ");
        System.out.print(receiveProduct2);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức searchProduct() giúp tìm kiếm 1 product trong danh sách
         */
        productManagerArrayList1.showAllProduct(productManagerArrayList1);
        System.out.println("Sử dụng phương thức searchProduct(): ");
        Product searchProduct = productManagerArrayList1.searchProduct();
        System.out.println("Giá trị trả về là: " + searchProduct.toString());
        System.out.println("Tìm product8 trong productManager1");
        productManagerArrayList1.searchProduct(product8);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức searchProduct(Product product) giúp tìm kiếm 1 product chỉ định trong danh sách
         */
        System.out.println("Sử dụng phương thức sapXepProduct() với Collection productManager1: ");
        System.out.println("Trước khi sắp xếp ID: ");
        productManagerArrayList1.showAllProduct(productManagerArrayList1);
        System.out.println("Sau khi sắp xếp ID: ");
        productManagerArrayList1.sapXepProduct();
        productManagerArrayList1.showAllProduct(productManagerArrayList1);
        System.out.println("---------------------------------------------------------------------------------");

        /*
        Phương thức changeInforProduct(Product product) giúp thay đổi product được chỉ định
         */
        System.out.println("Sử dụng phương thức changeInforProduct(Product product)" +
                " thay đổi product3 với Collection productManager1: ");
        productManagerArrayList1.changeInforProduct(product3);

        /*
        Phương thức changeInforProduct(int index) giúp thay đổi product tại vị trí index chỉ định
         */
        System.out.println("Sử dụng phương thức changeInforProduct(int index) thay đổi" +
                " product tại vị trí index = 5 với Collection productManager1: ");
        productManagerArrayList1.changeInforProduct(5);
    }
}
