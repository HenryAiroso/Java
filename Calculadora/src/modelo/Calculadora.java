package modelo;

public class Calculadora
{

    public enum OPERACAO
        {
            ADICAO('+'),
            SUBTRACAO('-'),
            DIVISAO('/'),
            MULTIPLICACAO('*');

            private final char operacaoEscolhida;

            OPERACAO(char operacaoEscolhida)
            {
                this.operacaoEscolhida = operacaoEscolhida;
            }

            public static OPERACAO getOperacaoEscolhidaParaChar(final char operacaoEscolhida)
            {
                for (OPERACAO tipoDeOperacaoMatematica : OPERACAO.values())
                {
                    if (tipoDeOperacaoMatematica.operacaoEscolhida == operacaoEscolhida)
                    {
                        return tipoDeOperacaoMatematica;
                    }
                }
            return null;
            }
        }

        private double          operador1;
        private double          operador2;
        private OPERACAO        operacaoSelecionada;

        public Calculadora()
        {
            operador2 = 0.0;
            operador1 = 0.0;
        }

        public void setOperacao(OPERACAO operacaoSelecionada)
        {
            this.operacaoSelecionada = operacaoSelecionada;
        }

        public void setOperador1(double operador1)
        {
            this.operador1 = operador1;
        }

        public void setOperador2(double operador2)
        {
            this.operador2 = operador2;
        }

    public double calcular()
        {
        return switch (operacaoSelecionada)
                {
                    case ADICAO -> operador1 + operador2;
                    case SUBTRACAO -> operador1 - operador2;
                    case MULTIPLICACAO -> operador1 * operador2;
                    case DIVISAO -> operador1 / operador2;
                };
        }
}
