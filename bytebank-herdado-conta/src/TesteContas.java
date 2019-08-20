
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 1000);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(222, 2000);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("Cp: " + cp.getSaldo());
	}

}
