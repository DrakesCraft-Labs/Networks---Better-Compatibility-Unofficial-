package io.github.sefiraat.networks.network.barrel;

import io.github.mooy1.infinityexpansion.items.storage.StorageCache;
import io.github.sefiraat.networks.network.stackcaches.BarrelIdentity;
import io.github.sefiraat.networks.network.stackcaches.ItemRequest;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public class InfinityBarrel extends BarrelIdentity {

    @Nonnull
    private final StorageCache cache;

    @ParametersAreNonnullByDefault
    public InfinityBarrel(Location location, ItemStack itemStack, int amount, StorageCache cache) {
        super(location, itemStack, amount, BarrelType.INFINITY);
        this.cache = cache;
    }

    @Nullable
    @Override
    public ItemStack requestItem(@Nonnull ItemRequest itemRequest) {
        BlockMenu blockMenu = BlockStorage.getInventory(this.getLocation());
        if (blockMenu == null) return null;
        final ItemStack live = blockMenu.getItemInSlot(this.getOutputSlot());
        // Return a clone so callers cannot corrupt the live slot via setAmount()
        return live == null ? null : live.clone();
    }

    @Override
    public void depositItemStack(ItemStack[] itemsToDeposit) {
        cache.depositAll(itemsToDeposit, true);
    }

    @Nullable
    @Override
    public ItemStack getItemStack() {
        final BlockMenu blockMenu = BlockStorage.getInventory(getLocation());
        if (blockMenu == null) {
            return null;
        }
        final ItemStack output = blockMenu.getItemInSlot(getOutputSlot());
        if (output == null) {
            return null;
        }
        final ItemStack clone = output.clone();
        clone.setAmount(1);
        return clone;
    }

    @Override
    public int getAmount() {
        final Config config = BlockStorage.getLocationInfo(getLocation());
        final String stored = config == null ? null : config.getString("stored");
        if (stored == null) {
            return 0;
        }
        try {
            return Math.max(0, Integer.parseInt(stored));
        } catch (NumberFormatException ignored) {
            return 0;
        }
    }

    @Override
    public int getInputSlot() {
        return 10;
    }

    @Override
    public int getOutputSlot() {
        return 16;
    }
}
