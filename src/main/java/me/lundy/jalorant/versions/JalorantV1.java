package me.lundy.jalorant.versions;

import me.lundy.jalorant.Request;
import me.lundy.jalorant.entities.Player;

import java.io.IOException;

public class JalorantV1 {


    public Player getPlayer(String username, String tag) throws IOException {
        Request request = new Request("https://api.henrikdev.xyz/valorant/v1/account/" + username + "/" + tag);
        return request.getAs(Player.class).getData();
    }

    public Player getPlayer(String uuid) throws IOException {
        Request request = new Request("https://api.henrikdev.xyz/valorant/v1/by-puuid/account/" + uuid);
        return request.getAs(Player.class).getData();
    }

}
