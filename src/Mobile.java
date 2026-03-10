import java.time.LocalDate;

public class Mobile {
        private int id;
        private String brand;
        private String model;
        private LocalDate releaseDate;
        private double price;

        public Mobile(int id, String brand, String model, LocalDate releaseDate, double price) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.releaseDate = releaseDate;
            this.price = price;
        }


        // TODO: Add the required getters for the attributes


        @Override
        public String toString() {
            return "ID = " + id +  ", Brand = " + brand + ", Model = " + model +
                    ", Release Date =" + releaseDate + ", Price = " + price ;
        }
    }


