package virtual_pet;

public class VirtualPet {
    public int hungerLevel;
    public int thirstLevel;
    public int happinessLevel;

    public VirtualPet(int hungerLevel, int thirstLevel, int happinessLevel) {
        this.hungerLevel(hungerLevel);
        this.thirstLevel = thirstLevel;
        this.happinessLevel = happinessLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void tick() {
        hungerLevel = hungerLevel + 10;
        thirstLevel = thirstLevel + 10;
        happinessLevel = happinessLevel - 3;
    }

    public void hungerLevel(int hungerLevelIncrease) {
        hungerLevel = hungerLevel + hungerLevelIncrease;
    }

    public void thirstLevel(int thirstLevelIncrease) {
        thirstLevel = thirstLevel + thirstLevelIncrease;
    }

    public void happinessLevel(int happinessLevelDecrease) {
        happinessLevel = happinessLevel - happinessLevelDecrease;
    }

    public void feed(int hungerLevelDecrease) {
        if (hungerLevel > hungerLevelDecrease) {
            hungerLevel = hungerLevel - hungerLevelDecrease;
            thirstLevel = thirstLevel + 5;
        } else {
            hungerLevel = 10;
            thirstLevel = thirstLevel + 5;
        }
    }

    public void drink(int thirstLevelDecrease) {
        if (thirstLevel > thirstLevelDecrease) {
            thirstLevel = thirstLevel - thirstLevelDecrease;
        } else {
            thirstLevel = 15;
        }
    }

    public void cuddle(int happinessLevelIncrease) {
        if (happinessLevel < happinessLevelIncrease) {
            happinessLevel = happinessLevel + happinessLevelIncrease;
        } else {
            happinessLevel = 5;
        }
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
}
