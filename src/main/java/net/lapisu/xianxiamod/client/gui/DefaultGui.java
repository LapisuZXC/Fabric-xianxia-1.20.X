package net.lapisu.xianxiamod.client.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;

public class DefaultGui extends LightweightGuiDescription {
    public DefaultGui(){
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(300,200);
        root.setInsets(Insets.ROOT_PANEL);

    }
}
