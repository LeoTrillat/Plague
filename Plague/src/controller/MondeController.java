package controller;

import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

public class MondeController {

	private Image monde = new Image("/images/terre.png");
	
	public void getNomPays(MouseEvent e){
		
		System.out.println(monde.getPixelReader().getColor((int)e.getX(),(int)e.getY()).toString());
	}
}
