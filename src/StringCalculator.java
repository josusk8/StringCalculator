public class StringCalculator {


    public int sum(String data) throws IllegalArgumentException {
        int result = 0;
        String sequence = data;

        if (data.isEmpty()) {
            return 0;
        }

        String regex = ",|\\n";
        if (data.startsWith("//")) {
            String[] splitSequence = data.split("\n", 2);
            sequence = splitSequence[1];
            regex = splitSequence[0].substring(2);
            regex = regex.replace("[", "");
            regex = regex.replace("]", "");
        }

        String[] numbers = sequence.split(regex);
        findNegatives(numbers);
        for (String number : numbers) {
            int parseNumber = Integer.parseInt(number);

            if (parseNumber > 1000) {
                parseNumber = 0;
            }
            result += parseNumber;
        }

        return result;
    }

    private void findNegatives(String[] numbers) {
        String negatives = "";
        String mesageException = "negatives not allowed";

        for (String number : numbers) {
            if (number.contains("-")) {
                negatives += " " + number;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException(mesageException + ":" + negatives);
        }
    }


}
