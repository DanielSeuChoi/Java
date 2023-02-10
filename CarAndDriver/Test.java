import java.sql.DriverPropertyInfo;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // Car chevy = new Car();
        // System.out.printf("Remaining gas %s", chevy.getGas());

        Driver driver = new Driver();

        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();

        driver.boost();

        driver.refuel();
        driver.refuel();
        driver.refuel();
    }
}