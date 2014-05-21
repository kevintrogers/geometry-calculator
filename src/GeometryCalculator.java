
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GeometryCalculator implements ItemListener {
    JPanel calcTools; 
    final static String CIRCLEPANEL = "Circle Calculator";
    final static String RECTANGLEPANEL = "Rectangle Calculator";
    final static String TRIANGLEPANEL = "Triangle Calculator";

	private JLabel radiusLabel;
	private JLabel baseLabel;
	private JLabel heightLabel;
	private JLabel lengthLabel;
	private JLabel widthLabel;
	private JLabel circleAreaLabel;
	private JLabel circumferenceLabel;
	private JLabel rectanglePerimeterLabel;
	private JLabel rectangleAreaLabel;
	private JLabel triangleAreaLabel;
	private JTextField radiusTextField;
	private JTextField baseTextField;
	private JTextField heightTextField;
	private JTextField lengthTextField;
	private JTextField widthTextField;
	private JButton calcButton1;
	private JButton calcButton2;
	private JButton calcButton3;
	
	JTextField rectanglePerimeterField = new JTextField(15);
	JTextField rectangleAreaField = new JTextField(15);
	JTextField triangleAreaField = new JTextField(15);

	
	
    public void addComponentToPane(Container pane) {
        
        JPanel comboBoxPane = new JPanel(); 
        String comboBoxItems[] = { CIRCLEPANEL, RECTANGLEPANEL, TRIANGLEPANEL };
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        
        //Create the "calcTools".
        JPanel calcTool1 = new JPanel();
        
        
        calcTool1.setLayout(new GridLayout(0,2));
 
        radiusLabel = new JLabel("Radius");
        circumferenceLabel = new JLabel("Circumference");
        circleAreaLabel = new JLabel("Area");
        radiusTextField= new JTextField(10);
 
        final JTextField circumferenceField = new JTextField(15);
        circumferenceField.setEditable(false);
        final JTextField circleAreaField = new JTextField(15);
        circleAreaField.setEditable(false);
        
        JPanel button1 = new JPanel();
        calcButton1 = new JButton("Calculate");
        calcButton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              String radius;
              double circumference;
              double circleArea;

              radius = radiusTextField.getText();
              circumference = 2*Double.parseDouble(radius)*Math.PI;
              String circ = String.valueOf(circumference);
              circleArea = Double.parseDouble(radius)* Double.parseDouble(radius)*Math.PI;
              String area = String.valueOf(circleArea);

              circumferenceField.setText(circ);
              circleAreaField.setText(area);

            }
        });
        
        JPanel panel1_1 = new JPanel();
        JPanel panel1_2 = new JPanel();
        JPanel panel1_3 = new JPanel();
               
        button1.add(calcButton1);
         
        panel1_1.add(radiusLabel);
        panel1_1.add(radiusTextField);
        panel1_2.add(circumferenceLabel);
        panel1_2.add(circumferenceField);
        panel1_3.add(circleAreaLabel);
        panel1_3.add(circleAreaField);
        
        calcTool1.add(panel1_1);
        calcTool1.add(panel1_2);
        calcTool1.add(button1);
        calcTool1.add(panel1_3);            
        
        JPanel calcTool2 = new JPanel();
        calcTool2.setLayout(new GridLayout(0,2));
        
        lengthLabel = new JLabel("Length");
        widthLabel = new JLabel("Width");
        rectanglePerimeterLabel = new JLabel("Perimeter");
        rectangleAreaLabel = new JLabel("Area");
        lengthTextField = new JTextField(10);
        widthTextField = new JTextField(10);
        final JTextField rectanglePerimeterField = new JTextField(15);
        rectanglePerimeterField.setEditable(false);
        final JTextField rectangleAreaField = new JTextField(15);
        rectangleAreaField.setEditable(false);
        JPanel button2 = new JPanel();
        calcButton2 = new JButton("Calculate");
        button2.add(calcButton2);    
               
        calcButton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              String length;
              String width;
              double rectanglePerimeter;
              double rectangleArea;
              
              length = lengthTextField.getText();
              width = widthTextField.getText();
              rectanglePerimeter = 2* (Double.parseDouble(length) + Double.parseDouble(width));
              String perimeter = String.valueOf(rectanglePerimeter);
              rectangleArea = Double.parseDouble(length)* Double.parseDouble(width);
              String area = String.valueOf(rectangleArea);

              rectanglePerimeterField.setText(perimeter);
              rectangleAreaField.setText(area);

            }
        });
 
        JPanel panel2_1 = new JPanel();
        JPanel panel2_2 = new JPanel();
        JPanel panel2_3 = new JPanel();
        JPanel panel2_4 = new JPanel();
        
        panel2_1.add(lengthLabel);
        panel2_1.add(lengthTextField);
        panel2_2.add(widthLabel);
        panel2_2.add(widthTextField);
        panel2_3.add(rectanglePerimeterLabel);
        panel2_3.add(rectanglePerimeterField);
        panel2_4.add(rectangleAreaLabel);
        panel2_4.add(rectangleAreaField);
        
        calcTool2.add(panel2_1);
        calcTool2.add(panel2_2);        
        calcTool2.add(panel2_3);
        calcTool2.add(panel2_4);
        calcTool2.add(button2);
        
        JPanel calcTool3 = new JPanel();
        calcTool3.setLayout(new GridLayout(0,2));
        baseLabel = new JLabel("Base");
        heightLabel = new JLabel("Height");
        baseTextField = new JTextField(10);
        heightTextField = new JTextField(10);
        triangleAreaLabel = new JLabel("Area");
        triangleAreaField = new JTextField(15);
        triangleAreaField.setEditable(false);
        calcButton3 = new JButton("calculate");
        JPanel button3 = new JPanel();
        button3.add(calcButton3);
        
        calcButton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              String base;
              String height;
              double triangleArea;
              
              base = baseTextField.getText();
              height = heightTextField.getText();
              triangleArea = (Double.parseDouble(base) * Double.parseDouble(height))/2;
              String area = String.valueOf(triangleArea);

              triangleAreaField.setText(area);
            }
        });
        
        JPanel panel3_1 = new JPanel();
        JPanel panel3_2 = new JPanel();
        JPanel panel3_3 = new JPanel();
           
        panel3_1.add(baseLabel);
        panel3_1.add(baseTextField);
        panel3_2.add(heightLabel);
        panel3_2.add(heightTextField);
        panel3_3.add(triangleAreaLabel);
        panel3_3.add(triangleAreaField); 
        
        calcTool3.add(panel3_1);
        calcTool3.add(panel3_3);
        calcTool3.add(panel3_2);
        calcTool3.add(button3);

        calcTools = new JPanel(new CardLayout());
        calcTools.add(calcTool1, CIRCLEPANEL);
        calcTools.add(calcTool2, RECTANGLEPANEL);
        calcTools.add(calcTool3, TRIANGLEPANEL);
        
        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(calcTools, BorderLayout.CENTER);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(calcTools.getLayout());
        cl.show(calcTools, (String)evt.getItem());
    }
    

    private static void createAndShowGUI() {
   
        JFrame frame = new JFrame("Geometry Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
        GeometryCalculator demo = new GeometryCalculator();
        demo.addComponentToPane(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    
        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
