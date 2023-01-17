package boss;
import main.*;

public class BossVaateFactory implements VaateFactory {

	@Override
	public Farmarit createFarmarit() {
		// TODO Auto-generated method stub
		return new BossFarmarit();
	}

	@Override
	public TPaita createTPaita() {
		// TODO Auto-generated method stub
		return new BossTPaita();
	}

	@Override
	public Lippis createLippis() {
		// TODO Auto-generated method stub
		return new BossLippis();
	}

	@Override
	public Kengat createKengat() {
		// TODO Auto-generated method stub
		return new BossKengat();
	}

}
