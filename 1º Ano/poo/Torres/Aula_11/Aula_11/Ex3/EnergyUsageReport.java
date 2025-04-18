package Aula_11.Ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class EnergyUsageReport {

    ArrayList<Customer> customers = new ArrayList<>();

    public ArrayList<Customer> load(String path) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                String[] data = line.split("\\|");
                int id = Integer.parseInt(data[0].trim());
                Double read1 = Double.parseDouble(data[1].trim());
                Double read2 = Double.parseDouble(data[2].trim());
                Double read3 = Double.parseDouble(data[3].trim());
                Double read4 = Double.parseDouble(data[4].trim());

                Customer student = new Customer(id, new ArrayList<>(List.of(read1, read2, read3, read4)));
                customers.add(student);

                line = reader.readLine();
            }
        }

        return customers;
    }

    public void addCustomer(Customer student) {
        customers.add(student);
    }

    public void removeCustomer(int id) {
        customers.removeIf(customer -> customer.getCustomerId() == id);
    }

    public Customer getCustomer(int id) {
        return customers.stream().filter(customer -> customer.getCustomerId() == id).findFirst()
                .orElse(null);
    }

    public double calculateTotalUsage(int id) {
        Customer customer = getCustomer(id);
        if (customer == null) {
            return 0;
        }

        List<Double> readings = customer.getMeterReadings();
        int sum = 0;
        for (Double reading : readings) {
            sum += reading;
        }

        return sum;

    }

    public void generateReport(String path) throws IOException {
        List<String> lines = new ArrayList<>();
        for (Customer customer : customers) {
            // lines.add(customer.toString() + "\n");
            lines.add(String.format("Customer ID: " + customer.getCustomerId() + " | Total Usage: "
                    + calculateTotalUsage(customer.getCustomerId()) + "\n"));
        }
        generateFile(lines, path);

    }

    public static void generateFile(List<String> data, String path) throws IOException {
        PrintWriter out = new PrintWriter(new File(path));
        out.print(data);
        out.close();
    }
}
