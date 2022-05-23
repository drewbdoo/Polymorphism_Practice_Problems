import java.util.ArrayList;

public class Herd implements Moveable{

    private ArrayList<Organism> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }
    public void addToHerd(Moveable moveable){
        herd.add((Organism) moveable);
    }


    @Override
    public void move(int dx, int dy) {
        for(int i=0; i<herd.size(); i++){
            herd.get(i).move(dx, dy);
        }

    }

    @Override
    public String toString() {
        StringBuilder text= new StringBuilder();
       for(int i=0; i<herd.size(); i++){
            text.append(herd.get(i).toString()).append("\n");
        }
        return text.toString();

    }

}
