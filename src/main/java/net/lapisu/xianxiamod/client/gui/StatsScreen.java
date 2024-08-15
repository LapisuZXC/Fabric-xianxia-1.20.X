package net.lapisu.xianxiamod.client.gui;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.lapisu.xianxiamod.cultivation.Cultivation;
import net.lapisu.xianxiamod.mixininterfaces.PlayerMixinInterface;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



@Environment(EnvType.CLIENT)
public class StatsScreen extends Screen {

    public static final Identifier BACKGROUND_TEXTURE = new Identifier("textures/gui/stats.png");
    public static final String STATS_SCREEN_ID = "stats_screen";

    private PlayerEntity playerEntity;
    private Cultivation cultivation;
    private int backgroundWidth = 200;
    private int backgroundHeight = 215;
    private int x;
    private int y;


    public StatsScreen() {
        super(Text.translatable("screen.xianxia-mod.stats"));
    }

    @Override
    protected void init() {
        super.init();
        this.playerEntity = this.client.player;
        this.cultivation = ((PlayerMixinInterface) this.playerEntity).getCultivation();
        this.x = (this.width - this.backgroundWidth) / 2;
        this.y = (this.height - this.backgroundHeight) / 2;
    }

    @Override
    public boolean shouldPause() {
        return false;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);
        int i = (this.width - this.backgroundWidth) / 2;
        int j = (this.height - this.backgroundHeight) / 2;
        context.drawTexture(BACKGROUND_TEXTURE, i, j, 0, 0, this.backgroundWidth, this.backgroundHeight);

        if (this.client.player != null) {
            //int scaledWidth = this.client.getWindow().getScaledWidth();
            //int scaledHeight = this.client.getWindow().getScaledHeight();
            //InventoryScreen.drawEntity(context, scaledWidth / 2 - 75, scaledHeight / 2 - 40, 30, -28, 0, this.client.player);

            // Top label
            Text playerName = Text.translatable("text.xianxia-mod.gui.title", playerEntity.getName().getString());
            context.drawText(this.textRenderer, playerName, this.x - this.textRenderer.getWidth(playerName) / 2 + 120, this.y + 7, 0x3F3F3F, false);

            String hpstr = "HP:" + " " + cultivation.getBodyStats();
            context.drawText(this.textRenderer, Text.literal(hpstr), this.x - this.textRenderer.getWidth(hpstr) / 2 + 120, this.y + 25, 0x3F3F3F, false);


            //hp

            String qistr = "Qi:" + " " + cultivation.getSoulQiStats();
            context.drawText(this.textRenderer, Text.literal(qistr), this.x - this.textRenderer.getWidth(qistr) / 2 + 120, this.y + 45, 0x3F3F3F, false);

            String soulhpstr = "Soul HP:" + " " + cultivation.getSoulHPStats();
            context.drawText(this.textRenderer, Text.literal(soulhpstr), this.x - this.textRenderer.getWidth(soulhpstr) / 2 + 120, this.y + 65, 0x3F3F3F, false);

        }


    }
}