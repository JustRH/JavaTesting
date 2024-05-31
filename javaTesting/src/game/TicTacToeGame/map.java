package game.TicTacToeGame;

import javax.swing.*;
import java.awt.*;

public class map extends JPanel {
    private static final int CELL_SIZE = 100; // 每个格子的大小
    private static final int[][] mapChoice = new int[3][3]; // 地图选择

    public map() {
        setPreferredSize(new Dimension(300, 300)); // 设置面板大小
        initMap(); // 初始化地图
    }

    private void initMap() {
        // 初始化地图，全部设置为空白
        for (int i = 0; i < mapChoice.length; i++) {
            for (int j = 0; j < mapChoice[i].length; j++) {
                mapChoice[i][j] = 0;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 根据地图选择绘制图形
        for (int i = 0; i < mapChoice.length; i++) {
            for (int j = 0; j < mapChoice[i].length; j++) {
                int x = j * CELL_SIZE;
                int y = i * CELL_SIZE;

                // 绘制格子
                g.drawRect(x, y, CELL_SIZE, CELL_SIZE);

                // 根据地图选择绘制文本
                if (mapChoice[i][j] == 1) {
                    g.drawString("PLAYER", x + 10, y + 20);
                } else if (mapChoice[i][j] == 2) {
                    g.drawString("AI/COM", x + 10, y + 20);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Tic Tac Toe Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(new map());
            frame.pack();
            frame.setLocationRelativeTo(null); // 将窗口置于屏幕中央
            frame.setVisible(true);
        });
    }
}
