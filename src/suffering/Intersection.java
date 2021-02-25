package suffering;

import java.util.List;

public class Intersection {
    private final List<Street> incoming;
    private final List<Street> outgoing;
    private final int id;

    public Intersection(List<Street> incoming, List<Street> outgoing, int id) {
        this.incoming = incoming;
        this.outgoing = outgoing;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Street> getIncoming() {
        return incoming;
    }

    public List<Street> getOutgoing() {
        return outgoing;
    }
}
