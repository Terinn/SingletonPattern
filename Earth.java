public class Earth implements Planet{
    private static Earth instance;

    private Earth(){
    }
    public Earth getInstance(){
        if(instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
