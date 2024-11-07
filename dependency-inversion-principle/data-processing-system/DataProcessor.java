public class DataProcessor {
    private AData dataFetch;
    DataProcessor(AData dataFetch) {
        this.dataFetch = dataFetch;
    }
    void processor() {
        System.out.println("Processed Data: "+dataFetch.getData());
    }
}
