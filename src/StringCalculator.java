public class StringCalculator {


    static int calculate(String raw) {

        int result = 0;
        if (raw.equals("") || raw.matches("[A-Za-z]")) {
            return result;
        }

        String[] split1 = raw.split("");
        String separator = ",";
        int size = raw.length();


        if ("/".equals(split1[0]) && "/".equals(split1[1]) && "\n".equals(split1[3])) {
            separator = split1[2];
            System.out.println("Separador: " + separator);
            raw = raw.substring(4, size);
            System.out.println("Raw: " + raw);
        }

        String[] splited = raw.split("[" + separator + "|\n]");

        for (String split : splited) {
            result += Integer.parseInt(split);
        }


        return result;
    }
}
