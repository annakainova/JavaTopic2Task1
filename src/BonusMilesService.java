public class BonusMilesService {
    public int calculate(int price) {
        int bonusCost = 20;
        int bonus = price / bonusCost;
        return bonus;
    }
}
