package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {

//        데이터의 안정성을 위해 일반적으로 setter를 사용하지 않음.
        calendar c1 = new calendar("2024", "12", "11");
//        c1.setYear("2024");
//        c1.setMonth("12");
//        c1.setDay("11");
//        System.out.println(c1.Today());


    }
}


class calendar{
    private String year;
    private String month;
    private String day;

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

//    생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드
//    생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅)

    public calendar(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    별도의 생성자를 만들경우, 초기(기본)생성자는 더이상 사용할 수 없으므로, 별도추가 필요.
    public calendar(){

    }

    public String Today(){
        String result = "오늘은 "+this.year+"연도, "+this.month+"월, "+this.day+"일 입니다.";
        return result;
    }
}
