package observation;

/**
 * 观察者，订阅者 接口
 */
public interface Observer {
    /**
     * 调用观察者 更新天气
     * @param temperature  温度
     * @param humidity   适度
     * @param airpressure  气压
     */
    public void update(float temperature,float humidity,float airpressure);
}
