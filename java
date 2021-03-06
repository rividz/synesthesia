import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Panel { 
   public static void main(String[] args) { 
      SwingUtilities.invokeLater(new Runnable() { 
         public void run() { 

            displayJFrame();
         } 
      }); 
   } 

   static void displayJFrame() { 
   	int arduino = 0; //this is input from the arduino
 	Color arduinoColor = new Color(arduino);

 	//find the note Guitar note chart found here: http://www.bryankimsey.com/popsicle/Guitar%20note%20frequencies.jpg
 	/*A*/ if(arduino > 0 && arduino < 120){arduinoColor=Color.red;}
    			
    	/* B */else if(arduino > 151 && arduino < 250){arduinoColor=Color.cyan;}
    			
    	/* C */else if(arduino > 6 && arduino < 8){arduinoColor=Color.yellow;}
    			
    	/* D */else if(arduino > 120 && arduino < 150){arduinoColor=Color.pink;}
    			
    	/* E */else if(arduino > 251 && arduino < 350){arduinoColor=Color.green;}
    			
    	/* F */else if(arduino > 15 && arduino < 16){arduinoColor=Color.green;}
    			
    	/* G */else if(arduino > 17){arduinoColor=Color.orange;}
    	
    	else{arduinoColor=Color.black;}
    //find the note end

    //drawing starts here
    JFrame frame = new JFrame("Color Output");
    frame.setBackground(arduinoColor);
    frame.setPreferredSize(new Dimension(400, 300));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //drawing ends here 



    while(true){
    	frame.setBackground(arduinoColor);
    }
   }
}
