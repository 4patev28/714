import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {

    private GridBagConstraints constraints;

    public Gui() {
        this.setLayout(new GridBagLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        constraints = new GridBagConstraints();

        addHeadingLabel();
        addHumanLabel();
        addTigerLabel();
        addElephanteLabel();
    }

    private void addHeadingLabel() {
        JLabel headingLabel = new JLabel("LivingThings");

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;

        this.add(headingLabel, constraints);
    }


    private void addHumanLabel() {
        JLabel HumanLabel = new JLabel("Human");

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;

        this.add(HumanLabel, constraints);
    }


    private void addTigerLabel() {
        JLabel TigerLabel = new JLabel("Tiger");

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;

        this.add(TigerLabel, constraints);
    }

    
    private void addElephanteLabel() {
        JLabel ElephanteLabel = new JLabel("Elephante");

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;

        this.add(ElephanteLabel, constraints);
    }


 public static void main(String args[])
    {
        Gui gui = new Gui();
        gui.setVisible(true);
        gui.pack();
    }
}
