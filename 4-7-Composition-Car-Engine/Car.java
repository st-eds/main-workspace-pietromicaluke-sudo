public class Car
{
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
        engine = null;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public void installEngine(Engine engine)
    {
        this.engine = engine;
    }

    public void removeEngine()
    {
        engine = null;
    }

    public boolean hasEngine()
    {
        return engine != null;
    }

    
    public int getEngineHorsepower()
    {
        if (engine == null)
        {
            return -1;
        }

        return engine.getHorsepower();
    }

    public void start()
    {
        if (engine == null)
        {
            System.out.println("Cannot start: no engine installed.");
            return;
        }

        engine.start();
        System.out.println("Car started.");
    }

    public void stop()
    {
        if (engine == null)
        {
            System.out.println("Cannot stop: no engine installed.");
            return;
        }

        engine.stop();
        System.out.println("Car stopped.");
    }

    public String getStatus()
    {
        int hp = getEngineHorsepower();

        if (hp == -1)
        {
            return make + " " + model + " | Engine: none";
        }

        String state;

        if (engine.isRunning())
        {
            state = "running";
        }
        else
        {
            state = "stopped";
        }

        return make + " " + model + " | Engine: " + hp + " HP (" + state + ")";
    }
}