package tp2;

public class TemperatureController {

	private TemperatureModel model ;
	private TemperatureVue view = null ;
	private ModifieTemperature modtemp = new ModifieTemperaturePlus1();
	
	public TemperatureController ( TemperatureModel m) {
		model = m;
	}
	public void augmenteDegresC (){
		model.setC ( modtemp . augmenteDegres ( model . getC ()));
		control ();
	}
	public void diminueDegresC (){
		model.setC ( modtemp . diminueDegres (model.getC()));
		control ();
	}
	public void fixeDegresC ( double tempC ){
		model.setC ( tempC );
		control ();
	}
	public void augmenteDegresF (){
		model.setF ( modtemp . augmenteDegres ( model . getF ()));
		control ();
	}
	public void diminueDegresF (){
		model.setF ( modtemp . diminueDegres ( model . getF ()));
		control ();
	}
	public void fixeDegresF ( double tempF ){
		model.setF (tempF);
		control ();
	}
	public void control () {
		if ( view != null ) {
			if ( model.getC () > 40.0) {
				view.enableWarningColor ();
			} else if ( model.getC () <= 0.0) {
				view.enableWarningColor2 ();
			} else {
				view .disableWarningColor ();
			}
		}
	}
	public void addView ( TemperatureVue view ) {
		this . view = view ;
	}
	
}

