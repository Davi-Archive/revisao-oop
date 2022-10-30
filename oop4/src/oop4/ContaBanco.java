package oop4;

public class ContaBanco {
	public int numConta;
	protected String tipo; // cc , cp
	private String dono;
	private float saldo;
	private Boolean status; // aberto ou fechado

	public ContaBanco(int numConta, String dono) {
		super();
		this.saldo = 0; // conta saldo de zero
		this.status = false; // conta começa fechada
		this.numConta = numConta;
		this.dono = dono;
	}

	public void estadoAtual() {
		System.out.println("Numero da conta é " + getNumConta());
		System.out.println("A conta é do tipo " + getTipo());
		System.out.println("O dono da conta é " + getDono());
		System.out.println("O saldo da conta é " + getSaldo());
		System.out.println("A conta está aberta? " + getStatus());
		System.out.println(" ");
	}

	public void abrirConta(String tipo) {
		setTipo(tipo);
		if (this.getTipo().equalsIgnoreCase("cp")) {
			saldo += 150;
			setStatus(true);
		} else if (this.getTipo().equalsIgnoreCase("cc")) {
			saldo += 50;
			setStatus(true);
		} else {
			System.out.println("A conta pode ser 'cp' ou 'cc'");
		}
	}

	public void fecharConta() {
		if (this.saldo > 0) {
			System.out.printf("Você ainda tem saldo na conta saque R$%f para fechar a conta.", this.saldo);
		} else if (this.saldo < 0) {
			System.out.printf("Não é possível fechar uma conta com débito %f", this.saldo);
		} else {
			this.status = false;
			System.out.printf("Conta fechada com sucesso.");
		}

	}

	public void depositar(float deposito) {
		if (!this.status) {
			System.out.println("A conta está fechada, para depositar abra a conta");
		} else {
			this.saldo += deposito;
		}

	}

	public void sacar(float sacar) {
		if (!this.status) {
			System.out.println("A conta está fechada, para depositar abra a conta");
		} else {
			if (saldo < sacar) {
				System.out.printf("Saque falhou, Você tem %f na conta.", this.saldo);
			} else {
				this.saldo -= sacar;
			}
		}
	}

	public void pagarMensal() {
		if (this.status) {

			if (this.tipo == "cc") {
				if (this.saldo < 12) {
					System.out.printf("Saldo insuficiente para pagar a conta. Saldo atual:", this.saldo);
				} else {
					this.saldo -= 12;
					System.out.printf("Conta corrente paga com sucesso. Saldo Atual %f", this.saldo);
				}

			}
			if (this.tipo == "cp") {
				if (this.saldo < 20) {
					System.out.printf("Saldo insuficiente. saldo atual %f", this.saldo);
				} else {
					this.saldo -= 20;
					System.out.printf("Conta poupança paga com sucesso. Saldo Atual %f", this.saldo);
				}

			} else {
				System.out.printf("A conta não tinha um tipo e foi definido o tipo poupança.");
			}
		} else {
			System.out.println("A conta não está aberta.");
		}
	}

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
