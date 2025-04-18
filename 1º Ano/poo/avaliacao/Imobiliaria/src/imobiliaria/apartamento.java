package imobiliaria;

    class apartamento extends imovel{
        public int nquartos;

        public apartamento(String morada, double preço, double area, int nquartos){
            super(morada, preço, area);
            this.nquartos = nquartos;

            //Fazer validator no fim
        }

        public int getQuartos(){
            return this.nquartos;
        }

        public int setQuartos(int newQuartos2){
            return this.nquartos = newQuartos2;
        }

        @Override
        public String toString(){
            return super.toString() + "; Nº de Quartos: " + this.nquartos;
        }

}
