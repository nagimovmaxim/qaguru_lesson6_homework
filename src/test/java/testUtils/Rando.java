package testUtils;

import net.datafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Rando {

    public static String getLetterString(int length) throws Exception {
        try {
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                stringBuilder.append((char) ('A' + ThreadLocalRandom.current().nextInt(26)));
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getNumericString(int length) throws Exception {
        try {
            StringBuilder stringBuilder = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                stringBuilder.append((char) ('0' + ThreadLocalRandom.current().nextInt(10)));
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getFullName() throws Exception {
        try {
            Faker faker = new Faker();
            return faker.name().firstName() + " " + faker.name().lastName();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getFirstName() throws Exception {
        try {
            Faker faker = new Faker();
            return faker.name().firstName();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getLastName() throws Exception {
        try {
            Faker faker = new Faker();
            return faker.name().lastName();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getEmail() throws Exception {
        try {
            Faker faker = new Faker();
            return faker.internet().emailAddress();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getOneOf(String... items) throws Exception {
        try {
            int index = ThreadLocalRandom.current().nextInt(0, items.length);
            return items[index];
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getOneOf(Map<String, String[]> map) throws Exception {
        try {
            List<String> keys = new ArrayList<>(map.keySet());
            String randomKey = keys.get(ThreadLocalRandom.current().nextInt(keys.size()));
            String randomValue = getOneOf(map.get(randomKey));
            return randomKey + " " + randomValue;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getDateByFormat(String format, int yearLeft, int yearRight) throws Exception {
        try {
            long startEpochDay = LocalDate.of(yearLeft, 1, 1).toEpochDay();
            long endEpochDay = LocalDate.of(yearRight, 1, 1).toEpochDay();
            long randomDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay);
            LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format, new Locale("en", "EN"));
            return randomDate.format(formatter);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String getAddress() throws Exception {
        try {
            Faker faker = new Faker();
            return faker.address().fullAddress();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}