import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Curve implements Serializable {

    @Serial
    private static final long serialVersionUID = -6940041804390641778L;
    public ArrayList<CurvePoint> curvePoints;

    public String name;

    public Curve(String name, CurvePoint... rpArgs){
        curvePoints = new ArrayList<>();
        this.name = name;
        curvePoints.addAll(Arrays.asList(rpArgs));
    }

    public void rpAdd(CurvePoint rp){
        curvePoints.add(rp);
    }

    public void rpRemove(CurvePoint rp){
        curvePoints.remove(rp);
    }

    public void rpRemove(int index){
        curvePoints.remove(index);
    }

    public void rpChange(int index, CurvePoint rp){
        curvePoints.remove(index);
        curvePoints.add(index, rp);
    }

    public void export(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Curve/" + name + ".bin"))){
            oos.writeObject(this);
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
