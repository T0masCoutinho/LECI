package imobiliaria;

    class casa extends imovel{
        public int quartos;
        public int pisos;

        public casa(String morada, double preço, double area, int quartos, int pisos){
        super(morada, preço, area);
        this.quartos = quartos;
        this.pisos = pisos;

        //Fazer validator no fim
        }

        public int getQuartos(){
        return this.quartos;
        }

        public int getPisos(){
            return this.pisos;
        }

        public int setQuartos(int newQuartos){
            return this.quartos = newQuartos;
        }

        private boolean validate(int quartos, int pisos) {
            if (quartos < 0 || pisos < 0)
                throw new IllegalArgumentException("Sides cannot be negative.");
            return true;
        }

        @Override
        public String toString(){
            return super.toString() + "; Nº de Quartos: " + this.quartos + "; Nº de Pisos: " + this.pisos;
        }
        
}
