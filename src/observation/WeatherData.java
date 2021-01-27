package observation;

import java.util.ArrayList;

/**
 * 天气数据类 ： 被观察者， 被订阅者 接口实现类
 *
 */
public class WeatherData implements Subject {

    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float airpressure;

    //观察者列表
    private ArrayList<Observer> observerArrayList;


    public WeatherData(){
        this.observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int i ;
        if ((i= observerArrayList.indexOf(observer))!=-1){
            this.observerArrayList.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerArrayList) {
            observer.update(temperature,humidity,airpressure);
        }
    }

    //改变数据
    public void setMeasurements(float temperature,float humidity, float airpressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.airpressure = airpressure;
    }

    //数据修改后 ，通知观察者们
    public void measurementsChanged(){
        this.notifyObserver();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getAirpressure() {
        return airpressure;
    }
}
