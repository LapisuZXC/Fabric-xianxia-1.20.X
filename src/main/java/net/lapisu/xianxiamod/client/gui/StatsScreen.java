package net.lapisu.xianxiamod.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.lapisu.xianxiamod.XianXiaModClient;
import net.lapisu.xianxiamod.cultivation.Cultivation;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class StatsScreen extends HandledScreen<StatsScreenHandler> {
    private static final Identifier TEXTURE = new Identifier("minecraft", "textures/gui/container/dispenser.png");


    public StatsScreen(StatsScreenHandler handler, PlayerInventory inventory, Text title) {

        super(handler, inventory, title);
    }


    @Override
    public void render(DrawContext drawContext, int mouseX, int mouseY, float delta) {
        renderBackground(drawContext);
        super.render(drawContext, mouseX, mouseY, delta);
        drawMouseoverTooltip(drawContext, mouseX, mouseY);
    }

    @Override
    protected void init() {
        super.init();
        // Center the title
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(DrawContext drawContext, float delta, int mouseX, int mouseY) {
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawContext.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    protected void drawForeground(DrawContext drawContext, int mouseX, int mouseY){
        List<String> strings = new ArrayList<String>();
        XianXiaModClient.PLAYER


        for (Double b : stat){
            strings.add(b.toString());
        }
        this.textRenderer.draw(strings.get(0), (float) x + 20, (float) y + 20, 0xFFFFFF, false,
                drawContext.getMatrices().peek().getPositionMatrix(), drawContext.getVertexConsumers() ,
                TextRenderer.TextLayerType.NORMAL, 0x000000, 0);
    }

}

