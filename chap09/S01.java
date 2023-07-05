package chap09;

public class S01 {
    public static void main(String[] args) {
        
        String str = "Show me the money";

        System.out.print("str.length() : ");
        System.out.println(str.length());
        System.out.println("str.charAt(1) : " + str.charAt(1));
        System.out.println("str.substring(6) : " + str.substring(6));
        //주민등록번호 등을 잘라낼 때 
        System.out.println("str.substring(6, 11 : " + str.substring(6, 11));

        //아이디 happy를 캡스록 실수로 눌러서 HAPPY로 했을 때 비교시 toLowerCase를 이용해 처리할 수 있다.
        System.out.println("str.toLowerCase() : " + str.toLowerCase());
        System.out.println("str.toUpperCase() : " + str.toUpperCase());

        System.out.println("str.indexOf(\"e\") : " + str.indexOf("e"));
        System.out.println("str.lastindexOf(\"e\") : " + str.lastIndexOf("e"));
        System.out.println("str.contains(\"the\") : " + str.contains("the"));
        System.out.println("str.startsWith(\"show\") : " + str.startsWith("show"));
        System.out.println("str.endsWith(\"money\") : " + str.endsWith("money"));
        System.out.println("str.endsWith(\"money\") : " + str.endsWith("money"));
        System.out.println("str.trim : " + str.trim()); // 좌우공백 제거
        System.out.println("str.replace(\"e\", \"x\") : " +str.replace("e", "x")); //e를 x로 변경
        System.out.println("str.repeat(2) : " + str.repeat(2)); //반복
        System.out.println("str.split(\"  \").length : " + str.split(" ").length); //띄어쓰기 기준으로 쪼갬
        System.out.println("str.split(\"  \")[0] : " + str.split(" ")[0]);

        String name = "홍 길 동 ";
        System.out.println("name.split(\" \").length : " + name.split(" ").length);

        String coca = "cocacola";
        System.out.println("coca.split(\" \").length : " + coca.split(" ").length);

        System.out.println("\"\".isBlank() : " + "".isBlank());
        System.out.println("\" \".isBlank() : " + " ".isBlank());
        System.out.println("\"  \".isBlank() : " + "  ".isBlank());


        System.out.println("\"\".isEmpty() : " + "".isEmpty());
        System.out.println("\"\".isEmpty() : " + " ".isEmpty());

        String bird1 = "오리";
        String bird2 = "오리";
        String bird3 = "독수리";
        String bird4 = new String("갈매기");
        String bird5 = new String("갈매기");
        String 드레이븐 = "1557";

        System.out.println("bird1 == bird2 : " + (bird1 == bird2));
        System.out.println("bird3 == \"독수리\" : " + (bird3 == "독수리"));
        System.out.println("bird3 == \"독수리\" : " + (bird3 == "독수리"));
        System.out.println("bird4 == bird5 : " + (bird4 == bird5));
        System.out.println("왜이렇게 빨리끝내나요 IG :" + (드레이븐 == "1557"));

        // 객체끼리 ==을 사용하면 주소를 비교한다.
        // 객체끼리 equals를 사용하면 주소를 비교해보고 false면
        // 내부의 값을 한번 더 확인해서 비교한 뒤 true false를 리턴한다.

        System.out.println("bird1.equals(bird2) : " + bird1.equals(bird2));
        System.out.println("bird4.equals(bird5) : " + bird4.equals(bird5));

    }
}
