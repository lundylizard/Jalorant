package me.lundy.jalorant.entities;

import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("puuid")
    private String playerUuid;
    private String region;
    @SerializedName("account_level")
    private int accountLevel;
    private String name;
    private String tag;
    private PlayerCard card;
    @SerializedName("last_update")
    private String lastUpdate;
    @SerializedName("last_update_raw")
    private int lastUpdateRaw;

    public String getPlayerUuid() {
        return playerUuid;
    }

    public String getRegion() {
        return region;
    }

    public int getAccountLevel() {
        return accountLevel;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public PlayerCard getCard() {
        return card;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public int getLastUpdateRaw() {
        return lastUpdateRaw;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerUuid='" + playerUuid + '\'' +
                ", region='" + region + '\'' +
                ", accountLevel=" + accountLevel +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", lastUpdateRaw=" + lastUpdateRaw +
                '}';
    }

    public static class PlayerData {
        public Player data;
    }

}
