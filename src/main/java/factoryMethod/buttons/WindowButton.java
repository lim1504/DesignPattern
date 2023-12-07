package factoryMethod.buttons;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 실제 윈도우 버튼 구현 및 확장
 */
public class WindowButton implements Button {
    JPanel panel = new JPanel();
    JFrame fream = new JFrame();
    JButton button;


    public void render() {
        fream.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        fream.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        fream.setSize(320, 200);
        fream.setVisible(true);
        onClick();
    }

    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fream.setVisible(false);
                System.exit(0);
            }
        });
    }
}
