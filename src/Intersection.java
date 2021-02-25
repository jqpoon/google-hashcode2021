import java.util.List;

public class Intersection {
    private final List<Street> incoming;
    private final List<Street> outgoing;

    public Intersection(List<Street> incoming, List<Street> outgoing) {
        this.incoming = incoming;
        this.outgoing = outgoing;
    }

    public List<Street> getIncoming() {
        return incoming;
    }

    public List<Street> getOutgoing() {
        return outgoing;
    }
}
