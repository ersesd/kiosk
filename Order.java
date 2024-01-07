package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    Menu menu = new Menu();
    
    Product pro = new Product();
    Scanner sc = new Scanner(System.in);

    Menu burgersMenu = new Menu("버거류", "매장에서 갓 조리되어 만들어진 따듯한 버거들!");
    Menu iceMenu = new Menu("아이스크림류", "매장에서 특별한 기계를 통해 제작되는 아이스크림!");
    Menu drinksMenu = new Menu("음료류", "햄버거와 단짝을 이루는 음료들!");
    Menu sideMenu = new Menu("사이드류", "버거만으로 부족할때 든든한 사이드들!");

    public void MainAdd() {
        menu.categoryAdd(burgersMenu);
        menu.categoryAdd(iceMenu);
        menu.categoryAdd(drinksMenu);
        menu.categoryAdd(sideMenu);
    }


    ArrayList<Menu> categoryList = menu.getCategoryList();

    public Order(Menu menu) {
    }

    public int ShopOrder() {
        int number = 1;
        System.out.println("<클리어 햄버거>에 오신 걸 환영합니다.");
        System.out.println("아래 메뉴판을 보고 메뉴를 입력하여 주문하세요.");
        System.out.println("");
        System.out.println("[ 메뉴판 ]");
        System.out.println("1. 버거류       | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. 아이스크림류   | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. 음료류       | 매장에서 직접 만드는 음료");
        System.out.println("4. 사이드류      | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println("");
        System.out.println("[ 옵션 ]");
        System.out.println("5. 주문하기     | 장바구니를 열고 주문합니다.");
        System.out.println("6. 취소하기     | 주문을 취소합니다.");

        System.out.print("번호를 선택하시오. : ");
        int num = sc.nextInt();
        
        if(num == 1){
            for (Product product : pro.burgerList) {
                
            }

        }

        for (Menu list : menu.getCategoryList()) {
            System.out.print(number + ". ");
            list.ShowCategory();
           number++;

        }
            return number;

        }
    }
