package oop5;

public class BancoConta {
	public int numConta;
	protected String tipo; // cc , cp
	private String dono;
	private float saldo;
	private Boolean status; // aberto ou fechado

	public BancoConta() {
		this.saldo = 0; // conta saldo de zero
		this.status = false; // conta começa fechada
	}
	
	
	public void estadoAtual() {
		System.out.println(" ---------------------- ");
		System.out.println("Conta: "+this.getNumConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if ("CC" == tipo) {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
		System.out.printf("Conta de %s aberta com sucesso.%n", getDono());
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.printf("Você ainda tem saldo na conta saque R$%f para fechar a conta.", this.saldo);
		} else if (this.getSaldo() < 0) {
			System.out.printf("Conta tem débito. %f", this.saldo);
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}

	}

	public void depositar(float valor) {
		if (valor < 0 || getStatus() == false) {
			System.out.println("O valor precisa ser acima de zero e a conta deve estar aberta.");
		} else {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Deposito executado com sucesso na conta de " + this.getDono());
		}
	}

	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
			} else {
				System.out.println("Saldo insulficiente para o saque.");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada.");
		}
	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossível pagar mensalidade de uma conta fechada.");
		}
	}

	// metodos especiais

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
