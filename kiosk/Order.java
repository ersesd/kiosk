package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {



    ArrayList<Menu> menuList = new ArrayList<>();
    ArrayList<Product> burgerList = new ArrayList<>();
    ArrayList<Product> drinkList = new ArrayList<>();
    ArrayList<Product> iceCreamList = new ArrayList<>();
    ArrayList<Product> sideList = new ArrayList<>();
    ArrayList<Product> shopList = new ArrayList<>();

    Menu burgerMenu = new Menu("버거류", "갓 구운 비프를 통해서 조제된 따뜻하고 신선한 버거");
    Menu drinkMenu = new Menu("음료슈류", "버거와 단짝친구인 다양한 콜라를 통해서 탄산을 즐겨보세요!");
    Menu iceMenu = new Menu("아이스크림류", "차가운 얼음을 통해서 만들어진 아이스크림!");
    Menu sideMenu = new Menu("사이드류", "버거로 부족할때 필요한 새로운 메뉴들!");

    Product burger1 = new Product("햄버거", "평범한 햄버거이다.", 2500);
    Product burger2 = new Product("불고기버거", "한국형 불고기 소스와 소고기패티의 만남!!", 3500);
    Product burger3 = new Product("핫치킨버거", "뜨거운 치킨패티와 매운소스를 첨가한 크리스피 버거~", 5200);
    Product burger4 = new Product("트리플치즈버거", "패티가 3장 치즈도 3장 가격도 3배?!", 6800);
    Product burger5 = new Product("빅맥", "이름은 빅맥이지만 실제로는 작다!", 5500);

    Product drink1 = new Product("코카콜라", "버거와 콜라는 세트! 콜라의 스탠다드 근데 요즘 좀 비싸다?", 2000);
    Product drink2 = new Product("펩시콜라", "인지도는 떨어지지만 값은 더싸다!", 1600);
    Product drink3 = new Product("제로콜라", "맛도 좋고 건강도 상대적으로 괜찮아서 요즘들어 인기!", 1800);
    Product drink4 = new Product("물", "물이다.", 500);

    Product ice1 = new Product("바닐라 아이스크림", "누구나 좋아하고 호불호 없는 무난한 아이스크림!", 2300);
    Product ice2 = new Product("딸기 아이스크림", "새콤달콤한 딸기가 가득!", 2300);
    Product ice3 = new Product("초코 아이스크림", "이가 썩을지도 모르는 달콤한 맛!", 2500);

    Product side1 = new Product("감자튀김", "감자는 찌면 애매하고 튀기면 맛있다!", 1500);
    Product side2 = new Product("애플파이", "사과를 갈아서 만든 애플파이!!", 1300);
    Product side3 = new Product("해쉬브라운", "감자튀김에 밀린 시대의 비운아", 1900);
    Product side4 = new Product("소시지 스낵랩", "소시지를 랩에싸서 드세요", 2800);


    public Order() {

    }
    Scanner sc = new Scanner(System.in);
    public int input() {
        System.out.print("번호를 입력하세요: ");

        int input = sc.nextInt();

        return input;
    }

    public void MenuList() {

        burgerList.add(burger1);
        burgerList.add(burger2);
        burgerList.add(burger3);
        burgerList.add(burger4);
        burgerList.add(burger5);
        drinkList.add(drink1);
        drinkList.add(drink2);
        drinkList.add(drink3);
        drinkList.add(drink4);
        iceCreamList.add(ice1);
        iceCreamList.add(ice2);
        iceCreamList.add(ice3);
        sideList.add(side1);
        sideList.add(side2);
        sideList.add(side3);
        sideList.add(side4);
        menuList.add(burgerMenu);
        menuList.add(drinkMenu);
        menuList.add(iceMenu);
        menuList.add(sideMenu);

    }

    public void addBasket(Product product) {
        input();
        product.Showkiosk();
        System.out.println("장바구니에 추가하겠습니까?");
        System.out.println("1.추가          2.취소");
        if (input() == 1) {
            System.out.println(product.getName() + "를 추가했습니다.");
            display();
            shopList.add(product);
        } else if (input() == 2) {
            System.out.println("취소되었습니다. 메뉴판으로 돌아갑니다.");
            display();
        } else {
            System.out.println("잘못된 명령입니다.");
        }

    }

    public void display(){
        System.out.println("<클리어 햄버거>에 오신 걸 환영합니다.");
        System.out.println("아래 메뉴판을 보고 메뉴를 입력하여 주문하세요.");
        System.out.println("");
        System.out.println("[주문]");
        ShopOrder();
        System.out.println("[확인]");
        OrderConfirm();
        if (input() == 1){
            BurgerMenu();
        } else if (input() == 2){
            iceMenu();
        } else if (input() == 3){
            drinkManu();
        } else if (input() == 4){
            sideMenu();
        } else if(input() == 5) {
            OrderList();
        } else if(input() == 6) {
            System.out.println("주문을 취소합니다.");
        }
        System.out.println("잘못된 명령입니다.");
    }

    public void ShopOrder() {
        int number = 1;
        for (Menu menu: menuList){
            System.out.print(number + ". ");
            menu.Showkiosk();
            number++;
        }
        System.out.println();
        }
    public void BurgerMenu() {
        input();

        int number = 1;
        for (Product bur: burgerList){
            System.out.print(number + ". ");
            bur.Showkiosk();
            number++;
        }
        if (input() == 1){
            addBasket(burger1);
        } else if (input() == 2){
            addBasket(burger2);
        } else if (input() == 3){
            addBasket(burger3);
        } else if (input() == 4){
            addBasket(burger4);
        } else if (input() == 5){
            addBasket(burger5);

        } else {
            System.out.println("잘못된 명령입니다.");
        }
        System.out.println();
    }

    public void iceMenu() {
        int number = 1;
        for (Product ice: iceCreamList){
            System.out.print(number + ". ");
            ice.Showkiosk();
            number++;
        }
        if (input() == 1){
            addBasket(ice1);
        } else if (input() == 2){
            addBasket(ice2);
        } else if (input() == 3){
            addBasket(ice3);
        } else {
            System.out.println("잘못된 명령입니다.");
        }
        System.out.println();
    }

    public void drinkManu() {
        int number = 1;
        for (Product dri: drinkList){
            System.out.print(number + ". ");
            dri.Showkiosk();
            number++;
        }
        if (input() == 1){
            addBasket(drink1);
        } else if (input() == 2){
            addBasket(drink2);
        } else if (input() == 3){
            addBasket(drink3);
        } else if (input() == 4){
            addBasket(drink4);
        } else {
            System.out.println("잘못된 명령입니다.");
        }
        System.out.println();
    }

    public void sideMenu() {
        int number = 1;
        for (Product side: sideList){
            System.out.print(number + ". ");
            side.Showkiosk();
            number++;
        }
        if (input() == 1){
            shopList.add(side1);
        } else if (input() == 2){
            shopList.add(side2);
        } else if (input() == 3){
            addBasket(side3);
        } else if (input() == 4){
            addBasket(side4);
        } else {
            System.out.println("잘못된 명령입니다.");
        }
        System.out.println();
    }

    public void OrderConfirm(){
        System.out.println("5. 주문  / 장바구니에 들어가서 주문합니다.");
        System.out.println("6. 취소  / 주문을 취소합니다.");

    }

    public void OrderList(){
        double totalprice = 0;

        System.out.println("[ 주문목록 ]");
        for (Product pro: shopList){
            System.out.println(pro.getName() +"  / " + pro.getPrice() + "원 / " + pro.getExplain());
            totalprice += pro.getPrice();
        }
        System.out.println("");
        System.out.println("[ 주문금액 ]");
        System.out.print("총 금액은 " + totalprice + "원 입니다.");
        System.out.println("");
        System.out.println("1. 주문완료                      2. 돌아가기");
        if (input() == 1){
            System.out.println("주문이 완료되었습니다!");
        } else if (input() == 2){
            System.out.println("메뉴판으로 돌아갑니다.");
            display();
        } else {
            System.out.println("잘못된 명령입니다.");
        }
    }

}
