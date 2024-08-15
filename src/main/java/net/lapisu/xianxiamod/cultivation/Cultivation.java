package net.lapisu.xianxiamod.cultivation;

import net.lapisu.xianxiamod.cultivation.stats.PlayerBodyStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerCultivationStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerSoulStats;

import net.lapisu.xianxiamod.mixin.PlayerEntityMixin;
import net.lapisu.xianxiamod.mixininterfaces.PlayerMixinInterface;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;


public class Cultivation implements ICultivation{
    protected NbtCompound stats = new NbtCompound();
    protected NbtCompound rawStats = new NbtCompound();


    public PlayerBodyStats playerBodyStats = new PlayerBodyStats();
    public PlayerCultivationStats playerCultivationStats;
    public PlayerSoulStats playerSoulStats;
    private final PlayerEntity playerEntity;





    public Cultivation(PlayerEntity playerEntity) {
        //set all modifiers stats to 0
        this.rawStats.putFloat("Strength", 0.0f);
        this.rawStats.putFloat("Agility", 0.0f);
        this.rawStats.putFloat("Energy", 0.0f);
        this.rawStats.putFloat("Spirit", 0.0f);
        this.rawStats.putFloat("Soul Power", 0.0f);

        //set all scalable stats to 0
        this.stats.putFloat("qi", 0.0f);
        this.stats.putFloat("hp", 0.0f);
        this.stats.putFloat("soulhp", 0.0f);
        this.stats.putFloat("soulqi", 0.0f);
        this.stats.putFloat("totalpower", 0.0f);
        //just in case
        this.playerEntity =  playerEntity;


    }

    public void writeNbt(@NotNull NbtCompound nbt) {
        nbt.put("stats", this.stats);
        nbt.put("rawstats", this.rawStats);
    }

    public void readNbt(@NotNull NbtCompound nbt) {
        this.stats = nbt.getCompound("stats");
        this.rawStats = nbt.getCompound("rawstats");
    }
    public PlayerEntity getPlayerEntity() {
        return playerEntity;
    }


    @Override
    public float getBodyStats() {
        return this.stats.getFloat("hp");
    }

    @Override
    public void updateBodyStats() {
        Cultivation cultivation = ((PlayerMixinInterface)playerEntity).getCultivation();
        this.rawStats.putFloat("Strength", cultivation.playerBodyStats.getStrenghtValue());
        this.stats.remove("hp");
        this.stats.putFloat("hp", cultivation.playerBodyStats.getStrenghtValue() * cultivation.playerBodyStats.getHpModifier());
    }




    @Override
    public float getCultivationStats() {
        return  this.stats.getFloat("qi");
    }

    @Override
    public void updateCultivationStats() {

        Cultivation cultivation = ((PlayerMixinInterface)playerEntity).getCultivation();
        this.rawStats.putFloat("Energy", cultivation.playerCultivationStats.getStats());
        this.stats.remove("qi");
        this.stats.putFloat("qi", cultivation.playerCultivationStats.getStats() * cultivation.playerCultivationStats.getQiModifier());
    }

    @Override
    public float getSoulHPStats() {
        return this.stats.getFloat("soulhp");
    }

    @Override
    public float getSoulQiStats() {
        return this.stats.getFloat("soulqi");
    }

    @Override
    public void updateSoulStats() {
        Cultivation cultivation = ((PlayerMixinInterface)playerEntity).getCultivation();

        this.rawStats.putFloat("Soul Power", cultivation.playerSoulStats.getStats());
        this.stats.remove("soulhp");
        this.stats.putFloat("soulhp", cultivation.playerSoulStats.getStats() * cultivation.playerSoulStats.getSoulHPModifier());
        this.stats.remove("soulqi");
        this.stats.putFloat("soulqi", cultivation.playerSoulStats.getStats() * cultivation.playerSoulStats.getSoulQiModifier());
    }


    @Override
    public float calculateTotalPower(PlayerCultivationStats stat, PlayerBodyStats bodyStats, PlayerSoulStats soulStats) {
        return 0;
    }

    public Text TrainBody(PlayerBodyStats playerBodyStats) {
        switch (playerBodyStats.getStage()) {
            case MORTAL:
                if (playerBodyStats.getStats() < playerBodyStats.getStage().getStageMaximum()) {
                    playerBodyStats.setStats(playerBodyStats.getStats() + 0.5f);
                    return Text.literal("Training Completed. Body Stats: " + playerBodyStats.getStats());
                } else {
                    return Text.literal("You have reached maximum of mortal world. Body Stats: " + playerBodyStats.getStats());
                }


            case BODY_BASIC_REINFORCEMENT:
                if (playerBodyStats.getStats() < playerBodyStats.getStage().getStageMaximum()) {
                    playerBodyStats.setStats(playerBodyStats.getStats() + 1.0f);
                    return Text.literal("Training Completed. Body Stats: " + playerBodyStats.getStats());
                } else {
                    return Text.literal("You have reached maximum of your world. Body Stats: " + playerBodyStats.getStats());
                }

            case BODY_ADVANCED_REINFORCEMENT:
                if (playerBodyStats.getStats() < playerBodyStats.getStage().getStageMaximum()) {
                    playerBodyStats.setStats(playerBodyStats.getStats() + 2.0f);
                    return Text.literal("Training Completed. Body Stats: " + playerBodyStats.getStats());
                } else {
                    return Text.literal("You have reached maximum of your world. Body Stats: " + playerBodyStats.getStats());
                }

            case BODY_TRANSFORMATION:
                if (playerBodyStats.getStats() < playerBodyStats.getStage().getStageMaximum()) {
                    playerBodyStats.setStats(playerBodyStats.getStats() + 4.0f);
                    return Text.literal("Training Completed. Body Stats: " + playerBodyStats.getStats());
                } else {
                    return Text.literal("You have reached maximum of your world. Body Stats: " + playerBodyStats.getStats());
                }

            case EIGHT_GATES:
                if (playerBodyStats.getStats() < playerBodyStats.getStage().getStageMaximum()) {
                    playerBodyStats.setStats(playerBodyStats.getStats() + 8.0f);
                    return Text.literal("Training Completed. Body Stats: " + playerBodyStats.getStats());
                } else {
                    return Text.literal("You have reached maximum of your world. Body Stats:" + playerBodyStats.getStats());
                }

            case BODY_ASCENSION:
                if (playerBodyStats.getStats() < playerBodyStats.getStage().getStageMaximum()) {
                    playerBodyStats.setStats(playerBodyStats.getStats() + 16.0f);
                    return Text.literal("Training Completed. Body Stats:" + playerBodyStats.getStats());
                } else {
                    return Text.literal("You have reached maximum of Body cultivation. Body Stats:" + playerBodyStats.getStats());
                }
        }
        return Text.literal("CRITICAL ERROR INSIDE TRAIN BODY");
    }

}
