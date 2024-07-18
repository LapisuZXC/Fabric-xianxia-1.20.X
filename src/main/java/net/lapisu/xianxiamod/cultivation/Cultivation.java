package net.lapisu.xianxiamod.cultivation;

import net.lapisu.xianxiamod.cultivation.stats.PlayerBodyStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerCultivationStats;
import net.lapisu.xianxiamod.cultivation.stats.PlayerSoulStats;

import java.math.BigDecimal;
import java.util.HashMap;

public class Cultivation implements ICultivation{
    protected HashMap<String, BigDecimal> stats = new HashMap<String, BigDecimal>(5);

    public Cultivation() {
        stats.put("qi", BigDecimal.ZERO);
        stats.put("hp", BigDecimal.ZERO);
        stats.put("soulhp", BigDecimal.ZERO);
        stats.put("soulqi", BigDecimal.ZERO);
        stats.put("totalpower", BigDecimal.ZERO);
    }




    @Override
    public BigDecimal[] getBodyStats(PlayerBodyStats stat) {
        return new BigDecimal[]{stats.get("hp")};
    }

    @Override
    public void setBodyStats(PlayerBodyStats stat, BigDecimal[] stats) {
        if (stat.getStats() != BigDecimal.ZERO) {
            this.stats.replace("hp", stat.getStats().multiply(stat.getHpModifier()));
        }
    }


    public BigDecimal[] getCultivationStats(PlayerCultivationStats stat) {
        return new BigDecimal[]{stats.get("qi")};
    }

    @Override
    public void setCultivationStats(PlayerCultivationStats stat, BigDecimal[] stats) {
        if (stat.getStats() != BigDecimal.ZERO) {
            this.stats.replace("qi", stat.getStats().multiply(stat.getQiModifier()));
        }
    }

    @Override
    public BigDecimal[] getSoulStats(PlayerSoulStats stat) {
        return new BigDecimal[]{stats.get("soulhp"), stats.get("soulqi")};
    }

    @Override
    public void setSoulStats(PlayerSoulStats stat, BigDecimal[] stats) {
        if (stat.getStats() != BigDecimal.ZERO) {
            this.stats.replace("soulhp", stat.getStats().multiply(stat.getSoulHPModifier()));
            this.stats.replace("soulqi", stat.getStats().multiply(stat.getSoulQiModifier()));
        }
    }
}
