import java.time.LocalDateTime;

public class Jaeger {

    private LocalDateTime launched;
    private String mark;
    private String status;
    private double height;
    private double weight;

    public Jaeger() {}

    public Jaeger(LocalDateTime launched, String mark, String status, double height, double weight) {
        this.launched = launched;
        this.mark = mark;
        this.status = status;
        this.height = height;
        this.weight = weight;
    }

    public void setLaunched(LocalDateTime launched) {
        this.launched = launched;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("launched: %s \nmark: %s \nstatus: %s \nheight: %s \nweight: %s",
                launched.toString(), mark, status, String.format("%.2f",height), String.format("%.2f",weight));
     }
}