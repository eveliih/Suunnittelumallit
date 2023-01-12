package factorymethod;

public class Vahtimestari extends AterioivaOtus {

  @Override
  public Juoma createJuoma() {
    return new Kahvi();
  }
  
}
