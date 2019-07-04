package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class FordFulkerson {

    static LinkedList<Graph> process(Graph graph, PathFindingAlgorhithm pathFinder) {
        // cannot find a path from source to sink, algorithm stop;
        LinkedList<Graph> result = new LinkedList<>() ;
        while (pathFinder.search(graph.getSource(), graph.getSink())) {
            
            //Trace back from sink to get the path;
            Path path = pathFinder.buildPath(graph.getSink());
            
            int cf_min = path.getResidualFlowMin();
            
            Vertex current = graph.getSource();
            for (Edge e : path.getPath()) {
                if (e.start == current) {
                    // f(u,v) - arc in correct direction
                    e.flow += cf_min;
                    current = e.end;
                } else {
                    //f(v,u) - arc in opposite direction
                    e.flow -= cf_min;
                    current = e.start;
                }
            }
            // TODO: clone the graph
            result.add(graph);
        }

        return result;
    }
}
