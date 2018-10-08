import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphTraveler {
    private HashMap<String, List<String>> hashMap;

    public GraphTraveler(HashMap<String, List<String>> hashMap) {
        this.hashMap = hashMap;
    }

    public Integer getLength(String src, String dest) {
        if (hashMap.get(src).contains(dest))
            return 1;

        return 0;
    }
}
