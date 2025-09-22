import javax.swing.*;

class UsingJOptionPaneDialog {
    public static void main(String[] args) {
            for (int i = 1; i <= 5;i++){
          
            String name = JOptionPane.showInputDialog("Enter your name:");
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Let's try again.");
            }
        }
    }
}
