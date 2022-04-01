public class StringCalculator {


    static int calculate(String input) {

        String[] split1 = input.split("");
        if("/".equals(split1[0]) && "/".equals(split1[1]) && "\\".equals(split1[4]) && "n".equals(split1[5])){
            String separator = split1[2];
        }


        int result = 0;

        if (input.equals("") || input.matches("[A-Za-z]")) {
            return result;
        }

        boolean containsComma = input.contains(",");
        boolean containsJumpsLine = input.contains("\n");

        if (containsComma || containsJumpsLine ) {
            String[] splited = input.split("[,|\n]");

            for(String split:splited){
                result += Integer.parseInt(split);
            }

        } else {
            result = Integer.parseInt(input);
        }


        return result;
    }


}
