import java.util.*;

public class Graph {

    private List<NodePair> pairs;
    private HashMap<String, List<String>> hashMap;


    public Graph(List<NodePair> pairs) {

        this.pairs = pairs;
        this.hashMap = generateHashOfNodes();
    }

    private HashMap<String, List<String>> generateHashOfNodes() {
        HashMap<String, List<String>> map = new HashMap<>();
        pairs.forEach(nodePair -> {
            String src = nodePair.getSrc();
            String dest = nodePair.getDest();
            addToHash(map, src, dest);
            addToHash(map, dest, src);
        });
        return map;
    }

    private void addToHash(HashMap<String, List<String>> map, String src, String dest) {
        if (map.containsKey(src)) {
            map.get(src).add(dest);
        } else {
            List<String> destList = new ArrayList<>();
            destList.add(dest);
            map.put(src, destList);
        }
    }

    public Integer nodeCount() {
        Set<String> setOfNodes = new HashSet<>();
        pairs.forEach(node -> {
            setOfNodes.add(node.getSrc());
            setOfNodes.add(node.getDest());
        });
        return setOfNodes.size();
    }

    public List<String> getDestListForSrc(String p1) {
        return hashMap.get(p1);
    }

    public Integer getPathLength(String src, String dest) {
        return new GraphTraveler(hashMap).getLength(src,dest);
    }
}
