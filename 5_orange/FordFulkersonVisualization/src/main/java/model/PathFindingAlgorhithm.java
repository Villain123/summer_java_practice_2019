package model;

import java.util.ArrayList;

public abstract class PathFindingAlgorhithm {
    Path buildPath(Vertex sinkPeak)
    {
        Path result = new Path(new ArrayList<Edge>(), Integer.MAX_VALUE);
        
        Vertex current = sinkPeak;
        
        while (current.cameFrom != null) {
            Vertex back = current.cameFrom.start == current ? current.cameFrom.end : current.cameFrom.start;

            result.getPath().add(0,current.cameFrom);

            int cfp = current.cameFrom.residualFlow(back);
            result.setResidualFlowMin(result.getResidualFlowMin() > cfp ? cfp : result.getResidualFlowMin());

            // clear cameFrom field for next loop
            current.cameFrom = null;
            current = back;

        }
        return result;
    }

    abstract boolean search(Vertex sourcePeak, Vertex sinkPeak);

}
