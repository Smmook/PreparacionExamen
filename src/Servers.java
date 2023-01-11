import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {
    public static Servers instance;

    private List<String> serverList;

    private Servers() {
        serverList = new ArrayList<>();
    }

    public Servers getInstance() {
        synchronized (Servers.class) {
            if (instance == null) instance = new Servers();
            return instance;
        }
    }

    public boolean addServer(final String server) {
        if ((server.startsWith("https") || server.startsWith("http")) && !serverList.contains(server)) {
            return serverList.add(server);
        }
        return false;
    }

    public List<String> getHttpServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("http"))
                .collect(Collectors.toList());
    }

    public List<String> getHttpsServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("https"))
                .collect(Collectors.toList());
    }
}
