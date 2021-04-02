package FabricaDeMascaras;

public class Estoque extends Materiais {

	
	private int QtdTNT;
	private int QtdSMS;
	private int QtdClipNasal;
	private int QtdCaixaElástico;
	private int QtdCaixaUnidade;
	private int QtdCaixaMaster;
	
	
	//Método Get e Set
	public int getQtdTNT() {
		return QtdTNT;
	}


	public void setQtdTNT(int qtdTNT) {
		QtdTNT = qtdTNT;
	}


	public int getQtdSMS() {
		return QtdSMS;
	}


	public void setQtdSMS(int qtdSMS) {
		QtdSMS = qtdSMS;
	}


	public int getQtdClipNasal() {
		return QtdClipNasal;
	}


	public void setQtdClipNasal(int qtdClipNasal) {
		QtdClipNasal = qtdClipNasal;
	}


	public int getQtdCaixaElástico() {
		return QtdCaixaElástico;
	}


	public void setQtdCaixaElástico(int qtdCaixaElástico) {
		QtdCaixaElástico = qtdCaixaElástico;
	}


	public int getQtdCaixaUnidade() {
		return QtdCaixaUnidade;
	}


	public void setQtdCaixaUnidade(int qtdCaixaUnidade) {
		QtdCaixaUnidade = qtdCaixaUnidade;
	}


	public int getQtdCaixaMaster() {
		return QtdCaixaMaster;
	}


	public void setQtdCaixaMaster(int qtdCaixaMaster) {
		QtdCaixaMaster = qtdCaixaMaster;
	}
	
	
	
	//Método Get da classe Materiais
	public int getTNT() {
		return TNT;
	}


	public int getSMS() {
		return SMS;
	}


	public int getClipNasal() {
		return ClipNasal;
	}


	public int getCaixaElástico() {
		return CaixaElástico;
	}


	public int getCaixaUnidade() {
		return CaixaUnidade;
	}


	public int getCaixaMaster() {
		return CaixaMaster;
	}



}
