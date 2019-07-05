import java.util.*;

public interface Savable {
    public List<String> write();

    public void read(List<String> savedValues);
}