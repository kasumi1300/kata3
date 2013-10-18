package kata3;


public class Main {

    public static void main(String[] args) {
        HistogramBuilder<Integer> builder = new HistogramBuilder<>();
        builder.calculate(new Integer[]{1,2,3,46,1,2,9,0,34,2,24,7,2,1,35,7});
        HistogramViewer<Integer> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}
