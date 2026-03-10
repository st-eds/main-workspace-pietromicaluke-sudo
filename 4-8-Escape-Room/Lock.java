public class Lock
{
    private boolean locked;
    private int requiredKeyCode;

    public Lock(int requiredKeyCode)
    {
        locked = true;
        this.requiredKeyCode = requiredKeyCode;
    }

    public boolean isLocked()
    {
        return locked;
    }

    public boolean tryUnlock(Item item)
    {
        if (item == null)
        {
            return false;
        }

        if (!item.isKey())
        {
            return false;
        }

        if (item.getKeyCode() != requiredKeyCode)
        {
            return false;
        }

        locked = false;
        return true;
    }
}