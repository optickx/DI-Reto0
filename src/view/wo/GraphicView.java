package view.wo;

import javax.swing.JLabel;
import view.View;

/**@author Roke y Dani
 */
public class GraphicView extends javax.swing.JFrame implements View {

    private JLabel jLabel;
    private GraphicView graphicView;
    /**creates new form GraphicView
     */
    public GraphicView() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param greeting the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void showGreeting(String greeting) {
        graphicView = new GraphicView();
        graphicView.setBounds(0,0,700,500);
        graphicView.setVisible(true);
        jLabel = new JLabel(greeting);
        jLabel.setBounds(150,200,400,30);
        jLabel.setVisible(true);
        graphicView.getContentPane().add(jLabel);
    }
}
