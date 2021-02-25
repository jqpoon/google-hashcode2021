package suffering;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    private final List<Street> incoming;
    private final List<Street> outgoing;
    private final int id;

    public Intersection(int id) {
        this.id = id;
        this.incoming = new ArrayList<>();
        this.outgoing = new ArrayList<>();
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
