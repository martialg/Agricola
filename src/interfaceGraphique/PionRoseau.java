package interfaceGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class PionRoseau extends JButton {
    private int size;
    private Color color;

    public PionRoseau() {
        super();
        this.color = new Color(0xFFFFFF);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusable(false);
        setPreferredSize(new Dimension(20, 20));
        setRolloverEnabled(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        this.size = Math.min(getWidth(), getHeight()) - 4;
        int totalSize = size + 4;
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Color baseColor = color;
        
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
