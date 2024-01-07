package kiosk;

import java.util.ArrayList;

public class Product extends Menu {
    double price;

    public Product(String name, String explain, double price) {
        super(name, explain);
        this.price = price;
    }

    public Product(){

    }

    ArrayList<Product> burgerList = new ArrayList<>();
    ArrayList<Product> drinkList = new ArrayList<>();
    ArrayList<Product> iceCreamList = new ArrayList<>();
    ArrayList<Product> sideList = new ArrayList<>();

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

    public void addFood(){
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

    }

    public double getPrice() {
        return price;
    }

    public void ShowPrint(){
        System.out.println(getName() + " / " + getPrice() + "원  / " + getExplain());
    }

}
