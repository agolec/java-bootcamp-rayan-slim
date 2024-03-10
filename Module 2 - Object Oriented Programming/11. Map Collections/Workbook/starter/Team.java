import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        // TODO
        setName(name);
        players = new HashMap<>();
    }
    
    public String getName() {
        // TODO
        return this.name;
    }

    public void setName(String name) {
        // TODO
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Name must be non-null.");
        }
        this.name = name;
    }

    public String getPlayer(String position) {
        // TODO
        return players.get(position);
    }

    public void setPlayer(String position, String player) {
        // TODO
        players.put(position,player);
    }    

    
}
