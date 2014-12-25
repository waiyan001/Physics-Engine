package sg.edu.ntu.aalhossary.fyp2014.common;

import java.util.ArrayList;

import org.biojava.bio.structure.Structure;

public class Model {

	protected String modelName = null;
	protected Structure structure;
	protected ArrayList<Molecule> molecules;
	
	public Model() {
		molecules = new ArrayList<Molecule>();
	}
	
	public ArrayList<Molecule> getMolecules() {
		return this.molecules;
	}

	public void setMolecule(org.biojava.bio.structure.Structure struc) {
		Molecule molecule;
		molecule = new Molecule();
		molecules.add(molecule);
		molecule.setName(struc.getPdbId());
		molecule.setChains(struc.getChains());
	}
	
	public void setModelName(String name){
		modelName = name;
	}

	public java.lang.String getModelName() {
		return this.modelName;
	}

	public Object[] getModelDetailList() {
		ArrayList<String> modelList = new ArrayList<String>();
		for(int i=0;i<molecules.size();i++){
			Molecule molecule = molecules.get(i);
			modelList.add(molecule.getName());
			for(int j=0;j<molecule.getChains().size();j++){
				Chain chain = molecule.getChains().get(j);
				modelList.add(chain.getName());
			}
		}
		return modelList.toArray();
	}

}