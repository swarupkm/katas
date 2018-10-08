import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CreateGraphTest {

    public static final String GRAPH_CSV = "src/test/resources/graph.csv";

    @Test
    public void should_create_graph_from_csv_file() {
        Graph graph = GraphBuilder.createGraphFromCSV(GRAPH_CSV);
        assertThat(graph.nodeCount() , is(4));
    }

    @Test
    public void should_get_list_of_dest_for_a_given_src() {
        NodePair p1 = new NodePair("p1", "p2");
        NodePair p2 = new NodePair("p1", "p3");

        Graph graph = new Graph(Arrays.asList(p1, p2));

        assertThat(graph.getDestListForSrc("p1"), is(Arrays.asList("p2", "p3")));
        assertThat(graph.getDestListForSrc("p2"), is(Arrays.asList("p1")));
        assertThat(graph.getDestListForSrc("p3"), is(Arrays.asList("p1")));
    }

    @Test
    public void should_get_path_length_between_points() {
        NodePair p1 = new NodePair("p1", "p2");
        NodePair p2 = new NodePair("p1", "p3");

        Graph graph = new Graph(Arrays.asList(p1, p2));
//        assertThat(graph.getPathLength ("p2","p3"), is(2));
    }
}
