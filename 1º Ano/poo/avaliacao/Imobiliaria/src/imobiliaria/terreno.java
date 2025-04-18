package imobiliaria;

     class terreno extends imovel {
        public String type;
        
        public terreno(String morada, double preço, double area, String type){
            super(morada, preço, area);
            if (type.equals("urbano") || type.equals("rustico")) {
                this.type = type;
            } else {
                throw new IllegalArgumentException("Tipo inválido de terreno");
            }
        }

        public String getType(){
            return this.type;
        }

        public String setType(String newType){
            return this.type = newType;
        }
        

        @Override
        public String toString(){
            return super.toString() + "; Tipo de terreno (urbano ou rustico): " + type;
        }

}
