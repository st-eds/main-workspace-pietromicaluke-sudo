class GameCharacter
{
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int attackPower;

    public GameCharacter(String name, int maxHealth, int attackPower)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.attackPower = attackPower;
    }

    public String getName()
    {
        return name;
    }

    public int getCurrentHealth()
    {
        return currentHealth;
    }

    public int getAttackPower()
    {
        return attackPower;
    }

    public void takeDamage(int amount)
    {
        if (amount > 0)
        {
            currentHealth -= amount;

            if (currentHealth < 0)
            {
                currentHealth = 0;
            }
        }
    }

    public void heal(int amount)
    {
        if (amount > 0)
        {
            currentHealth += amount;
            if (currentHealth > maxHealth)
            {
                currentHealth = maxHealth;
            }
        }
    }

    public void attack(GameCharacter target)
    {
        target.takeDamage(attackPower);
    }

    public boolean isDefeated()
    {
        return currentHealth == 0;
    }
}