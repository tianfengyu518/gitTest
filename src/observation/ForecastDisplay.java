package observation;

public class ForecastDisplay implements Observer,DisplayElement {

    //温度
    private float temperature;
    //湿度
    private float humidity;
    //气压
    private float airpressure;
    //主题
    private Subject subject;

    //初始化的时候 注册主题，添加对象
    public ForecastDisplay(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("气温："+this.temperature+"\t湿度："+this.humidity+"\t气压："+this.airpressure);
    }

    @Override
    public void update(float temperature, float humidity, float airpressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.airpressure = airpressure;
        this.display();
    }
}
