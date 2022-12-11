import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Curve implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;
    private ArrayList<TimePoint> timePoints;
    private String name;
    private File file;

    public Curve(String name, TimePoint ... args){
        this.name = Utils.checkName(name, new File("Curve"));
        timePoints = new ArrayList<>();
        timePoints.addAll(Arrays.asList(args));
        file = new File("Curve/" + name + ".bin");
        this.export();
    }

    public void export(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(this);
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addTimePoint(TimePoint tp){
        timePoints.add(tp);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Curve " + this.name + ":\n");
        TimePoint [] tpArr = (TimePoint[]) timePoints.toArray();
        for (TimePoint tp:tpArr){
            sb.append(tp.toString());
        }
        return sb.toString();
    }

    public Curve clone(String name){
        TimePoint [] tpArray = new TimePoint[timePoints.size()];
        for (int i = 0; i < tpArray.length; i++){
            tpArray[i] = timePoints.get(i).clone();
        }
        Curve clone = new Curve(name, tpArray);
        return clone;
    }
}
