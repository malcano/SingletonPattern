package singleton;

public class Company {
    private Company(){ }

    private static Company instance = new Company();//유일하게 생성한 인스턴스

    public static Company getInstance() {//인스턴스를 외부에서 참조할 수 있도록 getter 구현
        if(instance == null)
            instance = new Company();
        return instance;//유일하게 생성한 인스턴스 반환

    }


}
