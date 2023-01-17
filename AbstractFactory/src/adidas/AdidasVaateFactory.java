package adidas;
import main.*;
public class AdidasVaateFactory implements VaateFactory {

	@Override
	public Farmarit createFarmarit() {
		// TODO Auto-generated method stub
		return new AdidasFarmarit();
	}

	@Override
	public TPaita createTPaita() {
		// TODO Auto-generated method stub
		return new AdidasTPaita();
	}

	@Override
	public Lippis createLippis() {
		// TODO Auto-generated method stub
		return new AdidasLippis();
	}

	@Override
	public Kengat createKengat() {
		// TODO Auto-generated method stub
		return new AdidasKengat();
	}

}
