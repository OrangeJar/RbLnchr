package net.minecraft.launcher.ui.bottombar;

import net.minecraft.launcher.Launcher;
import net.minecraft.launcher.updater.VersionManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigButtonPanel extends JPanel{

   private final Launcher launcher;
   private final JButton configButton = new JButton("Обновить конфиг");


   public ConfigButtonPanel(Launcher launcher) {
      this.launcher = launcher;
      this.createInterface();
      this.configButton.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
           //              VersionManager.downloadConfig();
          }
      });
   }

   protected void createInterface() {
      this.setLayout(new GridBagLayout());
      GridBagConstraints constraints = new GridBagConstraints();
      constraints.fill = 1;
      constraints.weightx = 1.0D;
      constraints.weighty = 1.0D;
      constraints.gridy = 0;
      constraints.gridx = 0;
      this.add(this.configButton, constraints);
      //this.configButton.setFont(this.configButton.getFont().deriveFont(1, (float)(this.configButton.getFont().getSize() + 2)));
   }

   public boolean shouldReceiveEventsInUIThread() {
      return true;
   }

   public Launcher getLauncher() {
      return this.launcher;
   }
}
