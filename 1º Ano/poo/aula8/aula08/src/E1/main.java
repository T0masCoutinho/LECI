package E1;

public class main {
    public static void main(String[] args) {
        empreza empresa = new empreza("Farmacos LTD", "1121-234", "Farmacos@gmail.com");
        System.out.println(empresa);

        motociclo mota = new motociclo("20-30-AB", "Yamaha", "G3", 125, "Desportiva");
        System.out.println(mota);

        ligeiro ligeiro = new ligeiro("QWER", "null", "null", 30, 20, 10);
        System.out.println(ligeiro);

        carro Viatura = new carro("QWERT", "null", "null", 300);
        System.out.println(Viatura);

        pesadoMerc camiao = new pesadoMerc("FGHJ", "null", "null", 200, 40, 3000, 2000);
        System.out.println(camiao);

        pesadoPass autocarro = new pesadoPass("234567", "null", "null", 100, 30, 3000, 40);
        System.out.println(autocarro);

        taxi Taxi = new taxi("ABDE", "TAXI", "Amarelo", 200, 5, 10, 1221);
        System.out.println(Taxi);

        empresa.addVehiculo(mota, ligeiro, camiao, autocarro, Taxi);

        System.out.println("\n");

        for(carro vehiculo : empresa.getVehiculo()){
            System.out.println(vehiculo.toString());
        }

        carro VehiculoComMaisDistancia = null;
        for (carro vehiculo : empresa.getVehiculo()) {
            if (VehiculoComMaisDistancia == null) {
                VehiculoComMaisDistancia = vehiculo;
                System.out.println(VehiculoComMaisDistancia.getMarca());
            } else if (vehiculo.distanciaTotal() > VehiculoComMaisDistancia.distanciaTotal()) {
                VehiculoComMaisDistancia = vehiculo;
            }
        }

        System.out.println("Vehiculo com mais dist:" + VehiculoComMaisDistancia.toString());
    }

}
