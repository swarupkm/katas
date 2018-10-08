import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

public class GraphBuilder {
    public static Graph createGraphFromCSV(String graphCsv) {
        File file = new File(graphCsv);
        try {
            CSVParser csvParser =  CSVParser.parse(file, Charset.defaultCharset(), CSVFormat.DEFAULT);
            List<NodePair> pairs = csvParser.getRecords().stream().map(r -> new NodePair(r.get(0),r.get(1))).collect(Collectors.toList());
            return new Graph(pairs);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
