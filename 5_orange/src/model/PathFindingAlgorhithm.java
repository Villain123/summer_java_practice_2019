import java.util.ArrayList;

public class PathFindingAlgorhithm {
    ArrayList<Edge> buildPath(Vertex sinkPeak, int cf_min) {
        Vertex current = sinkPeak;
        ArrayList<Edge> path = new ArrayList();
        while (current.cameFrom != null) {
            Vertex back = current.cameFrom.start == current ? current.cameFrom.end : current.cameFrom.start;

            path.add(0,current.cameFrom);

            int cfp = current.cameFrom.residualFlow(back);
            cf_min = cf_min > cfp ? cfp : cf_min;

            // clear cameFrom field for next loop
            current.cameFrom = null;
            current = back;

        }
        return path;
    }

    int search(Vertex sourcePeak, Vertex sinkPeak) {
        // cannot find a path from source to sink, algorithm stop;
        DFS objDFS = new DFS();
        while (objDFS.DFsearch(sourcePeak, sinkPeak)) {
            int cf_min = Integer.MAX_VALUE;

            //Trace back from sink to get the path;
            ArrayList<Edge> path = buildPath(sinkPeak, cf_min);

            Vertex current = sourcePeak;
            for (Edge e : path) {
                if (e.start == current) {
                    // f(u,v) - arc in correct direction
                    e.flow += cf_min;
                    current = e.end;
                }
                else {
                    //f(v,u) - arc in opposite direction
                    e.flow -= cf_min;
                    current = e.start;
                }
            }

        }
        int total_flow = 0;

        for (Edge e : sourcePeak.neighbours) {
            total_flow += e.flow;
        }
        return total_flow;
    }
}