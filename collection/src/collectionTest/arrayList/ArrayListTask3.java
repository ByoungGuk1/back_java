package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3 {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		
		products.add(new Product(1L, "컴퓨터", 800000, 20));
		products.add(new Product(2L, "책상", 150000, 100));
		products.add(new Product(3L, "마우스", 50000, 15));
		products.add(new Product(4L, "모니터", 300000, 150));
		products.add(new Product(5L, "키보드", 30000, 80));

//		System.out.println(products);

//		재고가 100개 이상인 상품만 출력
		System.out.println("재고가 100개 이상인 상품만 출력 ver.1");
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getStock() >= 100) {
				System.out.println(products.get(i));
			}
		}

		System.out.println();
		
		System.out.println("재고가 100개 이상인 상품만 출력 ver.2");
		products.forEach((data)->{
			if(data.getStock() >= 100) {
				System.out.println(data);
			}
		});

		System.out.println();

//		수정 : 마우스의 가격을 100000 으로 변경
//		for(Product product : products) {
//			if(product.getName().equals("마우스")) {
//				product.setPrice(100000);
//				System.out.println(product);
//			}
//		}
		System.out.println("수정 : 마우스의 가격을 100000 으로 변경");
    Product foundProduct = null;
    for(Product product: products) {
       if(product.getId() == 3L) {
          foundProduct = product;
       }
    }
    foundProduct.setPrice(100000);
    
    try {
       if(products.contains(foundProduct)) {
          products.set(products.indexOf(foundProduct), foundProduct);
       }
    } catch (IndexOutOfBoundsException e) {
       System.out.println("ArrayListTask3 예외 발생");
       System.out.println("인덱스 똑바로 입력하세요.");
    } catch (Exception e) {
       System.out.println("ArrayListTask3 예외 발생");
       System.out.println("알 수 없는 예외 발생");
       e.printStackTrace();
    }
    
    System.out.println(products);
    System.out.println();
    
//    상품 재고가 100개 이하인 상품을 삭제
//    System.out.println("상품 재고가 100개 이하인 상품을 삭제");
//    ArrayList<Product> removeProductsArr = new ArrayList<Product>();
//    
//    for(int i = 0; i < products.size(); i++) {
//    	if(products.get(i).getStock() <= 100) {
//    		removeProductsArr.add(products.get(i));
//    	}
//    }
//
//    for(Product removeProduct : removeProductsArr) {
//    	if(products.contains(removeProduct)) {
//    		products.remove(removeProduct);
//    	} else {
//    		System.err.println("없는 제품");
//    	}
//    }
//    removeProductsArr = null;
//
//    System.out.println(products);

//    상품 이름이 마우스인 상품을 삭제
//    .indexOf(---) : ---의 인덱스 값
    System.out.println("상품 이름이 마우스인 상품을 삭제");
    ArrayList<Product> foundProduct1 = new ArrayList<>();
    for(Product product : products) {
    	if(product.getName().equals("마우스")) {
    		foundProduct1.add(product);
    	}
    }
    
    for(Product removeProduct : foundProduct1) {
    	products.remove(removeProduct);
    }
    
    System.out.println(products);
    
	}
}
