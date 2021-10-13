import java.awt.Graphics;
import java.awt.Color;

public class Box extends GameObject{

    public Box(float x, float y,ID id){
        super(x,y,id);
    }

    @Override
    public void tick(){

    }

    public void render(Graphics g){
        g.setColor(Color.red);
        g.fillRect((int)x,(int)y,64,64);
    }

}