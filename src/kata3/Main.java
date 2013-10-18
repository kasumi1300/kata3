package kata3;


public class Main {
//http://rectan.es.tl/lista-de-correos-electronicos.htm
    
    public static void main(String[] args) {
        String filename = args[0];
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(MailReader.read(""));
        HistogramViewer<String> viewer = new HistogramViewer<>(builder.getHistogram());
        viewer.show();
    }
}
