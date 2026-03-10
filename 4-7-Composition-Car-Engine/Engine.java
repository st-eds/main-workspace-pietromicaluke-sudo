public class Engine
{
    private int horsepower;
    private boolean running;

    public Engine(int horsepower)
    {
        this.horsepower = horsepower;
        running = false;
    }

    public int getHorsepower()
    {
        return horsepower;
    }

    public boolean isRunning()
    {
        return running;
    }

    public void start()
    {
        running = true;
    }

    public void stop()
    {
        running = false;
    }
}