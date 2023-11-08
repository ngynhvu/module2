package ss4_class_object.bai_tap.stop_watch;

public class StopWatch {
    private long endTime;
    private long startTime = System.currentTimeMillis();
    public StopWatch(){}

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getElapsedTime(){
        return System.currentTimeMillis() - this.startTime;
    }
}
