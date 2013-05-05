package interfaceGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class GradientCircularButton extends JButton {

    private int size;
    private Color color;
    private Color pressedColor;
    private Color overColor;
    private Color selectedColor;

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setColorGris(){
        this.color = new Color(0xABABAB);
    }

    public GradientCircularButton(String s, Color over_color, Color pressed_color) {
        super();
        this.color = new Color(0xABABAB);
        this.pressedColor = pressed_color;
        this.overColor = over_color;
        this.selectedColor = this.pressedColor;
        setText(s);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new Dimension(68, 65));
        setRolloverEnabled(true);
        setForeground(Color.BLACK);
    }
    
    public GradientCircularButton(String s, Color color) {
        super();
        this.color = color;
        setText(s);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new Dimension(68, 65));
        setRolloverEnabled(true);
        setForeground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        this.size = Math.min(getWidth(), getHeight()) - 4;
        int totalSize = size + 4;
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Color baseColor = color;
        if (model.isPressed()) {
            baseColor = pressedColor;
            setForeground(new Color(0, 0, 0));
        } else if (model.isRollover()) {
            baseColor = overColor;
            setForeground(new Color(0, 0, 0));
        } else if (model.isSelected()) {
            baseColor = selectedColor;
            setForeground(new Color(0, 0, 0));
        } else if (!model.isEnabled()) {
            baseColor = new Color(192, 192, 192);
            setForeground(new Color(82, 82, 82));
        }
        GradientPaint outerBevel = new GradientPaint(0.0F, 0.0F, new Color(
                0.0F, 0.0F, 0.0F, 0.15F), 0.0F, totalSize, new Color(1.0F,
                1.0F, 1.0F, 0.25F));
        graphics.setPaint(outerBevel);
        paintInsetCircle(graphics, totalSize, 0);

        float colorComponents[] = baseColor.getRGBComponents(new float[4]);
        Color shadowColor = new Color(colorComponents[0] * 0.52F,
                colorComponents[1] * 0.63F, colorComponents[2] * 0.69F);

        graphics.setPaint(shadowColor);
        graphics.setPaint(baseColor);
        paintInsetCircle(graphics, totalSize, 3);

        GradientPaint highlight = new GradientPaint(0.0F, 0.0F, new Color(1.0F,
                1.0F, 1.0F, 1.0F), 0.0F, (float) totalSize * .45F, new Color(
                1.0F, 1.0F, 1.0F, 0.0F));

        graphics.setPaint(highlight);
        paintInsetCircle(graphics, totalSize, 4);

        paintInsetCircle(graphics, totalSize, 8);

        super.paintComponent(graphics);

    }

    private void paintInsetCircle(Graphics2D graphics, int size, int inset) {
        graphics.fillOval(inset, inset, size - inset * 2, size - inset * 2);
    }
}
