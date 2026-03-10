public class Player
{
    private Item heldItem;

    public Player()
    {
        heldItem = null;
    }

    public String getHeldItemName()
    {
        if (heldItem == null)
        {
            return "none";
        }

        return heldItem.getName();
    }

    public boolean hasItem()
    {
        return heldItem != null;
    }

    public Item getHeldItem()
    {
        return heldItem;
    }

    public boolean pickUp(Item item)
    {
        if (item == null)
        {
            return false;
        }

        if (heldItem != null)
        {
            return false;
        }

        heldItem = item;
        return true;
    }

    public Item dropItem()
    {
        Item dropped = heldItem;
        heldItem = null;
        return dropped;
    }

    public String inspectHeldItem()
    {
        if (heldItem == null)
        {
            return "You are holding nothing.";
        }

        return "Held item: " + heldItem.getDescription();
    }
}