import com.sun.org.apache.regexp.internal.RE;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.*;
import java.awt.image.BufferedImage;

/**
 * Created by codecadet on 04/06/2018.
 */

public class Main {


    public static void main(String[] args) throws InterruptedException {


        Picture merda = new Picture();
        merda.load("src/pictures/ocean-poster.png");
        merda.grow(-merda.getWidth(),-merda.getHeight());

        merda.draw();


        Rectangle canvas = new Rectangle(10,10,600,200);
        canvas.draw();


        Rectangle player = new Rectangle(canvas.getWidth()/2,canvas.getHeight()/2,10,10);
        player.fill();
        Rectangle black = new Rectangle(10,10,100,200);
        black.setColor(Color.BLACK);
        black.fill();
        Rectangle black2 = new Rectangle(canvas.getWidth(),10,100,200);
        black2.setColor(Color.BLACK);
        black2.fill();

        for(int i = 0; i < canvas.getWidth()-200; i=i+5){
            Thread.sleep(100);
            merda.translate(5,0);
        }

merda.delete();
        merda.grow(merda.getWidth(),merda.getHeight());
        merda.draw();



    }

}
