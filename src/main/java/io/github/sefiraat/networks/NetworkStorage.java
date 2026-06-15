package io.github.sefiraat.networks;

import io.github.sefiraat.networks.network.NodeDefinition;
import lombok.experimental.UtilityClass;
import org.bukkit.Location;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@UtilityClass
public class NetworkStorage {

    private static final Map<Location, NodeDefinition> ALL_NETWORK_OBJECTS = new ConcurrentHashMap<>();

    public static void removeNode(Location location) {
        ALL_NETWORK_OBJECTS.remove(location);
    }

    public static Map<Location, NodeDefinition> getAllNetworkObjects() {
        return ALL_NETWORK_OBJECTS;
    }
}
