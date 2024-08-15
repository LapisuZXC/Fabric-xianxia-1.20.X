package net.lapisu.xianxiamod.cultivation.stats;



// change to float everywhere

public class PlayerBodyStats extends Stats{
    private float strenghtValue = 0.0f;
    private float agilityValue = 0.0f;
    private float resistancesModifier = 0.0f;
    private float hpModifier = 2.0f;
    protected Stage stage = Stage.MORTAL;
    public enum Stage{
        MORTAL(0.0f, 2.0f),
        BODY_BASIC_REINFORCEMENT(0.5f, 8.0f),
        BODY_ADVANCED_REINFORCEMENT(1.0f, 16.0f),
        BODY_TRANSFORMATION(2.0f, 32.0f),
        EIGHT_GATES(8.0f, 64.0f),
        BODY_ASCENSION(16.0f, 88.0f),
        ;
        private  float stageModifier;
        private  float stageMaximum;
        Stage(float stageModifier, float stageMaximum){
            this.stageModifier = stageModifier;
            this.stageMaximum = stageMaximum;
        }

        public float getStageMaximum(){
            return this.stageMaximum;
        }

        public void setStageMaximum(float stageMaximum){
            this.stageMaximum = stageMaximum;
        }
        public float getStageModifier(){
            return this.stageModifier;
        }

        public void setStageModifier(float stageModifier){
            this.stageModifier = stageModifier;
        }
    }

    public PlayerBodyStats(){
        super();
        this.setStats((this.getStrenghtValue() + this.getAgilityValue()) / 2.0f);
    }




    public float getStrenghtValue(){
        return this.strenghtValue;
    }

    public void setStrenghtValue(float strenghtValue){
        this.strenghtValue = strenghtValue;
    }

    public float getAgilityValue(){
        return this.agilityValue;
    }

    public void setAgilityValue(float agilityValue){
        this.agilityValue = agilityValue;
    }


    public float getResistancesModifier(){
        return this.resistancesModifier;
    }

    public void setResistancesModifier(float resistancesModifier){
        this.resistancesModifier = resistancesModifier;
    }

    public float getHpModifier(){
        return this.hpModifier;
    }

    public void setHpModifier(float hpModifier){
        this.hpModifier = hpModifier;
    }

    public Stage getStage(){
        return this.stage;
    }
}
