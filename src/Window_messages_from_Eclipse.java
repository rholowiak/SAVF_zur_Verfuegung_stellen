/*
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;


public class SAVF_zur_Verfuegung_stellen {

    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("SAVF_zur_Verfuegung_stellen / download from NLBAID07 and save into C:/infor/ folder");

        // Set GridLayout with 3 column
        GridLayout layout = new GridLayout(2, false);
        shell.setLayout(layout);

        // Create labels to display messages
        Label label1 = new Label(shell, SWT.NONE);
        label1.setText("Input Bibliothek and SL number divided with / slash sample -> BDVISAVH1/SL78442");
        label1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        Label label2 = new Label(shell, SWT.NONE);
        label2.setText("This is the second message!");
        label2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

        Label label3 = new Label(shell, SWT.NONE);
        label3.setText("This is the third message!");
        label3.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        
        // Set the foreground (text) color to black
        Color black = display.getSystemColor(SWT.COLOR_BLACK);
        label1.setForeground(black);

        // Set the background color to yellow
        Color yellow = display.getSystemColor(SWT.COLOR_YELLOW);
        label1.setBackground(yellow);

        shell.setSize(900, 450);
        
        //read shell color and prompt in window
        Label label4 = new Label(shell, SWT.NONE);
        label4.setText(""+shell.getBackground());
        
        Color green = display.getSystemColor(SWT.COLOR_GREEN);
        shell.setBackground(green);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }

	
}

 */