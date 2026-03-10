public class Room
{
    private String name;
    private String clue;

    private Lock doorLock;
    private Item hiddenItem;

    private boolean searched;

    public Room(String name, String clue, Lock doorLock, Item hiddenItem)
    {
        this.name = name;
        this.clue = clue;
        this.doorLock = doorLock;
        this.hiddenItem = hiddenItem;
        searched = false;
    }

    public String getName()
    {
        return name;
    }

    public String search()
    {
        if (!searched)
        {
            searched = true;
            return "You search the room... " + clue;
        }

        return "You already searched. Nothing new stands out.";
    }

    public Item takeItem()
    {
        if (!searched)
        {
            return null;
        }

        if (hiddenItem == null)
        {
            return null;
        }

        Item found = hiddenItem;
        hiddenItem = null;
        return found;
    }

    public boolean tryUnlockDoor(Item item)
    {
        return doorLock.tryUnlock(item);
    }

    public boolean isDoorLocked()
    {
        return doorLock.isLocked();
    }
}