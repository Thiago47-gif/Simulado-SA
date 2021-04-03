package FabricaDeMascaras;

public class Fornecedor extends Materiais {
	
	public double PrecoTNT = 149.90; 
	public double PrecoSMS = 169.90;
	public double PrecoClipNasal = 79.90;
	public double PrecoCaixaUnidade = 99.90;
	public double PrecoCaixaElastico = 39.90;
	public double PrecoCaixaMaster = 29.90;
	
	
	//Método Get
	public double getPrecoTNT() {
		return PrecoTNT;
	}


	public double getPrecoSMS() {
		return PrecoSMS;
	}


	public double getPrecoClipNasal() {
		return PrecoClipNasal;
	}
 

	public double getPrecoCaixaUnidade() {
		return PrecoCaixaUnidade;
	}


	public double getPrecoCaixaElastico() {
		return PrecoCaixaElastico;
	}


	public double getPrecoCaixaMaster() {
		return PrecoCaixaMaster;
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
