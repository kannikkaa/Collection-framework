package collectionFramework;

import java.util.HashSet;

class Product{
    String productCode;
    float price;
    Product(String productCode, float price) {
        this.productCode = productCode;
        this.price = price;
    }
@Override
        public int hashCode(){
    return productCode.hashCode();
}
@Override
        public boolean equals(Object obj){
if(this == obj){
    return true;
}
if(obj == null || getClass() != obj.getClass()){
    return false;
}
Product p = (Product) obj;
return this.productCode.equals(p.productCode);
    }

    @Override
    public String toString() {
        return "Product has product code: "+productCode+ " and price: "+price;
    }
}

public class HashSat1 {
    public static void main(String[] args) {
        HashSet<Product> prod = new HashSet<>();
        Product p1 = new Product("p101", 299.99f);
        Product p2 = new Product("p102", 499.99f);
        Product p3 = new Product("p101", 299.99f);
        Product p4 = new Product("p103", 599.99f);//It's about which object was added first, because
        // that’s the one HashSet keeps when duplicates (based on equals() and hashCode()) are found.
        Product p5 = new Product("p102", 699.99f);
prod.add(p1);
        prod.add(p2);
        prod.add(p3);
        prod.add(p4);
        prod.add(p5);
for(Product p: prod){
    System.out.println(p);
}

    }
}
