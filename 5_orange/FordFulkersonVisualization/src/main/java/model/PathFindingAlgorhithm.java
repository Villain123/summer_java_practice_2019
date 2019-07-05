package model;

import java.util.ArrayList;

public abstract class PathFindingAlgorhithm {
    Path buildPath(Vertex sinkPeak)
    {
        Path result = new Path(new ArrayList<Edge>(), Integer.MAX_VALUE);
        
        Vertex current = sinkPeak;
        
        while (current.getCameFrom() != null) {
            Vertex back = current.getCameFrom().getStart() == current ? current.getCameFrom().getEnd() : current.getCameFrom().getStart();

            result.getPath().add(0,current.getCameFrom());

            int cfp = current.getCameFrom().residualFlow(back);
            result.setResidualFlowMin(result.getResidualFlowMin() > cfp ? cfp : result.getResidualFlowMin());

            // clear cameFrom field for next loop
            current.setCameFrom(null);
            current = back;
        }
        return result;
    }

    abstract boolean search(Vertex sourcePeak, Vertex sinkPeak);

}
