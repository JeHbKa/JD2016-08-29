package by.it.sukora.jd1_08._07_Finalize;

/**
 * Created by Alex on 16.02.2016.
 */
public class Runner {
        public static void main(String[] args) {
            Manager d1 = new Manager(1);
            d1 = null;
            Manager d2 = new Manager(2);
            Object d3 = d2; // 1
            // Object d3 = new Manager (3); // 2
            d2 = d1;
            // просьба выполнить "сборку мусора"
            System.gc();
        }
    }