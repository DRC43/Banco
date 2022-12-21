package ClassesOrientadaObjetos;

public class banco {
        private String conta;
        private double saldoAtual;
        private double saldo;
        private double debito;
        private double credito;

        public String getConta() {
            return conta;
        }

        public void setConta(String conta) {
            this.conta = conta;
        }

        public double getSaldoAtual() {
            return saldoAtual;
        }

        public void setSaldoAtual(double saldoAtual) {
            this.saldoAtual = saldoAtual;
        }

        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public double getDebito() {
            return debito;
        }
        public void setDebito(double debito) {
            this.debito = debito;
        }
        public double getCredito() {
            return credito;
        }
        public void setCredito(double credito) {
            this.credito = credito;
        }
        public double calcular(){
            saldoAtual = saldo - debito + credito;
            return saldoAtual;
        }
}
