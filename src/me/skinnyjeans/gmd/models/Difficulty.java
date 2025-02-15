package me.skinnyjeans.gmd.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Difficulty {
    private String difficultyName;
    private String userPrefix;
    private int affinityRequirement;
    private int damageDoneByMobs;
    private int damageDoneOnMobs;
    private int experienceMultiplier;
    private int hungerDrainChance;
    private int doubleLootChance;
    private int maxEnchants;
    private int maxEnchantLevel;
    private int difficultyUntil;
    private int damageByRangedMobs;
    private int doubleDurabilityDamageChance;
    private double armorDropChance;
    private double chanceToEnchant = Double.NaN;
    private double chanceToHaveArmor;
    private double weaponDropChance;
    private boolean allowPVP;
    private boolean keepInventory;
    private boolean effectsWhenAttacked;
    private List<String> disabledCommands = new ArrayList<>();
    private List<String> mobsIgnoredPlayers = new ArrayList<>();
    private HashMap<EquipmentItems, Double> armorChance = new HashMap<>();
    private HashMap<ArmorTypes, Integer> armorDamageMultipliers = new HashMap<>();

    public Difficulty(String name) { difficultyName = name; }

    public String getDifficultyName() { return difficultyName; }
    public String getPrefix() { return userPrefix; }
    public int getAffinity() { return affinityRequirement; }
    public int getUntil() { return difficultyUntil; }
    public int getDamageByMobs() { return damageDoneByMobs; }
    public int getDamageOnMobs() { return damageDoneOnMobs; }
    public int getExperienceMultiplier() { return experienceMultiplier; }
    public int getHungerDrain() { return hungerDrainChance; }
    public int getDoubleLoot() { return doubleLootChance; }
    public int getMaxEnchants() { return maxEnchants; }
    public int getMaxEnchantLevel() { return maxEnchantLevel; }
    public int getDamageByRangedMobs() { return damageByRangedMobs; }
    public int getDoubleDurabilityDamageChance() { return doubleDurabilityDamageChance; }
    public int getArmorDamageMultiplier(String type) { return armorDamageMultipliers.getOrDefault(type, -505); }
    public HashMap<ArmorTypes, Integer> getArmorDamageMultiplier() { return armorDamageMultipliers; }
    public boolean getAllowPVP() { return allowPVP; }
    public boolean getKeepInventory() { return keepInventory; }
    public boolean getEffectsOnAttack() { return effectsWhenAttacked; }
    public List<String> getIgnoredMobs() { return mobsIgnoredPlayers; }
    public List<String> getDisabledCommands() { return disabledCommands; }
    public double getEnchantChance(EquipmentItems type) { return armorChance.get(type); }
    public HashMap<EquipmentItems, Double> getEnchantChance() { return armorChance; }
    public double getArmorDropChance() { return armorDropChance; }
    public double getChanceToEnchant() { return chanceToEnchant; }
    public double getChanceToHaveArmor() { return chanceToHaveArmor; }
    public double getWeaponDropChance() { return weaponDropChance; }

    public void setPrefix(String value) { userPrefix = value; }
    public void setAffinity(int value) { affinityRequirement = value; }
    public void setUntil(int value) { difficultyUntil = value; }
    public void setDamageByMobs(int value) { damageDoneByMobs = value; }
    public void setDamageOnMobs(int value) { damageDoneOnMobs = value; }
    public void setExperienceMultiplier(int value) { experienceMultiplier = value; }
    public void setHungerDrain(int value) { hungerDrainChance = value; }
    public void setDoubleLoot(int value) { doubleLootChance = value; }
    public void setMaxEnchants(int value) { maxEnchants = value; }
    public void setMaxEnchantLevel(int value) { maxEnchantLevel = value; }
    public void setDamageByRangedMobs(int value) { damageByRangedMobs = value; }
    public void setDoubleDurabilityDamageChance(int value) { doubleDurabilityDamageChance = value; }
    public void setArmorDamageMultiplier(HashMap<ArmorTypes, Integer> value) { armorDamageMultipliers = value; }
    public void setAllowPVP(boolean value) { allowPVP = value; }
    public void setKeepInventory(boolean value) { keepInventory = value; }
    public void setEffectsOnAttack(boolean value) { effectsWhenAttacked = value; }
    public void setDisabledCommands(List<String> value) { disabledCommands = value; }
    public void setIgnoredMobs(List<String> value) { mobsIgnoredPlayers = value; }
    public void setEnchantChances(HashMap<EquipmentItems, Double> value) { armorChance = value; }
    public void setArmorDropChance(Double value) { armorDropChance = value; }
    public void setWeaponDropChance(Double value) { weaponDropChance = value; }
    public void setChanceToEnchant(Double value) { chanceToEnchant = value; }
    public void setChanceToHaveArmor(Double value) { chanceToHaveArmor = value; }
}
