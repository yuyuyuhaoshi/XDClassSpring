package yuhosi.me.project.domain;

public class VideoOrder {
    private int id;
    private String trade_number;
    private Video video;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrade_number() {
        return trade_number;
    }

    public void setTrade_number(String trade_number) {
        this.trade_number = trade_number;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
