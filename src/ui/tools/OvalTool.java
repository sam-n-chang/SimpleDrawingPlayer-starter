package ui.tools;


import model.Oval;
import model.Rectangle;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;


public class OvalTool extends ShapeTool {
    public OvalTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }


    //EFFECTS: Returns the string for the label.
    @Override
    public String getLabel() {
        return "Oval";
    }

    //EFFECTS: Constructs and returns the new shape
    @Override
    public void makeShape(MouseEvent e) {
        shape = new Oval(e.getPoint(), editor.getMidiSynth());
    }
}
