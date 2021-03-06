package Entity;
import java.util.*;
/**
 * Created by dbakti7 on 10/19/2015.
 */
public class Place {
    // entity class
    private String name;
    private String category;
    private Weather weather;
    private String description;
    private String image;
    Place() {
        name = null;
        category = null;
        weather = null;
        description = null;
        image = null;
    }
    public void setDetails() {
        // from API
    }
    public List getDetails() {
        List details = new ArrayList();
        details.add(name);
        details.add(category);
        details.add(weather);
        details.add(description);
        details.add(image);
        return details;
    }
}
