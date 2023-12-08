package java_tool_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ScreenshotTool extends JFrame {
    private JButton captureButton;

    public ScreenshotTool() {
        setTitle("截图工具");
        // 设置窗口关闭时退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        // 设置窗口在屏幕中间
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        captureButton = new JButton("截图-快捷键F3");
        // 将按钮添加到中间
        mainPanel.add(captureButton, BorderLayout.CENTER);

        add(mainPanel);
        // 添加事件监听
        captureButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                captureScreen();
            }
        });

        // 添加快捷键
        InputMap inputMap = mainPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        // 快捷键
        ActionMap actionMap = mainPanel.getActionMap();
        // F3
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "capture");
        actionMap.put("capture", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                captureScreen();
            }
        });
    }

    private void captureScreen() {
        try {
            // 获取屏幕尺寸
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            // 创建一个与屏幕尺寸相同的缓冲图像
            Robot robot = new Robot();
            BufferedImage screenshot = robot.createScreenCapture(new Rectangle(screenSize));

            // 设置默认保存路径为桌面
            String desktopPath = System.getProperty("user.home") + "/Desktop";
            JFileChooser fileChooser = new JFileChooser(desktopPath);
            fileChooser.setDialogTitle("保存截图");
            // 显示文件保存对话框，并获取用户选择，如果用户取消则返回
            int userSelection = fileChooser.showSaveDialog(this);
            // 没有填写文件名则直接返回，
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                // 将截图保存为文件
                if (!fileToSave.getName().endsWith(".png")) {
                    // 如果文件名没有以.png结尾，则添加
                    fileToSave = new File(fileToSave.getAbsolutePath() + ".png");
                }
                // 检查是否存在同名文件，如果存在则询问是否覆盖
                if (fileToSave.exists()) {
                    int result = JOptionPane.showConfirmDialog(this, "文件已存在，是否覆盖？", "文件已存在", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.NO_OPTION) {
                        return;
                    }
                }
                ImageIO.write(screenshot, "png", fileToSave);

                JOptionPane.showMessageDialog(this, "截图已保存");
            }
        } catch (AWTException | IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "截图失败: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                ScreenshotTool tool = new ScreenshotTool();
                tool.setVisible(true);
            }
        });
    }
}
