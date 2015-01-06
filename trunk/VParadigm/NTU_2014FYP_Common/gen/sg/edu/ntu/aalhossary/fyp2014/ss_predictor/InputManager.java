package sg.edu.ntu.aalhossary.fyp2014.ss_predictor;

import sg.edu.ntu.aalhossary.fyp2014.ss_predictor.PredictorController.InputMethodEnum;

public class InputManager {
	
	public PredictorController predControl = new PredictorController();
	public String fileContents = null;
	

	InputMethodEnum inputMethod;
	
	public InputMethodEnum getInputMethod() {
		return inputMethod;
	}

	public void setInputMethod(InputMethodEnum inputMethod) {
		//No need to check here till now. will check in next methods
		this.inputMethod = inputMethod;
	}
	




	
}