public class Item
{
    private String name;
    private int keyCode;

    public Item(String name, int keyCode)
    {
        this.name = name;
        this.keyCode = keyCode;
    }

    public String getName()
    {
        return name;
    }

    public boolean isKey()
    {
        return keyCode != -1;
    }

    public int getKeyCode()
    {
        return keyCode;
    }

    public String getDescription()
    {
        if (isKey())
        {
            return name + " (Key)";
        }

        return name + " (Not a key)";
    }
}