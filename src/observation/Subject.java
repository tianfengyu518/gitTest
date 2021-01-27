package observation;

/**
 *  被观察者， 被订阅对象 接口
 */
public interface Subject {

    //添加观察者
    public void addObserver(Observer observer);

    //删除指定观察者
    public void deleteObserver(Observer observer);

    //通知所有观察者
    public void notifyObserver();
}
