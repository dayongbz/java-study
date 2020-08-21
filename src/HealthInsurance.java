public enum HealthInsurance {
    LEVEL_ONE(1000,0.01),
    LEVEL_TWO(2000,0.02),
    LEVEL_THREE(3000, 0.032), LEVEL_FOUR(4000,0.045),LEVEL_FIVE(5000,0.056),LEVEL_SIX(6000,0.071);
    private final int maxSalary;
    private final double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
        switch (salary){
            case 1000:
                return LEVEL_ONE;
            case 2000:
                return LEVEL_TWO;
            case 3000:
                return LEVEL_THREE;
            case 4000:
                return LEVEL_FOUR;
            case 5000:
                return LEVEL_FIVE;
            default:
                return LEVEL_SIX;
        }
    }

    public static void main(String[] args) {
        HealthInsurance health = HealthInsurance.getHealthInsurance(3000);
        System.out.println(health);
        System.out.println(health.getRatio());
    }
}
