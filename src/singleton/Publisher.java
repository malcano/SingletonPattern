package singleton;

//이벤트 발생시키는 객체 인터페이스
interface Publisher {
    //관찰자 객체 추가
    public void addObserver(Observer o);
    //관찰자 객체 삭제
    public void deleteObserver(Observer o);
    //관찰자들에게 이벤트 발생 전달
    public void notifyObservers();
}

//관찰자 객체 인터페이스
interface Observer {
    //이벤트 발생에 따른 행위
    public void notify(boolean play);
}

