package Game.sevice;

public interface IPlayerService {
    public void register(String accont, String password, String name);
    public void Logon(String account, String password);
    public boolean SignIn();
    public void SignInCount();
    public int anInt();
}
